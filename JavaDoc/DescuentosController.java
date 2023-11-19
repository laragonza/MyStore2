/**
 * El controlador para la vista de descuentos en la aplicación MyStore.
 * Gestiona la interacción del usuario y la presentación de productos en oferta.
 */
public class DescuentosController {

    @FXML
    private AnchorPane anchorPane;

    // ... (otros campos)

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
     * Maneja el evento de hacer clic en un botón para mostrar detalles del producto.
     *
     * @param event El evento del ratón.
     */
    @FXML
    private void showProductDetails(MouseEvent event) {
        // Lógica para mostrar los detalles del producto al hacer clic en un botón
    }

    /**
     * Inicializa la lógica del controlador.
     */
    @FXML
    private void initialize() {
        // Lógica de inicialización (si es necesaria)
        updateWelcomeLabel();
        configureButtons();
    }

    /**
     * Muestra la vista de inicio.
     *
     * @param event El evento de acción.
     */
    @FXML
    void showViewHome(ActionEvent event) {
        // ... (resto del código)
    }

    /**
     * Muestra la vista de inicio con el ID de usuario.
     *
     * @param event      El evento de acción.
     * @param fxmlLoader El cargador FXML para la vista de inicio.
     * @param idUser     El ID del usuario.
     */
    @FXML
    void showHome2(ActionEvent event, FXMLLoader fxmlLoader, int idUser) {
        // ... (resto del código)
    }

    private void updateWelcomeLabel() {
        // Lógica para actualizar la etiqueta de bienvenida con el nombre de usuario actual
    }

    private void configureButtons() {
        // Lógica para configurar los botones según sea necesario
    }
}


