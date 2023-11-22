package org.example;

public class WithSingleton {

    // we will consider connection to a database
    private static WithSingleton instance;
    private String connectionString;
    private boolean connected;

    private WithSingleton(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false;
    }

    public static WithSingleton getInstance(String connectionString) {
        if (instance == null) {
            instance = new WithSingleton(connectionString);
        }
        return instance;
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
        WithSingleton dbConnection1 = WithSingleton.getInstance("mysql://user:password@localhost/db");
        WithSingleton dbConnection2 = WithSingleton.getInstance("postgres://user:password@localhost/db");

        dbConnection1.connect();  // Output: Connected to database with connection string: mysql://user:password@localhost/db
        dbConnection2.connect();  // Output: Already connected to the database
    }

}
