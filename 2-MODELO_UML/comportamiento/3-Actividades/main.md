# Diagramas de Actividad

## Descripción

En esta sección se documentan los **diagramas de actividad** del sistema **SYS-Abogado-Doc**. Estos diagramas representan el flujo de acciones que realizan los usuarios dentro del sistema, mostrando el comportamiento de los procesos funcionales desde el inicio hasta su finalización.

Cada diagrama permite comprender cómo se ejecutan las actividades principales del sistema, qué decisiones se toman durante el proceso y cómo interactúan los actores con las funcionalidades implementadas.

Los diagramas de actividad son importantes porque ayudan a visualizar de manera clara el recorrido que sigue un usuario al utilizar los módulos del sistema, facilitando el análisis, diseño, validación y mantenimiento del proyecto.

---

# Diagrama de Actividad - Área Cliente

## Descripción

Este diagrama representa el flujo de actividades que realiza el cliente al ingresar al área personal del sistema. Desde este módulo, el usuario puede visualizar su información, revisar sus datos registrados y acceder a las funcionalidades disponibles según su perfil.

El Área Cliente permite centralizar la información del usuario, facilitando la administración de sus datos personales y el seguimiento de sus interacciones dentro del sistema.

### Actores involucrados

* Cliente
* Sistema

### Objetivo

Representar el flujo de actividades que realiza el cliente al acceder y utilizar su área personal dentro del sistema **SYS-Abogado-Doc**.

### Flujo general

1. El cliente ingresa al sistema.
2. El sistema valida el acceso del usuario.
3. El cliente accede al Área Cliente.
4. El sistema muestra la información registrada.
5. El cliente puede consultar o administrar sus datos.
6. El sistema actualiza o muestra la información correspondiente.

## Diagrama

