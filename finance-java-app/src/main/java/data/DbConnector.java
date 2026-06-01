package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DbConnector {

    private static final String DRIVER = "org.postgresql.Driver";

    private DbConnector() {
    }

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException exception) {
            throw new ExceptionInInitializerError(
                    "PostgreSQL JDBC driver was not found"
            );
        }
    }

    public static Connection getConnection() throws SQLException {
        String host = EnvLoader.getOrDefault("DB_HOST", "localhost");
        String port = EnvLoader.getOrDefault("DB_PORT", "5432");
        String database = EnvLoader.getOrDefault("DB_NAME", "finance_app");
        String user = EnvLoader.get("DB_USER");
        String password = EnvLoader.get("DB_PASSWORD");
        String ssl = EnvLoader.getOrDefault("DB_SSL", "false");

        String url = String.format(
                "jdbc:postgresql://%s:%s/%s?ssl=%s",
                host,
                port,
                database,
                ssl
        );

        return DriverManager.getConnection(url, user, password);
    }
}
