/**
 * Controlador para la vista que muestra los detalles de un producto en la aplicación MyStore.
 * Se encarga de la presentación de la información del producto en la interfaz de usuario.
 */
public class ProductViewController {

    @FXML
    private Label productNameLabel;
    @FXML
    private Label productPriceLabel;
    @FXML
    private Label productDescriptionLabel;

    private Product product;

    /**
     * Establece el producto asociado y configura los elementos de la interfaz de usuario con sus detalles.
     *
     * @param product El producto que se mostrará en la vista.
     */
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

    /**
     * Obtiene el nombre del producto desde el producto asociado.
     *
     * @return El nombre del producto o una cadena vacía si el producto es nulo.
     */
    public String getProductName() {
        return (product != null) ? product.getName() : "";
    }

    /**
     * Obtiene el precio del producto desde el producto asociado.
     *
     * @return El precio del producto como cadena o una cadena vacía si el producto es nulo.
     */
    public String getProductPrice() {
        return (product != null) ? String.valueOf(product.getPrice()) : "";
    }

    /**
     * Obtiene la descripción del producto desde el producto asociado.
     *
     * @return La descripción del producto o una cadena vacía si el producto es nulo.
     */
    public String getProductDescription() {
        return (product != null) ? product.getDescription() : "";
    }
}
