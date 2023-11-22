package org.example;

// Example without using design pattern
public class WithoutSingleton {
    private String connectionString;
    private boolean connected;

    public WithoutSingleton(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false;
    }

    public void connect() {
        if (!connected) {
            System.out.println("Connected to database with connection string: " + connectionString);
            connected = true;
        } else {
            System.out.println("Already connected to the database");
        }
    }

    public static void main(String[] args) {
        WithoutSingleton nonSingletonDbConnection1 =
                new WithoutSingleton("mysql://user:password@localhost/db");
        WithoutSingleton nonSingletonDbConnection2 =
                new WithoutSingleton("postgres://user:password@localhost/db");

        nonSingletonDbConnection1.connect();  // Output: Connected to database with connection string: mysql://user:password@localhost/db
        nonSingletonDbConnection2.connect();  // Output: Connected to database with connection string: postgres://user:password@localhost/db
    }
}

