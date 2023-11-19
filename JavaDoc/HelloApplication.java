/**
 * La clase principal de la aplicación MyStore que extiende javafx.application.Application.
 * Inicia la aplicación y muestra la vista principal.
 */
public class HelloApplication extends Application {
    
    /**
     * Inicia la aplicación y muestra la vista principal (MainView.fxml).
     *
     * @param primaryStage El escenario principal de la aplicación.
     */
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Muestra una nueva página utilizando un cargador FXML.
     *
     * @param event      El evento de acción que desencadena la acción.
     * @param fxmlLoader El cargador FXML para la nueva página.
     */
    @FXML
    void mostrarPagina(ActionEvent event, FXMLLoader fxmlLoader) {
        try {
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Cierra la página actual asociada al botón especificado.
     *
     * @param event      El evento de acción que desencadena la acción.
     * @param btnEmpezar El botón asociado a la página que se va a cerrar.
     */
    @FXML
    public void cerrarPagina(ActionEvent event, Button btnEmpezar) {
        try {
            // selecciona la vista a la que pertenece btnEmpezar
            Stage stage = (Stage) btnEmpezar.getScene().getWindow();
            // haciendo .hide cierra la ventana con la opción de reabrir la vista
            stage.hide();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
