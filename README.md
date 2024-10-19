# Para poder ejecutar el programa y tenga una BBDD a la que conectarse es necesario tener ejecutar el contenedor de Odoo. Para ello debemos tener Docker instalado en nuestro equipo.


**1. INSTALACIÓN DE DOCKER Y DOCKER-COMPOSE**

https://docs.docker.com/get-docker/

En Ubuntu se puede instalar de forma fácil ejecutando el comando:

    > sudo apt install docker docker-compose


**2. EJECUCIÓN DE LOS CONTENEDORES**

Descarga del repositorio GIT

    > git clone https://github.com/fdgongoraeducaand/JavaFX-Odoo-conexi-n-a-la-tabla-de-bancos.git

Nos movemos al directorio que contiene el fichero "docker-compose.yml"

Ejecutamos los contenedores

    > docker-compose up -d   (Es posible que por la configuración se deba usar sudo)

Parar los contenedores 

    > docker-compose down
    
Los parámetros de conexión están incluídos en el fichero docker-compose.yml. También es interesante saber que el contenedor incluye una interfaz web a la BBDD en la ruta http://localhost:8080

FDGA @19/10/2024