![Actividad Área Cliente](https://www.plantuml.com/plantuml/png/NP31IWCn48RlUOe1B-r1iD8Yj0Uxh2ruK8I2zsaohR7PJ9cPNSy-YW_WoGSGt1SpApqKoMdc-yFt9qir56kRv2nQ8gYynIu63AHm2Vsx44AT8cKZv_GGyn456zYYF-o5snngJYnmCLaDvonHYV3R2TvDgwl9pHaCjCCssPgpdIBhMJsRNZltLyUv-NsEFgA0aiR-Ao-SYpiO_NnNtfCoTFr7Ye5lns0lb66qwJ_7vTOp2P0Q1YwA11wL5svUSzPYGu70lcqe6sjPRzfj_BTQvMwGbbdnbG0Ju9Rt6BYm9-6zO5EmZuQb42Kb63to87vWDIc8H5W6baFS3Q_XerkMOVZWNm00)

---

# Diagrama de Actividad - Citas

## Descripción

Este diagrama representa el proceso que sigue un cliente para solicitar una cita legal dentro del sistema. El flujo inicia cuando el cliente ingresa al módulo de citas y completa los datos necesarios para registrar su solicitud.

El sistema valida la información ingresada y registra la cita para que pueda ser revisada o atendida por el abogado. Este proceso permite organizar las atenciones legales de forma ordenada y controlada.

### Actores involucrados

* Cliente
* Sistema
* Abogado

### Objetivo

Mostrar el flujo de actividades necesario para registrar, validar y gestionar una cita legal entre el cliente y el abogado.

### Flujo general

1. El cliente ingresa al módulo de citas.
2. El sistema muestra el formulario de registro.
3. El cliente completa los datos de la cita.
4. El sistema valida la información ingresada.
5. Si los datos son correctos, el sistema registra la cita.
6. El abogado puede revisar la cita registrada.
7. El sistema muestra el estado de la cita al cliente.

## Diagrama

![Actividad Citas](https://www.plantuml.com/plantuml/png/7OxH3S8m34J_FOKNO87sfwX2YEzEO98hM4gSAZ4inWWiHiBdFJtTtT9Sghzo8bTFu7DmVMkKYCOdthGvid04h-hIYFuwqNGp3IgL6vf-FpRJj24X12tMwOxmbCuk2G-jd4kKD4exMeljMdENWlfmhZ3K4Ki-QhcBEUQnKmvQOB5V-m40)

---

# Diagrama de Actividad - Consultas

## Descripción

Este diagrama representa el flujo que sigue un cliente al registrar una consulta legal dentro del sistema. El cliente ingresa su consulta, el sistema valida los datos y posteriormente almacena la información para que pueda ser revisada por el abogado.

Este módulo permite que los clientes realicen preguntas o solicitudes de orientación legal sin necesidad de una atención presencial inmediata.

### Actores involucrados

* Cliente
* Sistema
* Abogado

### Objetivo

Visualizar el proceso de registro, almacenamiento y atención de consultas legales dentro del sistema **SYS-Abogado-Doc**.

### Flujo general

1. El cliente ingresa al módulo de consultas.
2. El sistema muestra el formulario correspondiente.
3. El cliente escribe su consulta legal.
4. El sistema valida que la información esté completa.
5. El sistema registra la consulta.
6. El abogado revisa la consulta registrada.
7. El sistema permite gestionar la respuesta o seguimiento de la consulta.

## Diagrama

![Actividad Consultas](https://www.plantuml.com/plantuml/png/BOx14S9024NlLB4Ds41oYQFUF9aAa4M76RBhB2JzM8Cbf369ySZZyVc3EJQV9mKNLqv7SbaaOsPBXtIgnMPrJ5T-eWByP81kh2eaCIJw6prqPpPgSfU0Q3N0oCf4Kajuwxin9jrYOdCfYmIqFMREWMvC-sqj3saJagoVqcylwmi6BZawVW40)

---

# Diagrama de Actividad - Gestión de Perfil

## Descripción

Este diagrama representa el proceso mediante el cual un usuario administra la información de su perfil dentro del sistema. El usuario puede visualizar sus datos personales, modificar información permitida y guardar los cambios realizados.

La gestión de perfil permite mantener actualizada la información del usuario, garantizando que los datos utilizados por el sistema sean correctos y estén disponibles para los procesos de citas, consultas y servicios legales.

### Actores involucrados

* Cliente
* Sistema

### Objetivo

Representar el flujo de actividades para la visualización, modificación y actualización de los datos del perfil del usuario.

### Flujo general

1. El usuario ingresa al sistema.
2. Accede al módulo de gestión de perfil.
3. El sistema muestra los datos registrados.
4. El usuario modifica la información necesaria.
5. El sistema valida los datos ingresados.
6. Si la información es correcta, el sistema guarda los cambios.
7. El sistema muestra un mensaje de confirmación.

## Diagrama

![Actividad Gestión de Perfil](https://www.plantuml.com/plantuml/png/ZLJDQXin4BxhAGPwIGw5fYGKd4DZDZyOsb9moNqipRf3jD8YQLtQj-a3v13w08NkYtLsLzaehWd5fsM-d_b6Cxw82KFg6giI9qkmr8btRD1GXDTmGp6nTnZWCuMQhLBnZbsB0HlOeBxR1jyvKtdh0xmwkHf-1M8PWl-MYvUdopSdxugYeHexcwwzInboVLQTdRvLQkn8gSNAiMQnZXIv_-NEbU8QZlxy_iAj5pfqiSF0_lqnfA_auAYoJ2xHiL80YrkMgkKVmc_7reKEC0bSKYG4CYn6CtlTtqlWIqm-3emegIt5Oo69sjM81RDNFP-gjs9afCokzg51FNKBCFkDj5t_Ks0-bewJl4ZSI9H1GcEpOP-5oKQ2eqz-HdtqCGL1aGms32FO3Swb8Jd3jPgeOfvJLTu9BrB_W3bGDVWCVa-L76Rbje7YynAWJZBDVOJhQ8S79CIkvj0SGfHZARgAWc6dsP0xE1xPoloQ_ugzFAMNndBjazy6hFlxF9RIftugvbXhigJrT0xSu9RStlkFhvyyV8U43VOFlaox6Xbv2_1WodMtuI3iRLw6eeN_NOZSGfbwdxQe15sUrIDGJRYbQTZne6jy4Cem5Ks60Y2qwCWEFZY3vkLRV91l38zd6GLc8N9Cr4ZxU_FBeE8enMHGcWSpdfpuvvpI8Elv14LwbfW3NbcMfcQEN3dgn3iXwOvSmk8_emZzR5zzItEYN8_9j-f2Fhh6_WK0)

---

# Diagrama de Actividad - Publicaciones

## Descripción

Este diagrama representa el flujo que sigue el abogado o administrador para crear y publicar contenido informativo dentro del sistema. Las publicaciones pueden contener información legal, noticias, recomendaciones o comunicados importantes para los usuarios.

El módulo de publicaciones permite administrar contenido visible para los clientes, contribuyendo a mantenerlos informados sobre temas legales relevantes.

### Actores involucrados

* Abogado
* Sistema

### Objetivo

Describir el flujo de actividades necesario para crear, validar, registrar y publicar contenido informativo dentro del sistema.

### Flujo general

1. El abogado ingresa al módulo de publicaciones.
2. El sistema muestra las opciones de administración.
3. El abogado crea una nueva publicación.
4. El sistema valida que el contenido esté completo.
5. El abogado confirma la publicación.
6. El sistema registra y publica el contenido.
7. La publicación queda disponible para ser visualizada por los usuarios.

## Diagrama

![Actividad Publicaciones](https://www.plantuml.com/plantuml/png/ZLJDQXin4BxhAGPwIGw5fYGKd4DZDZyOsb9moNqipRf3jD8YQLtQj-a3v13w08NkYtLsLzaehWd5fsM-d_b6Cxw82KFg6giI9qkmr8btRD1GXDTmGp6nTnZWCuMQhLBnZbsB0HlOeBxR1jyvKtdh0xmwkHf-1M8PWl-MYvUdopSdxugYeHexcwwzInboVLQTdRvLQkn8gSNAiMQnZXIv_-NEbU8QZlxy_iAj5pfqiSF0_lqnfA_auAYoJ2xHiL80YrkMgkKVmc_7reKEC0bSKYG4CYn6CtlTtqlWIqm-3emegIt5Oo69sjM81RDNFP-gjs9afCokzg51FNKBCFkDj5t_Ks0-bewJl4ZSI9H1GcEpOP-5oKQ2eqz-HdtqCGL1aGms32FO3Swb8Jd3jPgeOfvJLTu9BrB_W3bGDVWCVa-L76Rbje7YynAWJZBDVOJhQ8S79CIkvj0SGfHZARgAWc6dsP0xE1xPoloQ_ugzFAMNndBjazy6hFlxF9RIftugvbXhigJrT0xSu9RStlkFhvyyV8U43VOFlaox6Xbv2_1WodMtuI3iRLw6eeN_NOZSGfbwdxQe15sUrIDGJRYbQTZne6jy4Cem5Ks60Y2qwCWEFZY3vkLRV91l38zd6GLc8N9Cr4ZxU_FBeE8enMHGcWSpdfpuvvpI8Elv14LwbfW3NbcMfcQEN3dgn3iXwOvSmk8_emZzR5zzItEYN8_9j-f2Fhh6_WK0)

---

# Diagrama de Actividad - Servicios Legales

## Descripción

Este diagrama representa el proceso que sigue un cliente al solicitar un servicio legal dentro del sistema. El cliente selecciona el servicio requerido, registra su solicitud y el sistema gestiona la información para que pueda ser revisada por el abogado.

Este módulo permite organizar las solicitudes de servicios legales de manera eficiente, facilitando la comunicación entre el cliente y el abogado.

### Actores involucrados

* Cliente
* Sistema
* Abogado

### Objetivo

Mostrar el flujo completo de actividades para la solicitud, registro y gestión de servicios legales dentro del sistema **SYS-Abogado-Doc**.

### Flujo general

1. El cliente ingresa al módulo de servicios legales.
2. El sistema muestra los servicios disponibles.
3. El cliente selecciona el servicio que necesita.
4. El cliente registra la solicitud.
5. El sistema valida la información ingresada.
6. El sistema almacena la solicitud.
7. El abogado revisa el servicio solicitado.
8. El sistema permite gestionar el estado de la solicitud.

## Diagrama

![Actividad Servicios Legales](https://www.plantuml.com/plantuml/png/7OwnhS9038PxJ-45tW99a-WLD7IHe3Pt1bcwiz6TmpxCm0XP31-DfV_pP_bVkbFplHPmySAu9fUNPChSyGytwSwLyCetFFE32i3F1vZ-JVjU8g3etLgb9CT7PvWsAv9aBCOCiAR4cHiUxyQ4gGYhS_1BC3KFcNh44tSNqt5d8QXacySxUyB2cgFY5m00)

---

# Conclusión

Los diagramas de actividad permiten comprender el comportamiento funcional del sistema **SYS-Abogado-Doc**, mostrando de manera ordenada las acciones que realizan los usuarios y las respuestas del sistema durante cada proceso.

Estos diagramas son una herramienta fundamental dentro del modelo de comportamiento, ya que ayudan a identificar los pasos principales, las decisiones del flujo y la participación de los actores en cada módulo. Además, facilitan la documentación, el análisis y la futura mejora del sistema.

---

# Tecnologías utilizadas

* PlantUML
* Visual Studio Code
* Git
* GitHub
* Markdown
* Jekyll

---

# Nota

Esta documentación forma parte del **Modelo de Comportamiento** del proyecto **SYS-Abogado-Doc**. El contenido se incluye dentro del archivo `index.md` mediante **Jekyll**, permitiendo visualizar los diagramas y su descripción dentro de la plataforma de documentación del proyecto.

Todos los diagramas fueron elaborados utilizando **PlantUML**, siguiendo los estándares definidos por el equipo de desarrollo.
