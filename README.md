# Finance Java App

Finance Java App is a Java web application for managing personal finances. The application is designed to help users track income, expenses, fixed expenses, subscriptions, accounts, currencies, and currency conversions from a centralized web interface.

The project is built with a classic Java web stack using JSPs, Servlets, JDBC, PostgreSQL, and Apache Tomcat. The goal is to keep the application close to vanilla Java while still following a clean layered architecture.

## Repository

```bash
git clone https://github.com/Mauro-Dorigoni/finance-app.git
cd finance-app/finance-java-app
```

## Features

The application is intended to support the following core features:

* Personal account management
* Income tracking
* Expense tracking
* Fixed expense and subscription tracking
* Income and expense categorization
* Multi-currency support
* Currency conversion history
* Personal finance dashboard
* Monthly income and expense summaries
* Account balance tracking

## Tech Stack

This project uses a lightweight Java web stack:

* Java 21
* Jakarta Servlets
* JSP
* Apache Tomcat 10.1
* PostgreSQL
* JDBC
* HTML
* CSS
* JavaScript
* Eclipse IDE

## Project Structure

```text
finance-app/
└── finance-java-app/
    ├── src/
    │   └── main/
    │       ├── java/
    │       │   └── com/
    │       │       └── financeapp/
    │       │           ├── servlets/
    │       │           ├── services/
    │       │           ├── repositories/
    │       │           ├── models/
    │       │           └── config/
    │       └── webapp/
    │           ├── index.jsp
    │           ├── assets/
    │           │   ├── css/
    │           │   └── js/
    │           └── WEB-INF/
    │               └── web.xml
    └── README.md
```

## Requirements

Before running the project, make sure you have the following installed:

* JDK 21
* Eclipse IDE for Enterprise Java and Web Developers
* Apache Tomcat 10.1
* PostgreSQL
* Git

## Local Setup

### 1. Clone the repository

```bash
git clone https://github.com/Mauro-Dorigoni/finance-app.git
cd finance-app/finance-java-app
```

### 2. Import the project into Eclipse

Open Eclipse and import the project:

```text
File > Import > Existing Projects into Workspace
```

Select the `finance-java-app` folder and finish the import process.

### 3. Configure the JDK

Make sure Eclipse is using JDK 21:

```text
Window > Preferences > Java > Installed JREs
```

Add the JDK if needed and select it as the default runtime.

Example JDK path on Windows:

```text
C:\jdk-21.0.11+10
```

### 4. Configure Tomcat

Add Apache Tomcat 10.1 as a server runtime:

```text
Window > Preferences > Server > Runtime Environments
```

Select the Tomcat installation directory.

Example:

```text
C:\apache-tomcat-10.1.55
```

### 5. Configure PostgreSQL

Create a PostgreSQL database for the application.

Example:

```sql
CREATE DATABASE finance_app;
```

Database connection settings should be configured in the application configuration layer.

Recommended environment variables:

```text
DB_HOST=localhost
DB_PORT=5432
DB_NAME=finance_app
DB_USER=postgres
DB_PASSWORD=your_password
```

## Database Model

The application database is planned around the following main entities:

```text
User
IncomeCategory
ExpenseCategory
Currency
CurrencyConversion
Account
FixedExpense
FixedExpenseCost
Income
Expense
```

### Entity Overview

#### User

Represents an application user.

A user owns accounts, income records, expenses, fixed expenses, and categories.

#### IncomeCategory

Represents a category used to classify income records.

Examples:

```text
Salary
Freelance
Investments
Refunds
Other
```

#### ExpenseCategory

Represents a category used to classify expense records.

Examples:

```text
Food
Rent
Transport
Health
Entertainment
Utilities
Other
```

#### Currency

Represents a currency supported by the application.

Examples:

```text
ARS
USD
EUR
BRL
```

#### CurrencyConversion

Stores exchange rates between currencies.

This allows the application to track historical conversions and calculate values across different currencies.

#### Account

Represents a financial account owned by a user.

Examples:

```text
Cash
Bank account
Credit card
Digital wallet
Investment account
```

#### FixedExpense

Represents a recurring expense or subscription.

Examples:

```text
Rent
Internet
Gym
Streaming service
Insurance
```

#### FixedExpenseCost

Stores the historical or scheduled cost of a fixed expense.

This allows the application to track changes in recurring payments over time.

#### Income

Represents a money inflow associated with a user, account, category, currency, and date.

#### Expense

Represents a money outflow associated with a user, account, category, currency, and date.

## Suggested Application Layers

The project follows a simple layered architecture:

```text
Servlets       -> Handle HTTP requests and responses
Services       -> Contain business logic
Repositories   -> Handle PostgreSQL access through JDBC
Models         -> Represent application data
JSPs           -> Render the user interface
```

## Suggested Routes

Planned application routes may include:

```text
/dashboard
/accounts
/income
/income/categories
/expenses
/expenses/categories
/fixed-expenses
/currencies
/currency-conversions
```

## Running the Application

Open the Servers view in Eclipse:

```text
Window > Show View > Servers
```

Add the project to Tomcat and start the server.

The application should be available at:

```text
http://localhost:8080/finance-java-app/
```

## Development Notes

This project avoids heavy frameworks in order to keep the codebase close to standard Java web development.

The main development goals are:

* Keep the code simple and readable
* Use plain Java whenever possible
* Use Servlets as HTTP controllers
* Use JSPs for server-rendered views
* Use JDBC for database access
* Keep business logic outside Servlets
* Keep SQL access inside repository classes
* Use PostgreSQL as the main database

## Future Improvements

Planned improvements may include:

* User authentication
* Dashboard with monthly summaries
* Income vs expense charts
* Account balance history
* Recurring expense alerts
* Currency conversion automation
* CSV export
* Budget limits by category
* Responsive UI
* Unit and integration tests
* Database migration scripts

## License

This project is intended for personal learning and portfolio purposes.

A license can be added later depending on the intended distribution.
