# Patron Singleton - SYS-ABOGADO

## Descripcion

El patron **Singleton** garantiza que una clase tenga una unica instancia disponible para todo el sistema.

En SYS-ABOGADO se aplica para centralizar parametros compartidos de configuracion legal, como horarios de atencion, correo oficial de notificaciones, telefono de emergencia, areas legales disponibles y limite de documentos por caso.

## Problema

Distintos servicios del sistema necesitan consultar los mismos parametros operativos:

- Citas necesita validar horarios de atencion.
- Consultas necesita validar areas legales disponibles.
- Casos necesita controlar limites de documentos.
- Notificaciones necesita usar canales oficiales de contacto.

Si cada servicio define estos valores por separado, se generan inconsistencias, duplicacion y mayor dificultad de mantenimiento.

## Solucion

Se define la clase `ConfiguracionSistemaLegal` como Singleton. Esta clase:

- Tiene constructor privado.
- Mantiene una instancia unica y compartida.
- Expone el metodo `getInstancia()` para acceder a la configuracion.
- Centraliza valores usados por varios servicios del sistema.

## Diagrama UML

![Diagrama Singleton](https://www.plantuml.com/plantuml/png/ZPHXQzj038Q_twyus9UKqB2Mba48eKdQheDk5D8_eDgAU-lv57JdR6pilqztSJB7TfCb1CxHy-ga5ratFW27ghGgc61HFq5WSdffN64noEbSByYjJ54nP4QUSxGIzG5Bq8zOW5NAlnct1ePIlq3sLZ1LBb-G9TOVBkxYjq7ak8BAXdjoeKRkhnVNLvSDPCPCF-hWxTNiuyMdHZ2puFqnTGBcn3doqHppTgcNy_XjOmy8aga3rtsfn1mwL9kJlD6JoTx9wLJ_Lbe-vzeuSTrb1iRlIslqbHZOq2oWYyHOBmDBnZgQ4JFIDmfcPRAK0dqB2MXnHOxkIkG2jvSU02NylAMiAj45ya_42_0qbX937GT6yAcacFjHIfnizTCQUBU5mLaYXhh0y6NNyk3iLDE9VpZiEweQLITaqTDy7_VSSQ2F-jfZG-HsHYHerl0Y1Zjk33Nw22LcIMlY03aCeeUxAqNsGcGHdFgp7o0JO8cyCHdMGpBKQwP2nX0u1kDb6p9vGqBEoulKaJ4MKfIOjmDwfD9QMmRvzyh9AjXxq9KrdMxBqMqCS9DewfljZKRJ8-_BM4PwM_PkybMxqLC9Dc1D3cbijKr3rUptFzNMb2QWplSJeVgwFvMiyg0pS75QD8dOn9DIZYGrc-8roBz7NeRFiePSCBz0Lox-vFP_gqF79QNIfa9PsLwCA-Kfc5pESKdxRQgHGfVhUALIDtACg_ul)

El diagrama PlantUML se encuentra en:

- [diagrama-singleton.puml](./diagrama-singleton.puml)

## Codigo Java

La implementacion Java se encuentra en:

- [ConfiguracionSistemaLegal.java](./ConfiguracionSistemaLegal.java)

## Participantes

- `ConfiguracionSistemaLegal`: clase Singleton que mantiene la configuracion global.
- `CitaService`: consulta horarios de atencion.
- `ConsultaService`: valida areas legales soportadas.
- `CasoService`: valida el limite de documentos por caso.
- `NotificacionService`: obtiene canales oficiales de notificacion.

## Ventajas en el Proyecto

- Evita duplicar configuracion en varios servicios.
- Mantiene criterios uniformes para citas, consultas, casos y notificaciones.
- Facilita cambios futuros en parametros generales del sistema.
- Controla el acceso a configuraciones compartidas desde una unica instancia.

## Consideracion

En aplicaciones Spring Boot, muchos componentes ya se administran como instancias unicas por el contenedor. Este ejemplo documenta el patron Singleton de forma explicita para representar una configuracion compartida del dominio del sistema.
