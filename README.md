# Guía de TDD con JUnit 5, Mockito y Spring Boot

Ejercicios de pruebas automatizadas en Java, en tres módulos independientes que van de lo más simple a lo más completo.

| Módulo | Qué se practica |
|---|---|
| [`junit5`](junit5) | Aserciones, ciclo de vida, tests anidados, condicionales, repetidos, parametrizados (`@ValueSource`, `@CsvSource`, `@CsvFileSource`, `@MethodSource`), etiquetas y timeouts. |
| [`mockito`](mockito) | Mocks y spies, `when`/`verify`, argument matchers y captors, `doThrow`, `doAnswer`, `doCallRealMethod`, orden y número de invocaciones. |
| [`spt`](spt) | Tests en Spring Boot: servicio con `@MockBean`, repositorios con `@DataJpaTest`, controlador con `MockMvc` y pruebas de integración con `WebTestClient`. |

Los tres usan el mismo dominio de ejemplo: cuentas bancarias con transferencias, y exámenes con preguntas.

## Cómo ejecutar

Requiere Java 11 y Maven. Cada módulo se ejecuta por separado:

```bash
cd junit5
mvn test
```

El módulo `spt` incluye el wrapper de Maven (`./mvnw test`) y usa una base H2 en memoria.

## Tests desactivados a propósito

Algunos tests están hechos para **fallar** y así ver el mensaje que da la herramienta: datos parametrizados que no coinciden en `junit5`, y verificaciones de Mockito que no se cumplen en `mockito`. Están marcados con `@Disabled` y una explicación, para que la suite pase completa. Quita la anotación para verlos fallar.

## API del módulo spt

| Ruta | Método | Descripción |
|---|---|---|
| `/api/cuentas` | `GET` | Lista las cuentas |
| `/api/cuentas/{id}` | `GET` | Detalle de una cuenta (404 si no existe) |
| `/api/cuentas` | `POST` | Crea una cuenta |
| `/api/cuentas/{id}` | `DELETE` | Elimina una cuenta |
| `/api/cuentas/transferir` | `POST` | Transfiere dinero entre dos cuentas |
