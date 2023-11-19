/**
 * La clase Bd proporciona métodos para gestionar la conexión y operaciones con una base de datos MySQL.
 */
public class Bd {
    private static Connection conexion = null;
    private static Statement sentenciaSQL = null;

    /**
     * Constructor por defecto de la clase Bd.
     */
    public Bd() {
        super();
    }

    //----------------------------------------------------------------------------------------------------------

    /**
     * Establece una conexión a la base de datos MySQL.
     *
     * @throws SQLException Si hay un error al intentar establecer la conexión.
     */
    final void conectar() throws SQLException {
        try {
            // Cargar el controlador JDBC para MySQL y establecer la conexión
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/MyStore", "root", "root");
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        }
    }

    /**
     * Cierra la conexión a la base de datos y la declaración SQL.
     *
     * @throws SQLException Si hay un error al intentar cerrar la conexión.
     */
    final void desconectar() throws SQLException {
        try {
            // Cerrar la conexión y la declaración SQL
            sentenciaSQL.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //----------------------------------------------------------------------------------------------------------

    /**
     * Guarda la información de un nuevo usuario en la base de datos.
     *
     * @param nombre    El campo de texto del nombre del usuario.
     * @param apellidos El campo de texto de los apellidos del usuario.
     * @param email     El campo de texto del correo electrónico del usuario.
     * @param password  El campo de texto de la contraseña del usuario.
     */
    public void guardarUsuario(TextField nombre, TextField apellidos, TextField email, TextField password) {
        // ... (resto del código)
    }

    /**
     * Verifica las credenciales de inicio de sesión de un usuario.
     *
     * @param email    El campo de texto del correo electrónico del usuario.
     * @param password El campo de texto de la contraseña del usuario.
     * @return true si las credenciales son válidas, false de lo contrario.
     */
    public boolean iniciarSesion(TextField email, TextField password) {
        // ... (resto del código)
    }

    /**
     * Obtiene el ID de un usuario basado en su nombre de usuario y contraseña.
     *
     * @param txtUsername El campo de texto del nombre de usuario.
     * @param txtPassword El campo de texto de la contraseña del usuario.
     * @return El ID del usuario.
     */
    public int getIdUser(TextField txtUsername, TextField txtPassword) {
        // ... (resto del código)
    }

    /**
     * Obtiene el nombre de usuario asociado a un ID de usuario.
     *
     * @param idUser El ID del usuario.
     * @return El nombre de usuario.
     */
    public String mostrarNombre(int idUser) {
        // ... (resto del código)
    }
}

