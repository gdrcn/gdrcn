package com.gdrcn.ui;

import com.gdrcn.util.DragUtil;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
        bottomPane.setPrefWidth(553.0);
        bottomPane.setPrefHeight(100);

        BorderPane bor = new BorderPane();
        bor.setStyle("-fx-background-color: black");

        FlowPane contentFlowPane = new FlowPane();
        contentFlowPane.setPrefWidth(553.0);
        contentFlowPane.setPrefHeight(319.0);
        contentFlowPane.setStyle("-fx-background-color: white");

        TextField usernameText = new TextField("111");
        PasswordField passwordField = new PasswordField();

        FlowPane functionList = new FlowPane();
        Label forgetPassword = new Label("forgetPassword");
        functionList.getChildren().addAll(forgetPassword);



        Button loginButton = new Button("登陆");

        AnchorPane loginGroup = new AnchorPane();
        loginGroup.setStyle("-fx-background-color: pink;" + "-fx-alignment: center-right ");
        loginButton.setLayoutX(175);
        loginGroup.getChildren().addAll(loginButton);


        contentFlowPane.setAlignment(Pos.CENTER);
        contentFlowPane.setOrientation(Orientation.VERTICAL);

        FlowPane.setMargin(usernameText, new Insets(10));
        FlowPane.setMargin(passwordField, new Insets(10));
        FlowPane.setMargin(functionList, new Insets(10));
        FlowPane.setMargin(loginGroup, new Insets(10));

        contentFlowPane.getChildren().addAll(usernameText, passwordField, functionList, loginGroup);

        bottomPane.getChildren().addAll(contentFlowPane);

        bor.setTop(topPane);
        bor.setBottom(bottomPane);



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
