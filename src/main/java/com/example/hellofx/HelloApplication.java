package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class HelloApplication extends Application {
    //Child class HelloApplication is going to inherit everything Application (parent) class has
    public static void main(String[] args) {
        launch(args); // static method that we inherit from Application (parent) class. Send our String array of arguments to the launch method

    }

    @Override
    public void start(Stage stage) throws Exception {

        //Create Own Stage
        //Stage stage = new Stage();

        //Create Group Node (allows grouping of nodes instead of adding individual nodes)
        Group root = new Group();
        //Create a Scene to add Graphical content to the stage
        //Add root node to scene
        Scene scene = new Scene(root, Color.BLACK);

        //Input image through input stream that asks for absolute path
        InputStream stream = new FileInputStream("C:\\LinkedIn Projects\\HelloFx\\src\\SarahBitMoji.png");
        Image icon = new Image(stream);
        stage.getIcons().add(icon);
        stage.setTitle("Sarah's Stage");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
//        stage.setX(50);
//        stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You can't leave unless you press S");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("s"));

        //Add scene to stage
        stage.setScene(scene);
        stage.show();//Show's new window with stage


    }
}
