package Taschenrechner;


import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.layout.GridPane;

import javafx.stage.Stage;


public class view {

    private final Stage primaryStage;

    protected Label lblNumber;

    protected Button btnPlus;


    protected view(Stage primaryStage, model model) {

        this.primaryStage = primaryStage;

        primaryStage.setTitle("Taschenrechner");

        GridPane pane = new GridPane();

        lblNumber = new Label();

        lblNumber.setText(Integer.toString(model.getValue()));

        pane.add(lblNumber, 0, 0);

        btnPlus = new Button();

        btnPlus.setText("+");

        pane.add(btnPlus, 0, 1);

        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);

    }


    public void start() {

        primaryStage.show();

    }

}