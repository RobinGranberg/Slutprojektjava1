package Mediaplayer;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Interface extends Application {

    @Override
    public void start(Stage window) {
    	
    	
    	


    	

        //Creates a vertical layout for title  
    	
        VBox vBox = new VBox();
        HBox hBox = new HBox(6);
        hBox.setPadding(new Insets(100,100,100,100));
        vBox.setAlignment(Pos.CENTER);

        //Sets the dimensions of the scene and adds the style.css document

        Scene scene = new Scene(vBox, 1280, 680);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        window.setResizable(false);


        // header text
        Text titleText = new Text();
        titleText.setId("titleText");
        titleText.setText("'The toilet companion'");


      //Creates the buttons that will play sounds

        //the sound of flowing water
        Button toilet = new Button();
        toilet.setId("toilet");
        toilet.setMinHeight(130);
        toilet.setMinWidth(200);
        toilet.setOnAction(e -> Sound.getSounds(toilet.getId()));


        // coughing when something big is going on 
        Button cough = new Button();
        cough.setId("cough");
        cough.setMinHeight(130);
        cough.setMinWidth(200);
        cough.setOnAction(e -> Sound.getSounds(cough.getId()));


        //Adding titles to buttons 
        vBox.getChildren().add(titleText);
        vBox.getChildren().addAll(hBox);
        hBox.getChildren().addAll(toilet, cough);




        // windows title 
        window.setTitle("The toilet companion");
        window.setScene(scene);
        window.show();
    }



}
