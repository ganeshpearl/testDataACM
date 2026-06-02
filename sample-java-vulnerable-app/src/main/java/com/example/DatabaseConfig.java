package com.example;

public class DatabaseConfig {

    private String jdbcUrl =
            "jdbc:mysql://localhost:3306/sampledb";

    private String username = "root";

    private String password = "Root@123";

    public String getPassword() {
        return password;
    }
}
