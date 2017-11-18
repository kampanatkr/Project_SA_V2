package Warehouse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainWareHouse extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/warehouse.fxml"));
        primaryStage.setTitle("Warehouse");
        primaryStage.setScene(new Scene(root, 774, 582));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
