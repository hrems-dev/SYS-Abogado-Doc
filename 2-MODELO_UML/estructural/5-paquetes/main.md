## Descripción

En esta sección se documentan los diagramas de paquetes que muestran la organización de clases en paquetes y las dependencias entre paquetes.

## Contenido

![diagrma de paquetes](https://www.plantuml.com/plantuml/png/XLNTJXiz4BtVfx2u-ZvLy01SLAH9e23QHFafbIek9lPacNRNTkrP85Gy5O_0YzLPXzIREErUHCevu_6SdJEpPvx1SLDN1HDNA0O4fOCQX48nXfyDCdfnB4Qk14rF8EdrHGUk4ltN5qMbAOh2Wlm19OeZQUeJwq0oIJZnAmyBKu8oHmAyc8n6C_6h4E5fVxQ7h4EFce79w3PoF1bEOsJxVEiRpSvK8P7hDNntcsNwnE0FKE3D0MgCRadL0QvPL2I3OAFnmF6Ugab7wZcZpAEx9ucjgEbmyYKLjLOoZNoQcnWoQ12GGOtsJPMBZwhsyKJHFldPC2qpR5QPGsiyiN6hsDlXU9IAc_i679d9Dcf7Ofu0dpcH2CsIYQOiFp2ogL7pNkgShDeeh5f5dqQ3uNL6KbfMHQWP4wGNxPuWhK78imkmsta9Ez8pWlCoS-BoVVohDMNZY5SRR_PJgLSFF7RcdXIwsmvwJXLtiBb7Dq06glp6CfUrJSTfkhacA5fIURWSsV9jCVtpYywSM1iFTzwFytlWz07A4jqUVeEBsAb_rQ0uBgh1hEFbQrEIdc1OX9vlzs1lZVQx4vn4fzvEWzD1JObyQVWeqMxtu_1hfrqNbLb0DNmB-GXQLPqkXVocSHA3CyvDezKsD8dv06fJTPVDbjCmnIcPpouxGp80ndaWqtKPJ9DYMuCpQFPlTpmNHRlrZu_VnqrvAXHQr0gBzc_0soKJyFNbz0HRF8vg86gm24KRbS8MdIVFwqJz3k5mYGwr92X2opiKEz1-IO7-KrQ82Gm-MgCJDFIYlLhZzwIaY5QWds1xRV1rmABH6mT5eGsZO6E5MSQFu-dEHnQra631Y_-kOOKEbUWvUKUCaXk7_yS42yDiwdMES558CSMGdHIezLNYwcOctecfTQHByJQCHN66Mgs_-By1)

### Paquetes Definidos

- (Listar paquetes)
- com.practica.sysabogado: paquete raiz del sistema.
- presentation: capa de controladores que expone las funcionalidades del sistema.
- service: capa de servicios con la logica de negocio.
- repository: capa de acceso a datos.
- model: capa de entidades del dominio.
- security: componentes de autenticacion, autorizacion y configuracion de seguridad.
- config: configuraciones generales de la aplicacion.
- dto: objetos de transferencia de datos para solicitudes y respuestas.
- exception: manejo centralizado de errores y excepciones.
- util: utilidades y constantes compartidas.

### Elementos en Paquetes

- (Listar elementos)
- presentation: ControladorAuth, ControladorCitas, ControladorCasos, ControladorPerfil, ControladorPublicaciones y ControladorAdmin.
- service: AuthService, CitaService, CasoService, ConsultaService, PerfilService, PublicacionService y NotificacionService.
- repository: UsuarioRepository, CitaRepository, CasoRepository, ConsultaRepository, PublicacionRepository y DocumentoRepository.
- model: Usuario, Cliente, Abogado, Administrador, Cita, Caso, Consulta, Publicacion, Documento y Notificacion.
- security: JwtProvider, JwtFilter, UserDetailsServiceImpl y SecurityConfig.
- config: AppConfig, CorsConfig, SwaggerConfig y WebClientConfig.
- dto: LoginRequest, LoginResponse, CitaRequest, CasoResponse y PerfilResponse.
- exception: GlobalExceptionHandler, ResourceNotFoundException y BadRequestException.
- util: DateUtils, FileUtils y Constants.

### Dependencias entre Paquetes

- (Listar dependencias)
- presentation depende de service.
- service utiliza repository.
- service mapea model.
- repository persiste model.
- security referencia model.
- dto transfiere model.
- presentation expone dto.
- presentation maneja exception.
- service lanza exception.
- security configura config.

## Nota

- Este contenido se incluye dentro de `index.md` mediante Jekyll.
