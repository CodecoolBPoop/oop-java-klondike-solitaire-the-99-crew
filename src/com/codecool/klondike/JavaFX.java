package com.codecool.klondike;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.control.Button;
import javafx.geometry.Insets;


public class JavaFX {

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
}
