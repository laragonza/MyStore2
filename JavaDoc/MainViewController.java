import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import java.io.File;
import java.net.URL;
import java.io.IOException;
import java.util.ResourceBundle;

/**
 * Controlador para la vista principal de la aplicación MyStore.
 * Gestiona la reproducción de un video de bienvenida y la navegación a las vistas de inicio de sesión y registro.
 */
public class MainViewController implements Initializable {

    @FXML
    private Button btnMostrarInicioSesion, btnMostrarRegistro;
    
    @FXML
    private TextField txtMostrar;

    @FXML
    private MediaView mediaView;
    
    private Media media;
    private MediaPlayer mediaPlayer;

    // Ruta del archivo de video
    File file = new File("C:\\Users\\Raúl\\IdeaProjects\\MyStore\\src\\main\\resources\\Vid\\VideoPrincipal.mp4");

    // Instancia de la aplicación principal para la navegación entre vistas
    HelloApplication main = new HelloApplication();

    // Cargadores de vistas
    FXMLLoader loaderLogin = new FXMLLoader(getClass().getResource("LoginView.fxml"));
    FXMLLoader loaderRegistro = new FXMLLoader(getClass().getResource("RegistroView.fxml"));

    /**
     * Inicializa el controlador, carga el video y lo reproduce.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
    }

    /**
     * Muestra la vista de inicio de sesión al hacer clic en el botón correspondiente.
     *
     * @param event El evento de acción que desencadena la acción.
     */
    @FXML
    void MostrarViewInicioSesion(ActionEvent event) {
        try {
            main.cerrarPagina(event, btnMostrarInicioSesion);
            main.mostrarPagina(event, loaderLogin);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Muestra la vista de registro al hacer clic en el botón correspondiente.
     *
     * @param event El evento de acción que desencadena la acción.
     */
    @FXML
    void MostrarViewRegistro(ActionEvent event) {
        try {
            main.cerrarPagina(event, btnMostrarRegistro);
            main.mostrarPagina(event, loaderRegistro);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
