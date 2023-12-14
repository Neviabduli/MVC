package Taschenrechner;


import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.layout.GridPane;

import javafx.stage.Stage;


public class Main extends Application {


    public static void main(String[] args) {

        launch(args);

    }


    @Override

    public void start(Stage primaryStage) {

        model model = new model();

        view view = new view(primaryStage, model);

        controller controller = new controller(model, view);

        view.start();

    }

}