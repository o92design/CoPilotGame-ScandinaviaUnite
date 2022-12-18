package com.o92design.scandi.graphics;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FjordMotorn är spelmotorns grafiska del.
 * Den tillhandahåller all grafik och animationer.
 * Den är också ansvarig för att skapa och uppdatera
 * grafiska objekt.
 * <p>
 * 
 * Fjordmotorn har även hand om spelets fönster samt GUI.
 */
public class FjordMotorn {
    public Stage stage; // Fönster
    public Scene scene; // Scenen

    public void Initialize(Stage arg0) throws Exception {
        // Skapa fönster för spelet
        stage = new Stage();
        stage.setTitle(FjordGrafik.TITLE);
        stage.setWidth(FjordGrafik.WIDTH);
        stage.setHeight(FjordGrafik.HEIGHT);
        stage.setResizable(false);

        // Skapa scenen
        scene = new Scene(new Group(), FjordGrafik.WIDTH, FjordGrafik.HEIGHT);
        stage.setScene(scene);

        stage.show();
    }

    public void Clear() {
        // TODO: Rensa grafiska objekt
    }

    public void Update() {
        // TODO: Uppdatera grafiska objekt
    }

    public void Render() {
        // TODO: Rita ut grafiska objekt
    }

    public void AddObject() {
        // TODO: Lägg till grafiska objekt
    }
}
