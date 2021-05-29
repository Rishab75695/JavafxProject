module JavaFxEmailClient {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.web;
    requires activation;
    requires java.mail;
    requires java.desktop;

    opens com.example;
    opens com.example.view;
    opens com.example.controller;
    opens com.example.model;
}