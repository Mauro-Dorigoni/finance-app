package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public final class EnvLoader {

    private static final Map<String, String> VALUES = new HashMap<>();
    private static boolean loaded = false;

    private EnvLoader() {
    }

    public static String get(String key) {
        loadIfNeeded();

        String systemValue = System.getenv(key);
        if (systemValue != null && !systemValue.isBlank()) {
            return systemValue;
        }

        return VALUES.get(key);
    }

    public static String getOrDefault(String key, String defaultValue) {
        String value = get(key);

        if (value == null || value.isBlank()) {
            return defaultValue;
        }

        return value;
    }

    private static synchronized void loadIfNeeded() {
        if (loaded) {
            return;
        }

        String customEnvPath = System.getProperty("finance.env.path");
        Path envPath = customEnvPath == null || customEnvPath.isBlank()
                ? Path.of(".env")
                : Path.of(customEnvPath);

        if (Files.exists(envPath)) {
            loadFile(envPath);
        }

        loaded = true;
    }

    private static void loadFile(Path envPath) {
        try (BufferedReader reader = Files.newBufferedReader(envPath)) {
            String line;

            while ((line = reader.readLine()) != null) {
                parseLine(line);
            }
        } catch (IOException exception) {
            throw new IllegalStateException("Could not load environment file", exception);
        }
    }

    private static void parseLine(String line) {
        String trimmedLine = line.trim();

        if (trimmedLine.isEmpty() || trimmedLine.startsWith("#")) {
            return;
        }

        int separatorIndex = trimmedLine.indexOf("=");

        if (separatorIndex <= 0) {
            return;
        }

        String key = trimmedLine.substring(0, separatorIndex).trim();
        String value = trimmedLine.substring(separatorIndex + 1).trim();

        VALUES.put(key, removeQuotes(value));
    }

    private static String removeQuotes(String value) {
        if (
                value.length() >= 2
                        && value.startsWith("\"")
                        && value.endsWith("\"")
        ) {
            return value.substring(1, value.length() - 1);
        }

        return value;
    }
}