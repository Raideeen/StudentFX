package com.example.studentfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class StudentController implements Initializable {
    @FXML
    private ChoiceBox<String> cbGender;

    @FXML
    private Label lblGender;

    @FXML
    private Label lblName;

    @FXML
    private Label lblSelectedStudent;

    @FXML
    private Label lblStudentsList;

    @FXML
    private ListView<Student> lvStudent;

    @FXML
    private TextField tfName;

    public StudentController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<String> gvalues = new ArrayList<>();
        gvalues.add("Male");
        gvalues.add("Female");
        ObservableList<String> gender = FXCollections.observableArrayList(gvalues);
        cbGender.setItems(gender);

        List<Student> hardStudents = new ArrayList<>();
        hardStudents.add(new Student(1, "lolo", "female"));
        hardStudents.add(new Student(2, "lili", "male"));
        ObservableList<Student> students = FXCollections.observableArrayList(hardStudents);
        lvStudent.setItems(students);
    }
}