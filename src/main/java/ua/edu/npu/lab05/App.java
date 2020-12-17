package ua.edu.npu.lab05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("../../../../../app.fxml"));
        primaryStage.setTitle("Морозиво"); // назва у рядку стану вікна програми
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        AppController appController = new AppController();
    }
}