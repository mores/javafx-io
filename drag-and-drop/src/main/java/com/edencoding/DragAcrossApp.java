package com.edencoding;

import com.edencoding.controllers.DragAcrossController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class DragAcrossApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //start primary window
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/images/EdenCodingIcon.png")));
        primaryStage.setTitle("Drag and Drop example");
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/com/edencoding/fxml/dragShapeAcrossExample.fxml"));
        Scene primaryScene = new Scene(fxmlLoader.load());
        primaryStage.setScene(primaryScene);
        primaryStage.setResizable(false);
        primaryStage.show();

        //start secondary window
        Stage secondaryStage = new Stage();
        secondaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/images/EdenCodingIcon.png")));
        secondaryStage.setTitle("Drag and Drop example");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(App.class.getResource("/com/edencoding/fxml/dragShapeAcrossExample.fxml"));
        Scene secondaryScene = new Scene(loader.load());
        DragAcrossController controller = loader.getController();
        controller.deleteShape();
        secondaryStage.setScene(secondaryScene);
        secondaryStage.setResizable(false);
        secondaryStage.show();
    }
}
