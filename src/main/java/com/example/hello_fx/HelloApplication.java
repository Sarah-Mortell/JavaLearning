package com.example.hello_fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

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
        Scene scene = new Scene(root, 600, 900, Color.BLACK);
        Text text = new Text();
        text.setText("Justin Bieber - Baby \n\nYou know you love me! \nI know you care! \nJust shout whenever,\nAnd i'll be there! \nYou are my love! " +
                "\nYou are my heart! \nAnd we will never, ever, ever be apart! \nAre we an item? \nGirl, quit playin' \nWe're just friends, what are you sayin'?" +
                "\nSaid, There's another, and looked right in my eyes! \nMy first love broke my heart for the first time, and I was like \nBaby, baby, baby,oh! " +
                        "\nLike baby, baby , baby, no! \nLike, baby, baby, baby oh, \nI thought you'd always be mine!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 22));
        text.setFill(Color.WHITE);

        Line line = new Line();
        line.setStartX(50);
        line.setStartY(60);
        line.setEndX(275);
        line.setEndY(60);
        line.setStrokeWidth(3);
        line.setStroke(Color. WHITESMOKE);
        line.setOpacity(0.75);

        Image image = new Image("C:\\LinkedIn Projects\\Hello_FX\\src\\JustinBieberBaby.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setX(560);
        imageView.setY(30);

//        Rectangle rectangle = new Rectangle();
//        rectangle.setX(540);
//        rectangle.setY(25);
//        rectangle.setWidth(700);
//        rectangle.setHeight(450);
//        rectangle.setStroke(Color.WHITESMOKE);


        //Input image through input stream that asks for absolute path
        InputStream stream = new FileInputStream("C:\\LinkedIn Projects\\Hello_FX\\src\\SarahBitMoji.png");
        Image icon = new Image(stream);

        stage.getIcons().add(icon);
        stage.setTitle("Sarah's Stage");
        stage.setWidth(900);
        stage.setHeight(600);
        stage.setResizable(false);
//        stage.setX(50);
//        stage.setY(50);
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("You can't leave unless you press S");
//        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("s"));
        //Add scene to stage

        root.getChildren().add(imageView);
//      root.getChildren().add(rectangle);
        root.getChildren().add(text);
        root.getChildren().add(line);
        stage.setScene(scene);
        stage.show();//Show's new window with stage


    }
}