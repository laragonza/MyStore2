package com.example.mystore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DescuentosController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TextField searchField;

    @FXML
    private Button btnCesta;
    @FXML
    private Button btnHome;

    @FXML
    private Label welcomeUserLabel, txtId;

    @FXML
    private VBox vBox;

    @FXML
    private HBox hBox1;

    @FXML
    private Button btnImage1;

    @FXML
    private ImageView ImagePort1;

    @FXML
    private ImageView ImagePort2;

    @FXML
    private ImageView ImagePort3;

    @FXML
    private ImageView ImagePort4;

    @FXML
    private ImageView ImagePort5;

    @FXML
    private ImageView ImagePort6;

    @FXML
    private ImageView ImagePort7;

    // Añade los demás campos según sea necesario...


    int idUsuario = 0;

    Bd baseDatos = new Bd();
    public void mostrarId(int idUser) {
        txtId.setText(String.valueOf(idUser));
        idUsuario = Integer.parseInt(txtId.getText());
        System.out.println("El id recogido es: "+ idUsuario);
        String nombreAux = baseDatos.mostrarNombre(idUsuario);
        welcomeUserLabel.setText("Bienvenido, "+nombreAux);
    }

    @FXML
    private void showProductDetails(MouseEvent event) {
        // Lógica para mostrar los detalles del producto al hacer clic en un botón
    }



    @FXML
    private void initialize() {
        // Lógica de inicialización (si es necesaria)
        updateWelcomeLabel();
        configureButtons();
    }


    HelloApplication main = new HelloApplication();
    FXMLLoader loaderHome = new FXMLLoader(getClass().getResource("HomeView.fxml"));

    @FXML
    void showViewHome(ActionEvent event) {
        try {

            main.cerrarPagina(event, btnHome);
            showHome2(event, loaderHome, idUsuario);

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

    private void updateWelcomeLabel() {
        // Lógica para actualizar la etiqueta de bienvenida con el nombre de usuario actual
    }

    private void configureButtons() {
        // Lógica para configurar los botones según sea necesario
    }
}

