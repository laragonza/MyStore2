/**
 * Controlador para la vista de detalles de producto en la aplicación MyStore.
 * Muestra información detallada sobre un producto seleccionado.
 */
public class ProductDetailsViewController {

    @FXML
    private Label productNameLabel;
    @FXML
    private Label productPriceLabel;
    @FXML
    private Label productDescriptionLabel;

    private ProductViewController currentProduct;

    /**
     * Establece el producto actual y configura las etiquetas con su información.
     *
     * @param product El producto para el cual se mostrarán los detalles.
     */
    public void setProduct(ProductViewController product) {
        this.currentProduct = product;

        // Configura las etiquetas con la información del producto
        productNameLabel.setText(currentProduct.getProductName());
        productPriceLabel.setText(currentProduct.getProductPrice());
        productDescriptionLabel.setText(currentProduct.getProductDescription());
        // Puedes agregar más configuraciones según sea necesario
    }

    /**
     * Establece el producto actual y configura las etiquetas con su información.
     *
     * @param product El producto para el cual se mostrarán los detalles.
     */
    public void setCurrentProduct(ProductViewController product) {
        setProduct(product);
    }
}
