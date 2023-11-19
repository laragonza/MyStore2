// ProductDetailsViewController.java
package com.example.mystore;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ProductDetailsViewController {

    @FXML
    private Label productNameLabel;
    @FXML
    private Label productPriceLabel;
    @FXML
    private Label productDescriptionLabel;

    private ProductViewController currentProduct;


    public void setProduct(ProductViewController product) {
        this.currentProduct = product;

        // Configura las etiquetas con la información del producto
        productNameLabel.setText(currentProduct.getProductName());
        productPriceLabel.setText(currentProduct.getProductPrice());
        productDescriptionLabel.setText(currentProduct.getProductDescription());
        // Puedes agregar más configuraciones según sea necesario
    }

    public void setCurrentProduct(ProductViewController product) {
        this.currentProduct = product;
        setProduct(product);
    }
}
