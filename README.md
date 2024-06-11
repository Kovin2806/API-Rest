# API Rest de cuentas utilizando Spring Boot (Java), Maven y MySQL.

Este proyecto es una API Rest desarrollada en Spring Boot para gestionar cuentas usando Visual Studio Code, MySQL, Postman. A continuación, se proporciona la documentación necesaria para revisar, probar y ejecutar la API.

## Requisitos

Asegúrate de tener instalado lo siguiente:

- [Visual Studio Code](https://code.visualstudio.com/)
- Extensiones de Visual Studio Code:
  - Spring Boot Extension Pack (contiene Spring Boot Tools, Spring Initializr Java Support, Spring Boot Dashboard)
  - Extension Pack for Java (contiene Language Support For Java, Debugger For Java, Test Runner For Java, Maven For Java, Project Manager For Java, IntelliCode)
- [MySQL](https://www.mysql.com/) para la base de datos
- [Postman](https://www.postman.com/) para realizar pruebas en la API

## Configuración de la Base de Datos

1. Ejecuta el script `data.sql` ubicado en `src\main\resources\data.sql` para crear la base de datos con datos de ejemplo.

2. En el archivo `src\main\resources\application.properties`, asegúrate de configurar la conexión a la base de datos:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3307/apiCuentas
    spring.datasource.username=root
    spring.datasource.password=
    ```

    - `localhost:3307` es el puerto para acceder al espacio de MySQL.
    - `apiCuentas` es el nombre de la base de datos.
    - `root` es el nombre de usuario para acceder a MySQL.
    - Deja el campo `password` vacío si no tienes una contraseña configurada.
    - Ajusta cada uno de los campos según tu configuración

## Ejecutar el Proyecto

Hay dos maneras de ejecutar el proyecto:

1. Desde Visual Studio Code:
   - Deberías ver un botón de "Run Java" en la esquina superior derecha de Visual Studio Code. Haz clic en él para ejecutar `ApiCuentasApplication.java`.

2. Desde la terminal:
   - Navega al directorio del proyecto y ejecuta:
     ```bash
     cd ruta/del/proyecto
     mvn spring-boot:run
     ```
3. Directamente desde el .java:
   - También puedes ejecutar directamente `ApiCuentasApplication.java` haciendo clic derecho y seleccionando "Run Java".

Asegúrate de tener MySQL abierto y Postman para realizar pruebas antes de ejecutar el proyecto.

## Uso de la API

Después de ejecutar el proyecto, puedes acceder a la API en [http://localhost:8080/api/v1/accounts](http://localhost:8080/api/v1/accounts) para realizar operaciones como listar cuentas, obtener detalles, crear nuevas cuentas, modificar saldos y desactivar cuentas.



