# App 2 - Eventos Implícitos y Explícitos (Intents)

## Resumen del Proyecto
Aplicación Android desarrollada en Java para demostrar la comunicación entre componentes mediante Intents.
- **Versión de Android/AGP:** (Ej: Android SDK 34 / AGP 8.3)
- **Lenguaje:** Java

## Listado de Intents Implementados
### Intents Implícitos (5)
1. **Abrir Sitio Web:** `ACTION_VIEW` hacia la web institucional.
2. **Marcar Teléfono:** `ACTION_DIAL` con un número predefinido.
3. **Enviar Correo:** `ACTION_SENDTO` para redactar un email.
4. **Configuración Wi-Fi:** `Settings.ACTION_WIFI_SETTINGS` para abrir los ajustes.
5. **Abrir Mapa:** `ACTION_VIEW` con esquema `geo:` para mostrar una ubicación.

### Intents Explícitos (3)
6. **Navegación con Datos:** `MainActivity` -> `DetalleActivity` (paso de variables con `putExtra`).
7. **Navegación Simple:** `MainActivity` -> `ConfigActivity`.
8. **Navegación Simple:** `MainActivity` -> `AyudaActivity`.

## Capturas de Pantalla
*(Arrastra aquí tus capturas de pantalla o un GIF de la app funcionando. Mínimo 4 capturas).*
📱 🗺️ ⚙️

## Instrucciones de Compilación y APK
El APK de debug se genera automáticamente al compilar el proyecto y se encuentra en la siguiente ruta:
`app/build/outputs/apk/debug/app-debug.apk`