## Descripción

En esta sección se documentan los diagramas de despliegue que muestran la arquitectura física del sistema y cómo se distribuyen los componentes en hardware.

## Contenido

![diagrama de despliegue](https://www.plantuml.com/plantuml/png/RLFDRjiy4BppAGYVlk-GIzDUUYYY7yTHuIYg9JS5YXxMyiOXG946IJakYZvL7Y4lLefQovKhNoZDpCvmL-iRwy2ujf7C2IUHfm9s1XhWM_-CTYy5xbhaLpnJJmRGEjFMhZKTBtafhCC668FQQSDdYLShXpCEbYVB4nfjz0wsEg1HFA3RHYZX_JnbUYvbJ6cVEqk5tMihd3Xe_hTdRFIBHSD_CUv_ttCuOETi-2DkVdI2FFhAVa-vtB-z7eGC9lTw8oIUFABzdf1W41N5sQ14Sn1a7qhzsM7d6moAV2VKiR_28ik_dRobgA4MRw-gA-KhzBq7qMeU9TL4K5Ha8SYVuo0Fy0KuV86VmM3nI7Zhddaehwc1TNNNKubmO4TSabLHIQHMjfN_21xoShqa1LXzmKRb0vKNQ9w47B75V7MRBObkDttdMg4TgzRnHDinM0mB1qxRC80q7lM_1GURJZGhj7KxW-MN9Udwn1Wag1h3CdWZtnuUGtgVkeWVrdaoNrraapeozRCuKFAja7WnUzb0ZGgQRX4rBwyxJt_GdD8ylFlpmjstR_dywD0eylOl9rFwcBoyBqEvFyShvP6g8AeAIvai-TNLf-5Fy97VLLLHiYYUXjCfc4nevGUKaInmmvOFDAcdIKOGLG-hImAUgJ01HWJ9qdXGVKxZXFzNj6YSvX_UNx_xVwobJq9gJ_7LlAp6cZ3QGDB4WR4-WlZp2WnFT0zsWshRDl8F)

### Nodos de Despliegue

- Dispositivo Cliente: ejecuta el navegador web usado por clientes, abogados y administradores.
- Dispositivo Movil: ejecuta la aplicacion mobile para el cliente.
- Servidor Web: aloja el servidor Nginx y la aplicacion web React.
- Servidor API: concentra el API Gateway y los servicios internos del sistema.
- Servidor Base de Datos: contiene PostgreSQL y el balanceador de conexiones.
- Servidor de Archivos: administra el almacenamiento S3 y la distribucion por CDN.
- Servicios Externos: integra el gateway SMS y el servidor SMTP.

### Artefactos

- Navegador Web.
- App Mobile.
- Servidor Nginx.
- Aplicacion Web React.
- API Gateway.
- Auth Service.
- Citas Service.
- Consultas Service.
- Casos Service.
- Perfil Service.
- Publicaciones Service.
- PostgreSQL.
- Balanceador de Conexiones.
- Almacenamiento S3.
- CDN.
- Gateway SMS.
- Servidor SMTP.

### Conexiones

- Cliente, abogado y administrador acceden al dispositivo cliente mediante HTTPS.
- Cliente accede al dispositivo movil mediante HTTPS.
- Navegador web y app mobile se comunican con el servidor web mediante HTTPS.
- Servidor web se comunica con el servidor API mediante HTTP interno.
- Servidor API se conecta al servidor base de datos mediante JDBC por el puerto 5432.
- Servidor API se comunica con el servidor de archivos mediante API REST.
- Servidor API consume servicios externos mediante API externa.
- Dentro del servidor de base de datos, el balanceador de conexiones enruta las conexiones hacia PostgreSQL.

## Nota

- Este contenido se incluye dentro de `index.md` mediante Jekyll.
