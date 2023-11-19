/**
 * Controlador para la vista Home en la aplicación MyStore.
 * Gestiona la presentación de productos, la navegación a la vista de descuentos
 * y la comunicación con la base de datos.
 */
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

    /**
     * Muestra el ID del usuario y su nombre en la etiqueta de bienvenida.
     *
     * @param idUser El ID del usuario.
     */
    public void mostrarId(int idUser) {
        // ... (resto del código)
    }

    /**
     * Maneja el evento de hacer clic en el botón para mostrar detalles del producto.
     *
     * @param event El evento de acción que desencadena la acción.
     */
    @FXML
    private void showProductDetails(ActionEvent event) {
        // Lógica para mostrar detalles del producto
    }

    HelloApplication main = new HelloApplication();
    FXMLLoader loaderDescuentos = new FXMLLoader(getClass().getResource("DescuentosView.fxml"));

    /**
     * Muestra la vista de descuentos al hacer clic en el botón correspondiente.
     *
     * @param event El evento de acción que desencadena la acción.
     */
    @FXML
    void MostrarViewDescuento(ActionEvent event) {
        // ... (resto del código)
    }

    /**
     * Muestra la vista de descuentos con el ID de usuario.
     *
     * @param event      El evento de acción que desencadena la acción.
     * @param fxmlLoader El cargador FXML para la vista de descuentos.
     * @param idUser     El ID del usuario.
     */
    @FXML
    void showHome2(ActionEvent event, FXMLLoader fxmlLoader, int idUser) {
        // ... (resto del código)
    }
}




