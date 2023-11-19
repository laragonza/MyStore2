package com.example.mystore;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableCell;
import javafx.util.Callback;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class Home {

    @FXML
    private Label welcomeUserLabel, txtId;

    @FXML
    private TextField searchField;

    @FXML
    private TableView<ProductViewController> productTable;

    @FXML
    private Button btnDescuentos;

    @FXML
    private TextField usernameField;

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
    private void showProductDetails(ActionEvent event) {
        // Lógica para mostrar detalles del producto
    }

    HelloApplication main = new HelloApplication();
    FXMLLoader loaderDescuentos = new FXMLLoader(getClass().getResource("DescuentosView.fxml"));

    @FXML
    void MostrarViewDescuento(ActionEvent event) {
        try {

            main.cerrarPagina(event, btnDescuentos);
            showHome2(event, loaderDescuentos, idUsuario);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void showHome2(ActionEvent event, FXMLLoader fxmlLoader, int idUser) {

        try {

            Parent root1 = (Parent) fxmlLoader.load();
            // Para pasar datos entre ventanas
            DescuentosController pview = fxmlLoader.getController();
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




