# SYS-ABOGADO - Documentacion de Analisis del Sistema

Este repositorio contiene la documentacion de analisis y modelado del sistema **SYS-ABOGADO**, una plataforma orientada a la gestion de servicios legales, citas, consultas, casos, perfiles de usuario y publicaciones informativas.

La documentacion se organiza mediante modelos C4 y diagramas UML elaborados con PlantUML, con el objetivo de representar tanto la arquitectura general del sistema como su estructura interna y comportamiento funcional.

## Objetivo del Proyecto

Documentar el analisis del sistema SYS-ABOGADO para facilitar la comprension, validacion y posterior desarrollo de una solucion digital para la gestion de servicios legales.

El sistema busca centralizar la relacion entre clientes, abogados y administradores, permitiendo registrar consultas, gestionar citas, dar seguimiento a casos legales, administrar documentos y publicar contenido informativo.

Los documentos de referencia ubicados en la carpeta `info/` complementan el analisis con lineamientos para una pagina de servicios legales comunitarios, estructura de contenido publico, base de datos y consideraciones regulatorias para publicaciones digitales.

## Alcance

El alcance del proyecto documental incluye:

- Identificacion de actores principales del sistema.
- Definicion de casos de uso por modulo funcional.
- Representacion del comportamiento del sistema mediante diagramas UML.
- Representacion de la estructura del sistema mediante diagramas UML.
- Descripcion de componentes, paquetes, clases, objetos y despliegue.
- Organizacion de la documentacion para consulta desde archivos Markdown y una pagina unificada.

El alcance funcional del sistema incluye:

- Gestion de usuarios con roles de cliente, abogado y administrador.
- Gestion del area personal del cliente.
- Registro y seguimiento de consultas legales.
- Programacion, confirmacion, reprogramacion y cancelacion de citas.
- Gestion de casos legales y documentos asociados.
- Gestion de perfil de usuario.
- Creacion, edicion, publicacion y administracion de publicaciones.
- Consulta de servicios legales, noticias y recursos informativos.
- Envio de notificaciones por correo o SMS.
- Publicacion de informacion institucional, servicios disponibles, areas legales y canales de contacto.
- Registro de solicitudes de orientacion o consulta gratuita cuando aplique al servicio comunitario.
- Consulta de criterios de elegibilidad, requisitos y documentacion necesaria para acceder a servicios.

## Actores Principales

- **Cliente:** usuario que solicita servicios legales, agenda citas, registra consultas, consulta casos y administra su informacion personal.
- **Abogado:** usuario encargado de atender consultas, gestionar casos y crear publicaciones informativas.
- **Administrador:** usuario responsable de administrar usuarios, contenido y configuraciones generales del sistema.
- **Visitante:** usuario no autenticado que puede consultar informacion publica sobre servicios legales y publicaciones.

## Areas y Servicios Legales

De acuerdo con la informacion de referencia del proyecto, el sistema puede contemplar servicios relacionados con:

- Derecho penal.
- Derecho civil.
- Derecho de familia.
- Derechos humanos.
- Asesoria legal comunitaria.
- Representacion y orientacion juridica.
- Recursos educativos y guias legales.

## Requerimientos Funcionales

| Codigo | Requerimiento |
|:------:|---------------|
| RF01 | El sistema debe permitir el inicio de sesion y cierre de sesion de usuarios. |
| RF02 | El sistema debe permitir gestionar usuarios con roles de cliente, abogado y administrador. |
| RF03 | El cliente debe poder consultar su area personal y el estado de sus casos. |
| RF04 | El cliente debe poder registrar consultas legales indicando descripcion y area juridica. |
| RF05 | El cliente debe poder programar citas legales seleccionando fecha, motivo y modalidad. |
| RF06 | El sistema debe permitir confirmar, reprogramar o cancelar citas. |
| RF07 | El abogado debe poder atender consultas y registrar respuestas. |
| RF08 | El abogado debe poder actualizar el estado de los casos asignados. |
| RF09 | El sistema debe permitir asociar documentos a los casos legales. |
| RF10 | El usuario debe poder visualizar y actualizar su perfil. |
| RF11 | El abogado debe poder crear, editar y publicar contenido informativo. |
| RF12 | El administrador debe poder gestionar publicaciones y eliminar contenido cuando sea necesario. |
| RF13 | El sistema debe permitir consultar servicios legales, noticias y recursos educativos. |
| RF14 | El sistema debe generar notificaciones para eventos relevantes como citas, consultas o actualizaciones de casos. |
| RF15 | El sistema debe mostrar informacion publica sobre servicios legales, areas de atencion, horarios y canales de contacto. |
| RF16 | El sistema debe permitir registrar solicitudes de orientacion, consulta gratuita o contacto inicial desde la pagina publica. |
| RF17 | El sistema debe permitir publicar requisitos, criterios de elegibilidad y documentos necesarios para acceder a servicios comunitarios. |
| RF18 | El sistema debe permitir administrar testimonios, casos de exito o contenido institucional cuando sea aprobado por el administrador. |
| RF19 | El sistema debe ofrecer recursos educativos como guias, preguntas frecuentes, noticias y publicaciones legales. |

