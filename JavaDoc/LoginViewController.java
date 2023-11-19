package com.example.mystore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class LoginViewController {

    @FXML
    private TextField txtUsername;

    @FXML
    private Button btnAcceder;

    @FXML
    private ImageView imgInicio;

    int idUser = 0;

    @FXML
    private TextField txtPassword;

    @FXML
    private Button btnRegistro;

    HelloApplication main = new HelloApplication();
    Bd baseDatos = new Bd();
    FXMLLoader loaderHome = new FXMLLoader(getClass().getResource("HomeView.fxml"));
    FXMLLoader loaderRegistro = new FXMLLoader(getClass().getResource("RegistroView.fxml"));

    @FXML
    void MostrarViewRegistro(ActionEvent event) {
        try {

            main.cerrarPagina(event, btnRegistro);
            main.mostrarPagina(event, loaderRegistro);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void showHome(ActionEvent event) {

        boolean encontrados = false;

        try {
            encontrados = baseDatos.iniciarSesion( txtUsername, txtPassword);

            //Una vez a encontrado el usuario accedo a la siguiente vista
            if(encontrados == true){
                idUser = baseDatos.getIdUser(txtUsername, txtPassword);
                main.cerrarPagina(event, btnAcceder);
                showHome2(event, loaderHome, idUser);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void showHome2(ActionEvent event, FXMLLoader fxmlLoader, int idUser) {

        try {

            Parent root1 = (Parent) fxmlLoader.load();
            // Para pasar datos entre ventanas
            Home pview = fxmlLoader.getController();
            //idUser = pview.mostrarId(idUser);
            pview.mostrarId(idUser);

            System.out.println("Usuario en vista login : " + idUser);

            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }



}



