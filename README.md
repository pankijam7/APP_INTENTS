📱 App de Navegación e Intents 🚀

¡Hola! Bienvenido a este repositorio. Este proyecto es una aplicación nativa para Android donde pongo en práctica cómo hacer que una app se comunique con el teléfono y cómo movernos entre diferentes pantallas sin que todo explote en el intento. 😅

🛠️ ¿Qué tecnologías utilizamos?

Para darle vida a este proyecto, usamos las siguientes herramientas:

☕ Java: El cerebro de la app. Lo usamos para escribir toda la lógica, hacer que los botones funcionen y controlar qué pasa cuando el usuario hace clic.

🎨 XML: Aquí armamos la "cara" de la app. Lo usamos para el diseño visual, acomodar los botones y crear esas tarjetas bonitas (CardView) con colores y sombras.

💻 Android Studio: El programa (IDE) donde pasamos horas escribiendo y probando el código.

🐙 Git y GitHub: Nuestro salvavidas para ir guardando el código paso a paso en la rama feature/intents y no perder nada.

🎮 ¿Qué hace la aplicación?

La app es como un panel de control dividido en dos partes principales:

🌐 1. Eventos Implícitos (Le pedimos ayuda al celular)

Son 5 botones que le dicen al teléfono: "Oye, necesito hacer esto, busca qué app tienes instalada para lograrlo".

🌍 Abrir la página web de Santo Tomás.

📞 Marcar un número de teléfono en el teclado.

✉️ Dejar un correo electrónico listo para enviar.

⚙️ Abrir la configuración del Wi-Fi del celular.

🗺️ Abrir Google Maps en una ubicación específica (Santiago).

📱 2. Eventos Explícitos (Nos movemos en nuestra propia casa)

Son 3 botones donde nosotros controlamos todo el viaje hacia otras pantallas de nuestra misma app:

📩 Ver Detalles: Viajamos a otra pantalla y le mandamos un "mensaje secreto" (datos) para que lo muestre.

🛠️ Ajustes: Abrimos un menú de configuración visual.

❓ Ayuda / FAQ: Abrimos una sección de preguntas frecuentes.

🧠 ¿Qué aprendimos con todo esto? (Lo más importante)

Más allá de tirar código, este proyecto me dejó varias lecciones clave:

A evitar que la app se cierre de la nada (Crashes): Aprendí que si intento abrir un mapa y el teléfono no tiene Google Maps, la app se muere. Lo solucionamos usando bloques try-catch para atrapar el error y avisarle al usuario con un mensajito flotante (Toast). ¡Mucho mejor para la experiencia! 🛡️

El Manifest es como el guardia de la discoteca: Si creas una pantalla nueva (Activity) pero se te olvida anotarla en el archivo AndroidManifest.xml, el sistema no la deja entrar y te cierra la app. ¡Un dolor de cabeza que ya sé cómo solucionar! 🚪📋

Transportar datos de una pantalla a otra: Aprendí a usar putExtra para meter información en una "mochila" (el Intent) y desempaquetarla en la siguiente pantalla. 🎒

Diseño limpio: Pasar de un montón de botones desordenados a usar CardView en XML para agrupar todo en tarjetas. ¡La app quedó mucho más enchulada y profesional! ✨

Control de versiones: Trabajar en una rama (feature/intents) es la mejor práctica para probar cosas nuevas sin dañar el código principal. 🌳

¡Gracias por darte una vuelta por mi código! ✌️
