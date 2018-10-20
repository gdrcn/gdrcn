package com.gdrcn.ui;

import com.gdrcn.util.DragUtil;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class LoginUi extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button minButton = new Button("", new ImageView("ui/png/min.png"));
        minButton.setOpacity(0.2);
        Button closeButton = new Button("", new ImageView("ui/png/close.png"));
        closeButton.setOpacity(0.2);

        FlowPane title = new FlowPane();
        title.setPrefWidth(553.0);
        title.setPrefHeight(35.0);
        title.setStyle("-fx-background-color: blue");
        title.setAlignment(Pos.TOP_RIGHT);
        title.setOrientation(Orientation.HORIZONTAL);
        title.getChildren().addAll(minButton, closeButton);

        AnchorPane topPane = new AnchorPane();
        topPane.setStyle("-fx-background-color: yellow");
        topPane.setPrefWidth(553.0);
        topPane.setPrefHeight(168.0);
        topPane.getChildren().addAll(title);

        AnchorPane bottomPane = new AnchorPane();
        bottomPane.setPrefWidth(100);
        bottomPane.setPrefHeight(100);

        BorderPane bor = new BorderPane();
        bor.setStyle("-fx-background-color: white");

        bor.setTop(topPane);
        bor.setBottom(bottomPane);

        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-background-color: black");

        Scene scene = new Scene(bor);
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setWidth(553.0);
        primaryStage.setHeight(419.0);
        primaryStage.setResizable(false);

        primaryStage.show();

        DragUtil.addDragListener(primaryStage, title);
        minButton.setOnAction(event -> primaryStage.setIconified(true));
        closeButton.setOnAction(event -> primaryStage.close());


    }
}