## Requerimientos No Funcionales

| Codigo | Requerimiento |
|:------:|---------------|
| RNF01 | El sistema debe proteger el acceso mediante autenticacion y autorizacion por roles. |
| RNF02 | La comunicacion entre cliente, frontend y servidor debe realizarse usando HTTPS. |
| RNF03 | El sistema debe organizarse por capas para separar presentacion, servicios, datos, seguridad y configuracion. |
| RNF04 | El sistema debe permitir integracion con servicios externos de correo y SMS. |
| RNF05 | La base de datos debe centralizar la informacion de usuarios, citas, casos, consultas, documentos y publicaciones. |
| RNF06 | La arquitectura debe facilitar mantenimiento, escalabilidad y trazabilidad de los modulos. |
| RNF07 | La documentacion debe mantenerse sincronizada con los diagramas UML del proyecto. |
| RNF08 | La interfaz publica debe ser responsiva y adaptarse a dispositivos moviles. |
| RNF09 | El contenido publico debe usar lenguaje claro, accesible y verificable. |
| RNF10 | El sitio debe considerar buenas practicas de accesibilidad web y SEO. |
| RNF11 | La plataforma debe proteger datos personales, documentos legales y comunicaciones de los usuarios. |
| RNF12 | Las publicaciones deben respetar lineamientos legales, regulatorios y de neutralidad cuando aplique. |

## Secciones Publicas Recomendadas

Segun los documentos de referencia de la carpeta `info/`, la pagina publica del sistema puede organizarse con estas secciones:

- Inicio: presentacion del servicio, mensaje principal y llamados a la accion.
- Sobre nosotros: descripcion del equipo, enfoque comunitario y trayectoria.
- Servicios legales: listado de areas juridicas y servicios disponibles.
- Consulta u orientacion gratuita: formulario inicial para registrar solicitudes.
- Recursos: guias, preguntas frecuentes, noticias y material educativo.
- Contacto: direccion, telefono, correo, horarios y canales de emergencia si aplican.
- Testimonios o casos de exito: contenido validado por el administrador.
- Requisitos y elegibilidad: criterios para acceder a servicios comunitarios.

## Documentos de Referencia

La carpeta `info/` contiene documentos base que complementan el analisis:

- `Base de Datos - Desarrollo Web Dr. Percy y Jafet.pdf`: referencia para informacion, entidades y datos del sistema.
- `Estructura Completa - Pagina Web Servicios Legales Comunitarios.pdf`: referencia para estructura publica, servicios, contacto y contenido comunitario.
- `Informe Pagina Web para Candidato - Analisis y Regulaciones.pdf`: referencia de buenas practicas, regulaciones y control de contenido publico.
- `Informe_ Contenido de Pagina Web para Candidato - Analisis y Regulaciones.pdf`: referencia complementaria de contenido, requisitos no funcionales y lineamientos de publicacion.

## Modelo C4

- [Modelo C4](./1-MODELO_C4/)

## Modelo UML - Comportamiento

Los diagramas de comportamiento describen como interactuan los actores con el sistema y como evolucionan los procesos principales.

- [Casos de Uso](./2-MODELO_UML/comportamiento/1-caso_uso/main.md)
- [Diagrama de Secuencia](./2-MODELO_UML/comportamiento/2-Secuencia/main.md)
- [Diagrama de Actividades](./2-MODELO_UML/comportamiento/3-Actividades/main.md)
- [Diagrama de Estado](./2-MODELO_UML/comportamiento/4-Estado/main.md)
- [Diagrama de Tiempos](./2-MODELO_UML/comportamiento/5-Tiempos/main.md)
- [Diagrama de Comunicacion](./2-MODELO_UML/comportamiento/6-Comunicacion/main.md)

## Modelo UML - Estructural

Los diagramas estructurales describen la organizacion interna del sistema, sus entidades, componentes, paquetes y despliegue.

