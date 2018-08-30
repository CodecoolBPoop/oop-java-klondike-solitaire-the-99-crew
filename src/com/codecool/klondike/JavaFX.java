package com.codecool.klondike;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.geometry.Insets;

import java.util.Arrays;


public class JavaFX {

    private static final double WINDOW_WIDTH = 1400;
    private static final double WINDOW_HEIGHT = 900;


    public static void displayWinWindow() {
        Stage winStage = new Stage();
        winStage.initStyle(StageStyle.UNDECORATED);
        winStage.initModality(Modality.WINDOW_MODAL);

        VBox winBox = new VBox();
        winBox.getChildren().add(new Label("Congratulations! You won!!\n\n"));
        winBox.setPadding(new Insets(60, 0, 50, 70));
        winBox.setSpacing(10);
        Scene winScene = new Scene(winBox, 300, 150);

        Button okButton = new Button();
        okButton.setText("OK");
        okButton.setOnAction(value ->  {
            Platform.exit();
        });
        winBox.getChildren().add(okButton);

        winStage.setTitle("Winner!!!");
        winStage.setScene(winScene);
        winStage.show();
    }

    public static void addMenu(Game game, Stage primaryStage) {
        BorderPane root = new BorderPane(game);
        Scene scene =  new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
        scene.setRoot(root);
        game.setTableBackground(new Image("/table/green.png"));
        MenuBar menuBar = new MenuBar();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menuBar);

        Menu fileMenu = new Menu("File");
        MenuItem newMenuItem = new MenuItem("New Game");
        MenuItem exitMenuItem = new MenuItem("Exit");
        exitMenuItem.setOnAction(ActionEvent -> Platform.exit());
        newMenuItem.setOnAction( e ->
        {
            primaryStage.hide();
            Game.tableauPiles.clear();
            Game.foundationPiles.clear();
            Klondike.restartGame(primaryStage);

        } );

        fileMenu.getItems().addAll(newMenuItem, new SeparatorMenuItem(), exitMenuItem);

        menuBar.getMenus().addAll(fileMenu);

        primaryStage.setTitle("Klondike Solitaire");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
