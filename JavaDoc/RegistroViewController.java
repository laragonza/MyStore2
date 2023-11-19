package com.example.mystore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class RegistroViewController {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtMail;

    @FXML
    private TextField txtPassword;

    @FXML
    private Button btnAcceder;

    @FXML
    private Button btnLogin;

    HelloApplication main = new HelloApplication();
    Bd baseDatos = new Bd();
    FXMLLoader loaderLogin = new FXMLLoader(getClass().getResource("LoginView.fxml"));
    FXMLLoader loaderHome = new FXMLLoader(getClass().getResource("HomeView.fxml"));
    @FXML
    void MostrarViewInicioSesion(ActionEvent event) {
        try {
            main.cerrarPagina(event, btnLogin);
            main.mostrarPagina(event, loaderLogin);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void showHome(ActionEvent event) {
        boolean encontrados = false;

        try {
            encontrados = baseDatos.iniciarSesion( txtMail, txtPassword);

            //Una vez a encontrado el usuario accedo a la siguiente vista
            if(encontrados == false){
                baseDatos.guardarUsuario(txtNombre,txtApellidos,txtMail,txtPassword);
                main.cerrarPagina(event, btnAcceder);
                main.mostrarPagina(event, loaderLogin);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}