- [Diagrama de Clases](./2-MODELO_UML/estructural/1-Clases/main.md)
- [Diagrama de Objetos](./2-MODELO_UML/estructural/2-objetos/main.md)
- [Diagrama de Componentes](./2-MODELO_UML/estructural/3-componentes/main.md)
- [Diagrama de Despliegue](./2-MODELO_UML/estructural/4-despliegue/main.md)
- [Diagrama de Paquetes](./2-MODELO_UML/estructural/5-paquetes/main.md)
- [Diagrama de Perfil](./2-MODELO_UML/estructural/6-perfil/main.md)

## Patrones de Diseno

Los patrones de diseno documentan soluciones reutilizables aplicadas a problemas comunes dentro de la arquitectura del sistema.

- [Patron Singleton](./3-PATRONES_DISENO/1-singleton/main.md)

## Arquitectura General

Segun los diagramas del proyecto, SYS-ABOGADO se plantea con una arquitectura por capas:

- **Capa de presentacion:** frontend web, modulo cliente y modulo administrador.
- **Capa de servicios:** API Gateway y servicios de autenticacion, citas, consultas, casos, perfil, publicaciones y notificaciones.
- **Capa de datos:** repositorios y base de datos para usuarios, citas, casos, consultas, documentos y publicaciones.
- **Capa de integracion:** clientes externos para SMS, correo electronico y otros servicios.
- **Capa de seguridad:** autenticacion JWT, filtros de seguridad, configuracion de roles y control de acceso.

## Estructura Actual del Repositorio

```text
SYS-Abogado-Doc/
|-- README.md
|-- index.md
|-- _config.yml
|-- _layouts/
|   `-- default.html
|-- info/
|-- 1-MODELO_C4/
|-- 2-MODELO_UML/
|   |-- comportamiento/
|   |   |-- 1-caso_uso/
|   |   |-- 2-Secuencia/
|   |   |-- 3-Actividades/
|   |   |-- 4-Estado/
|   |   |-- 5-Tiempos/
|   |   `-- 6-Comunicacion/
|   `-- estructural/
|       |-- 1-Clases/
|       |-- 2-objetos/
|       |-- 3-componentes/
|       |-- 4-despliegue/
|       |-- 5-paquetes/
|       `-- 6-perfil/
`-- 3-PATRONES_DISENO/
    `-- 1-singleton/
```

## Estructura Recomendada

Para mantener el proyecto ordenado a medida que crezca, se recomienda la siguiente estructura:

```text
SYS-Abogado-Doc/
|-- README.md
|-- index.md
|-- _config.yml
|-- _layouts/
|   `-- default.html
|-- info/
|-- docs/
|   |-- 1-modelo-c4/
|   |   |-- contexto/
|   |   |-- contenedores/
|   |   |-- componentes/
|   |   `-- codigo/
|   |-- 2-modelo-uml/
|   |   |-- comportamiento/
|   |   |   |-- casos-uso/
|   |   |   |-- secuencia/
|   |   |   |-- actividades/
|   |   |   |-- estado/
|   |   |   |-- tiempos/
|   |   |   `-- comunicacion/
|   |   `-- estructural/
|   |       |-- clases/
|   |       |-- objetos/
|   |       |-- componentes/
|   |       |-- despliegue/
|   |       |-- paquetes/
|   |       `-- perfil/
|   |-- requerimientos/
|   |   |-- funcionales.md
|   |   |-- no-funcionales.md
|   |   `-- reglas-negocio.md
|   |-- arquitectura/
|   |   |-- decisiones.md
|   |   |-- tecnologias.md
|   |   `-- despliegue.md
|   |-- patrones-diseno/
|   |   `-- singleton/
|   `-- anexos/
|       |-- glosario.md
|       `-- referencias.md
`-- assets/
    `-- images/
```

## Herramientas

- **Markdown:** documentacion textual del proyecto.
- **PlantUML:** definicion de diagramas UML.
- **Jekyll:** generacion de documentacion unificada.

## Pagina Unificada

- [Ver documentacion unificada](./index.md)

## Recomendaciones de Mantenimiento

- Actualizar los archivos `main.md` cuando se modifique un diagrama PlantUML.
- Mantener nombres de carpetas y archivos consistentes.
- Separar requerimientos, reglas de negocio y decisiones arquitectonicas en documentos propios cuando el proyecto crezca.
- Validar que los enlaces internos funcionen antes de publicar la documentacion.
- Conservar una trazabilidad clara entre requerimientos, casos de uso y diagramas.
