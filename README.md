# Aplicación MyStore

## Descripción

MyStore es una aplicación de escritorio basada en JavaFX que simula una tienda en línea simple. La aplicación permite a los usuarios registrarse, iniciar sesión y ver detalles de productos. También proporciona una interfaz básica para gestionar productos e información de usuarios.

## Tabla de Contenidos

- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Estructura del Código](#estructura-del-código)
- [Documentación](#documentación)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)

## Requisitos

- Java 8 o superior
- JavaFX
- Base de datos MySQL (para almacenar información de usuarios y productos)

## Instalación

1. Clona el repositorio:

   ```bash
   git clone https://github.com/your-username/MyStore.git
   ```

2. Abre el proyecto en tu IDE de Java preferido.

3. Configura la base de datos MySQL y ajusta los detalles de conexión en el archivo `Bd.java`.

4. Ejecuta la aplicación.

## Uso

1. **Iniciar Sesión o Registrarse:**
   - Inicia la aplicación.
   - Si eres un usuario registrado, inicia sesión con tu correo electrónico y contraseña.
   - Si eres un usuario nuevo, haz clic en el botón "Registrar" y proporciona tus detalles.

2. **Vista Principal:**
   - Después de iniciar sesión o registrarte, serás dirigido a la vista principal.
   - La vista principal muestra una lista de productos disponibles en la tienda.

3. **Detalles del Producto:**
   - Haz clic en un producto para ver sus detalles.
   - La vista de Detalles del Producto muestra el nombre, precio y descripción del producto seleccionado.

4. **Vista de Registro:**
   - Haz clic en el botón "Registrar" en la vista de inicio de sesión para acceder a la vista de registro.
   - Ingresa tus detalles y haz clic en el botón "Registrar" para crear una nueva cuenta.

5. **Cerrar Sesión:**
   - Utiliza los botones "Cerrar Sesión" o "Vista Principal" para navegar entre vistas.

## Estructura del Código

La aplicación está dividida en varias clases Java:

- `Bd.java`: Gestiona la conexión a la base de datos MySQL e incluye métodos para autenticación y registro de usuarios.
- `HelloApplication.java`: Clase principal que inicia la aplicación JavaFX.
- `LoginViewController.java`: Controla la vista de inicio de sesión y maneja las acciones de inicio de sesión de los usuarios.
- `MainViewController.java`: Controla la vista principal, que muestra un video y proporciona enlaces a las vistas de inicio de sesión y registro.
- `Product.java`: Representa un producto con un nombre, precio y descripción.
- `ProductDetailsViewController.java`: Controla la vista de detalles del producto, mostrando información sobre un producto seleccionado.
- `ProductViewController.java`: Controla la vista de productos, mostrando una lista de productos.
- `RegistroViewController.java`: Controla la vista de registro y maneja las acciones de registro de usuarios.
- `HomeView.fxml`, `LoginView.fxml`, `ProductDetailsView.fxml`, `ProductView.fxml`, `RegistroView.fxml`: Archivos FXML que definen los diseños de las vistas correspondientes.

## Documentación

Para obtener una documentación detallada de cada clase y método, consulta los comentarios en línea en el código fuente.
![image](https://github.com/laragonza/MyStore2/assets/16885317/07bc6670-2e00-4b68-8b5d-fa7dbdab72da)


## Diagrama

![282314220-abf9f710-6b59-4c1b-8f86-a886fc25ce20](https://github.com/laragonza/MyStore2/assets/16885317/a3ad75d4-5cec-4f86-9fb6-51b147e1837c)


