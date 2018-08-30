package com.codecool.klondike;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.application.Platform;
import javafx.scene.control.SeparatorMenuItem;

public class Klondike extends Application {




    public static void main(String[] args) {
        launch(args);
    }


    public static void startGame(Stage primaryStage) {
        Card.loadCardImages();
        Game game = new Game();
        JavaFX.addMenu(game, primaryStage);
    }

    public static void restartGame(Stage primaryStage){
        Card.loadCardImages();
        Game newGame = new Game();
        JavaFX.addMenu(newGame, primaryStage);
    }

    @Override
    public void start(Stage primaryStage) {
        startGame(primaryStage);
    }

}
