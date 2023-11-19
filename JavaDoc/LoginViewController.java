/**
 * Controlador para la vista de inicio de sesión en la aplicación MyStore.
 * Gestiona la autenticación de usuarios y la navegación a otras vistas.
 */
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

    /**
     * Muestra la vista de registro al hacer clic en el botón correspondiente.
     *
     * @param event El evento de acción que desencadena la acción.
     */
    @FXML
    void MostrarViewRegistro(ActionEvent event) {
        // ... (resto del código)
    }

    /**
     * Verifica las credenciales del usuario y muestra la vista principal si son válidas.
     *
     * @param event El evento de acción que desencadena la acción.
     */
    @FXML
    void showHome(ActionEvent event) {
        // ... (resto del código)
    }

    /**
     * Muestra la vista principal con el ID de usuario.
     *
     * @param event      El evento de acción que desencadena la acción.
     * @param fxmlLoader El cargador FXML para la vista principal.
     * @param idUser     El ID del usuario autenticado.
     */
    @FXML
    void showHome2(ActionEvent event, FXMLLoader fxmlLoader, int idUser) {
        // ... (resto del código)
    }
}


