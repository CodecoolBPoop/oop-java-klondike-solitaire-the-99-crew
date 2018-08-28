package com.codecool.klondike;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.util.concurrent.TimeUnit;




public class JavaFX {

    public static void displayWinWindow() {
        Stage winStage = new Stage();
        winStage.initStyle(StageStyle.UNDECORATED);
        winStage.initModality(Modality.WINDOW_MODAL);
        VBox winBox = new VBox();
        winBox.getChildren().add(new Label("\n\n\n\n          Congratulations! You won!!"));
        Scene winScene = new Scene(winBox, 250, 150);
        winStage.setTitle("Winner!!!");
        winStage.setScene(winScene);
        winStage.show();
    }

    public static void waitAndQuit(){
        try {
            TimeUnit.SECONDS.sleep(3); // other option -> Thread.sleep(3000);
        } catch (Exception InterruptedException){}
        Platform.exit();
    }


}
