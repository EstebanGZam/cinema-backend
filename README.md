# Backend - Plataforma de Cine ♟️

![Badge in Development](https://img.shields.io/badge/ESTADO-EN%20DESARROLLO-green)

![Logo de la Universidad ICESI](https://www.icesi.edu.co/launiversidad/images/La_universidad/logo_icesi.png)

## Autor ✒️

> - Esteban Gaviria Zambrano - A00396019

---

## Configuración de la Base de Datos en PostgreSQL 🗄️

La aplicación utiliza una base de datos PostgreSQL. Sigue estos pasos para configurar correctamente la base de datos:

1. **Iniciar el Servidor de PostgreSQL**: Asegúrate de que PostgreSQL esté instalado y en ejecución en tu máquina.
   Puedes iniciar el servicio de PostgreSQL desde la terminal o a través de un gestor de servicios.

2. **Crear la Base de Datos**:

    - Accede a la consola de PostgreSQL:
    - Ingresa la contraseña de tu usuario de PostgreSQL.
    - Crea un usuario (si aún no existe):
      ```sql
      CREATE USER admin WITH PASSWORD 'admin';
      ```
    - Crea la base de datos con el nombre `cinema` asignando a `admin` como propietario:
      ```sql
      CREATE DATABASE cinema OWNER admin;
      ```

3. **Verificar la Conexión**:

    - Asegúrate de que la configuración en el archivo `application.properties` coincida con la información de la base de
      datos:
      ```properties
      spring.datasource.url=jdbc:postgresql://localhost:5432/cinema
      spring.datasource.username=admin
      spring.datasource.password=admin
      ```

## Ejecución de la Aplicación 🚀

### 1. Requisitos previos

Antes de ejecutar la aplicación, asegúrate de tener instalados los siguientes componentes:

- **Java Development Kit (JDK)**: Versión 17 o superior.
- **Gradle**: Para gestionar la construcción del proyecto.
- **PostgreSQL**: Como base de datos relacional.
- **IDE**: Como IntelliJ IDEA, Eclipse, o cualquier otro de tu preferencia.

### 2. Clonar el repositorio

Primero, clona el repositorio del proyecto desde GitHub:

```bash
git clone https://github.com/EstebanGZam/cinema-backend.git
```

Luego, navega al directorio del proyecto:

```bash
cd cinema-backend
```

### 3. Construcción y ejecución de la aplicación

1. **Compilar el proyecto**: Usa el siguiente comando para compilar el proyecto y descargar las dependencias necesarias:

   ```bash
   ./gradlew build
   ```

2. **Ejecutar la aplicación**: Después de compilar, ejecuta la aplicación con el siguiente comando:

   ```bash
   ./gradlew bootRun
   ```

   Esto iniciará el servidor en el puerto predeterminado (puerto 8080).

## 4. Inserción de Datos de prueba en la base de datos 📝

Para insertar datos de prueba en la base de datos y probar los endpoints, puedes utilizar herramientas como pgAdmin o
Flyway. Una vez conectado a la base de datos con alguna de estas herramientas, debes ejecutar el siguiente script, que
incluye algunos datos para el testeo. Es importante destacar que este paso debe realizarse con el proyecto en ejecución
para que las tablas aparezcan en la base de datos.

```sql
INSERT INTO nationalities (id, nationality)
VALUES (1, 'British');

SELECT *
FROM nationalities;

INSERT INTO directors (id, name, birthdate, nationality_id)
VALUES (1, 'Christopher Nolan', '1970-07-30', 1);

INSERT INTO classifications (id, classification)
VALUES (1, 'PG-13');

INSERT INTO movies (id, title, synopsis, duration, release_date, classification_id, director_id)
VALUES (1, 'Inception', 'A mind-bending thriller about dream manipulation', 148, '2010-07-16', 1, 1);

-- Inserción de un teatro (cine)
INSERT INTO theaters (id, name, address)
VALUES (1, 'Cinema Icesi', 'Calle 18 No. 122-135');

SELECT *
FROM theaters;

-- Ahora insertamos la sala en ese teatro

INSERT INTO rooms (id, theater_id, accessibility)
VALUES ('Room1', 1, 'Y'); -- Donde 'Y' indica que la sala es accesible

SELECT *
FROM rooms;

-- Inserción de un tipo de silla
INSERT INTO types_of_chairs (id, type)
VALUES (1, 'Standard'); -- Tipo de silla estándar

SELECT *
FROM types_of_chairs;

-- Inserción de las sillas
INSERT INTO chairs (id, status, type_of_chair_id)
VALUES ('Chair1', 'D', 1), -- 'D' para indicar que está disponible
       ('Chair2', 'D', 1),
       ('Chair3', 'D', 1),
       ('Chair4', 'D', 1);

SELECT *
FROM chairs;

-- Asociar las sillas con la sala en la tabla intermedia (ManyToMany)
INSERT INTO room_chairs (room_id, chair_id)
VALUES ('Room1', 'Chair1'),
       ('Room1', 'Chair2'),
       ('Room1', 'Chair3'),
       ('Room1', 'Chair4');

SELECT *
FROM room_chairs;

-- Inserción de una proyección (film screening)
INSERT INTO film_screenings (id, start_time, room_id, movie_id)
VALUES (1, '2024-09-20 19:00:00', 'Room1', 1);

SELECT *
FROM film_screenings;

SELECT id
FROM movies;
SELECT id
FROM rooms;
SELECT *
FROM clients;

SELECT *
FROM reservations;

INSERT INTO clients(id, id_number, name, date_of_birth, email, phone, address, gender)
VALUES (0, '123456789', 'John Doe', '1985-06-15', 'johndoe@example.com', '555-1234', '123 Elm Street', 'Male');

SELECT *
FROM clients;


SELECT column_name
FROM information_schema.columns
WHERE table_name = 'movies';


```

## **Tecnologías Utilizadas** 🛠️

<div style="text-align: left">
    <p>
        <a href="https://www.java.com/es/" target="_blank"> <img alt="Java" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" height="60" width = "60"></a>
        <a href="https://spring.io" target="_blank"> <img alt="Spring" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original-wordmark.svg" height="60" width = "60"></a>
        <a href="https://www.postgresql.org/" target="_blank"> <img alt="PostgreSQL" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/postgresql/postgresql-original-wordmark.svg" height="60" width = "60"></a>
        <a href="https://gradle.org/" target="_blank"> <img alt="Gradle" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original-wordmark.svg" height="60" width = "60"></a>
        <a href="https://www.jetbrains.com/es-es/idea/" target="_blank"> <img alt="IntelliJ IDEA" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" height="60" width = "60"></a>
        <a href="https://www.postman.com" target="_blank"> <img alt="Postman" src="https://www.svgrepo.com/show/354201/postman.svg" height="60" width = "60"></a>
    </p>
</div>

## **Sistema de Control de Versiones** 📌

<div style="text-align: left">
    <a href="https://git-scm.com/" target="_blank"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/git/git-original-wordmark.svg" height="60" width = "60" alt="Git"></a>
    <a href="https://github.com/" target="_blank"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/github/github-original-wordmark.svg" height="60" width = "60" alt="GitHub"></a>
</div>
