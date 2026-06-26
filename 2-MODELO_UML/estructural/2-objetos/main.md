# Diagramas de Objetos

## Descripción

En esta sección se presentan los **diagramas de objetos** correspondientes al sistema **SYS-Abogado-Doc**. Estos diagramas representan instancias concretas de las clases principales del sistema, mostrando los valores de sus atributos y las relaciones existentes entre ellas en un instante determinado.

Los diagramas permiten comprender cómo interactúan los diferentes objetos del sistema durante la ejecución de los principales procesos del negocio, proporcionando una representación clara de la información manejada por cada módulo.

---

# Diagrama de Objetos - Área Cliente

## Descripción

Este diagrama representa las instancias relacionadas con el módulo **Área Cliente**, mostrando la información del cliente, su cuenta, los casos registrados y las citas asociadas. Permite visualizar la relación entre los objetos que participan cuando un cliente accede a su área personal dentro del sistema.

### Objetos representados

- Cliente
- Cuenta
- Caso
- Cita

### Objetivo

Representar la estructura de objetos involucrados en la gestión de información del cliente.

## Diagrama

![Diagrama Área Cliente](//www.plantuml.com/plantuml/png/TP3Hpj8m5CVlznGdytf-tGG-GsB2660qCPZC6ozBMw2mzP3JLXED5pwEpy6BkPPX6FYbDwV__ixlj9rPnydvjacSTes2-ckTrH_gByjFPLREr-_BnHeoM6yEok4Kphz9SQWQhOnJIMAFsfmuyHOsN1ntXDx82XiaU9KlmxeXWaAu-JrNpCDwv92aefvPZ4gMFpymApIk9rRZQZmgReYI2B-_r2xLbllcF_q9HZ6a_GjJu1R4fOQV2O2My0xohZ3ORaXrc_IZvmO-d_-G-f5s1zBeaER5cz5uylmsH0A958RqqB6pNSjryrfWcoQ_RYRwRWY_38nbdEUjvwJ_zPw2Jbd7POnAuVGt76gunOkaAw92eDIxY5TbdJ6M3nrB0oT2eUoTHryle_khR9NOyz1Hi2SsUIfOCGccFL9CSpPbB2gk_vLb_Ki62RSusElkF9af8ttR_0K0)

---

# Diagrama de Objetos - Citas

## Descripción

Este diagrama representa las instancias utilizadas para la administración de citas legales entre el cliente y el abogado. Se muestran los objetos involucrados durante el proceso de programación de una cita.

### Objetos representados

- Cliente
- Cita
- Abogado

### Objetivo

Mostrar la relación existente entre el cliente, la cita registrada y el abogado encargado de atenderla.

## Diagrama

![Diagrama Citas](//www.plantuml.com/plantuml/png/TO_HIlD048Nlzoc6_DVvkmbjbOBGD6r5GLg8DrvEacqRkzcHoGP1yO5y3b_CJT9WjChUd1c-SyxilBB8jYwri8NL2fA7n4zkallLNUH7YyrrjDo03vlqKLcQGLnOh8IeZeLvGiOIKioEUwRQv35fOlWNh9et81fhPXS_kN3Hl7EEE5TyOfRZI0ONPyoQZ3qHwqay6OS38cAcvx_ikTfXhN_n2sg3mOjreOnL7c05MQVXLG0KELn1u8IXCcNb1k-sHWFRZtTMBvvu6qGK5Zk_4mFpnAcToWxOc4CvajDHACEfvzO7udORo9cKpK9L5dDgLbjbykwaOKUKqju1RGrs-glfyjkPI_uFCRAc2XAorCRqF_FzzaZHH_IpcBlMkjIV)

---

# Diagrama de Objetos - Consultas

## Descripción

Este diagrama representa las instancias utilizadas para el registro y seguimiento de consultas legales realizadas por los clientes del sistema.

### Objetos representados

- Cliente
- Consulta
- Abogado

### Objetivo

Visualizar los objetos que intervienen durante el proceso de registro y atención de consultas jurídicas.

## Diagrama

![Diagrama Consultas](objeto-consultas.svg)

---

# Diagrama de Objetos - Publicación

## Descripción

Este diagrama representa las instancias relacionadas con la creación y publicación de contenido informativo por parte del abogado. Incluye la publicación realizada y la categoría a la que pertenece.

### Objetos representados

- Abogado
- Publicación
- Categoría

### Objetivo

Representar la estructura de objetos utilizada para administrar las publicaciones del sistema.

## Diagrama

![Diagrama Publicación](objeto-publicacion.svg)

---

# Diagrama de Objetos - Servicios Legales

## Descripción

Este diagrama representa las instancias correspondientes a los servicios legales ofrecidos por el sistema, mostrando la relación entre el cliente, el abogado y el servicio seleccionado.

### Objetos representados

- Cliente
- Servicio Legal
- Abogado

### Objetivo

Representar la información utilizada para la administración y prestación de los servicios legales disponibles.

## Diagrama

![Diagrama Servicios Legales](objeto-servicio_legales.svg)

---

# Conclusión

Los diagramas de objetos permiten representar una vista estática del sistema mediante instancias reales de las clases implementadas. Gracias a esta representación es posible comprender la organización de la información, los atributos utilizados y las relaciones existentes entre los distintos módulos del sistema **SYS-Abogado-Doc**, facilitando el análisis, mantenimiento y evolución del software.

---

# Tecnologías utilizadas

- PlantUML
- Visual Studio Code
- Git
- GitHub
- Markdown
- Jekyll

---

# Nota

Esta documentación forma parte del **Modelo Estructural** del proyecto **SYS-Abogado-Doc** y es utilizada por la plataforma de documentación generada mediante **Jekyll**. Los diagramas fueron desarrollados utilizando **PlantUML**, siguiendo la estructura y estándares definidos por el equipo de desarrollo.