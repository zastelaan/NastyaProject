package ua.edu.npu.lab05;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;

public class AppController {
    @FXML
    ChoiceBox<String> choiceBox;

    @FXML
    ComboBox<String> comboBox;

    @FXML
    CheckBox checkBox;

    public void initialize() {
        comboBox.getItems().addAll("шоколадне", "пломбір", "фісташкове");
        comboBox.getSelectionModel().select(0);
        choiceBox.getItems().setAll(FXCollections.observableArrayList("полуниця", "чорниця", "ананас", "вишня"));
        choiceBox.getSelectionModel().select(0);
    }
    }
