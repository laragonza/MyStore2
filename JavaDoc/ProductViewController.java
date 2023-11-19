package com.example.mystore;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ProductViewController {

    @FXML
    private Label productNameLabel;
    @FXML
    private Label productPriceLabel;
    @FXML
    private Label productDescriptionLabel;

    private Product product;

    public void setProduct(Product product) {
        this.product = product;
        // Configura los elementos de la interfaz de usuario con los detalles del producto
        if (product != null) {
            productNameLabel.setText(product.getName());
            productPriceLabel.setText(String.valueOf(product.getPrice()));
            productDescriptionLabel.setText(product.getDescription());
        } else {
            // Puedes manejar el caso en el que el producto sea nulo, por ejemplo, borrar las etiquetas
            productNameLabel.setText("");
            productPriceLabel.setText("");
            productDescriptionLabel.setText("");
        }
    }

    public String getProductName() {
        // Implementa la lógica para obtener el nombre del producto desde product
        return (product != null) ? product.getName() : "";
    }

    public String getProductPrice() {
        // Implementa la lógica para obtener el precio del producto desde product
        return (product != null) ? String.valueOf(product.getPrice()) : "";
    }

    public String getProductDescription() {
        // Implementa la lógica para obtener la descripción del producto desde product
        return (product != null) ? product.getDescription() : "";
    }
}
