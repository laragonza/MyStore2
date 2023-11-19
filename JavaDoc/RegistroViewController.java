/**
 * Controlador para la vista de registro en la aplicación MyStore.
 * Permite a los usuarios registrarse en la aplicación.
 */
public class RegistroViewController {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtMail;

    @FXML
    private TextField txtPassword;

    @FXML
    private Button btnAcceder;

    @FXML
    private Button btnLogin;

    HelloApplication main = new HelloApplication();
    Bd baseDatos = new Bd();
    FXMLLoader loaderLogin = new FXMLLoader(getClass().getResource("LoginView.fxml"));
    FXMLLoader loaderHome = new FXMLLoader(getClass().getResource("HomeView.fxml"));

    /**
     * Muestra la vista de inicio de sesión al hacer clic en el botón correspondiente.
     *
     * @param event El evento de acción que desencadena la acción.
     */
    @FXML
    void MostrarViewInicioSesion(ActionEvent event) {
        try {
            main.cerrarPagina(event, btnLogin);
            main.mostrarPagina(event, loaderLogin);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Intenta iniciar sesión con las credenciales proporcionadas.
     * Si el usuario no existe, lo registra y muestra la vista de inicio de sesión.
     *
     * @param event El evento de acción que desencadena la acción.
     */
    @FXML
    void showHome(ActionEvent event) {
        boolean encontrados = false;

        try {
            encontrados = baseDatos.iniciarSesion(txtMail, txtPassword);

            // Una vez a encontrado el usuario accedo a la siguiente vista
            if (!encontrados) {
                baseDatos.guardarUsuario(txtNombre, txtApellidos, txtMail, txtPassword);
                main.cerrarPagina(event, btnAcceder);
                main.mostrarPagina(event, loaderLogin);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}


