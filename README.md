# Aplicación de Videojuegos
Aplicación de videojuegos, en Java web realizada en un curso de Spring boot. El mismo posee las funcionalidades CRUD en JAVA, Spring y el Frontend realizado en Thymeleaf, con el patrón de arquitectura de software: Spring MVC.

##  TecnologÍas utilizadas: 
- JAVA
- Spring Boot
- Thymeleaf
- Spring Data
- CSS3
- HTML5
- Bootstrap
- MySQL

##  Explorar Aplicación:

- GET /
  - Consigue listar todos los videojuegos creados en la Base de Datos.

- GET /videojuegosPorDistribuidor
  - Consigue obtener los videojuegos pertenecientes al distribuidor seleccionado.

- GET /buscar
  - Funcionalidad para el buscador de la página, inserte nombre de videojuego para su búsqueda.

- DELETE /eliminar
  - Elimina el videojuego por su idVideojuego. Haciendo click en el boton "eliminar" desde la página.

- GET /videojuegos/crear
  - Funcionalidad para crear un nuevo videojuego desde la página (clickeando el boton superior "crear nuevo videojuego")

- GET /editar
  - Funcionalidad para editar el videojuego seleccionado desde la página (clickeando el boton "editar")

- POST /videojuegos/guardar
  - Funcionalidad para guardar el videojuego (creado, o editado) desde la página (clickeando el boton "guardar")
