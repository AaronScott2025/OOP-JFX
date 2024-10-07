package com.example.oopjfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class HelloController {

    private Random rand = new Random();

    private String uID;

    @FXML
    private Button addbtn;

    @FXML
    private Button btnedit;

    @FXML
    private Button clearbtn;

    @FXML
    private ImageView defImg;

    @FXML
    private Button deletebtn;

    @FXML
    private ImageView pfpimage;

    @FXML
    private TableView<String> tbl;

    @FXML
    private TableColumn<?, ?> tbldept;

    @FXML
    private TableColumn<?, ?> tblemail;

    @FXML
    private TableColumn<?, ?> tblfirst;

    @FXML
    private TableColumn<?, ?> tblid;

    @FXML
    private TableColumn<?, ?> tbllast;

    @FXML
    private TableColumn<?, ?> tblmajor;

    @FXML
    private TextField txtdept;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtfirst;

    @FXML
    private TextField txtimage;

    @FXML
    private TextField txtlast;

    @FXML
    private TextField txtmajor;

    @FXML
    void addClicked(ActionEvent event) {
    }

    @FXML
    void clearClicked(ActionEvent event) {

    }

    @FXML
    void delClicked(ActionEvent event) {

    }

    @FXML
    void editClicked(ActionEvent event) {

    }

}
