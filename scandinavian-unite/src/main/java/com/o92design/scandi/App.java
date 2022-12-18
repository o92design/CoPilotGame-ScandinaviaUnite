package com.o92design.scandi;

import com.o92design.scandi.graphics.FjordGrafik;
import com.o92design.scandi.graphics.FjordMotorn;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    FjordMotorn fjord;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage scene) throws Exception {
        fjord = new FjordMotorn();

        FjordGrafik.TITLE = "CoPilotGame - Skandinaviska Enandet";
        fjord.Initialize(scene);
    }

}