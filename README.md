💱 Conversor de Monedas 🌍
¡Bienvenido al Conversor de Monedas! Esta aplicación, desarrollada en Java utilizando Maven, te permite convertir entre varias monedas de forma rápida y sencilla. Con la ayuda de la librería Gson y la API ExchangeRate-API, obtendrás tasas de cambio actualizadas al instante.

🪙 Monedas Soportadas
El conversor permite la conversión entre las siguientes monedas:

🇦🇷 ARS - Peso argentino
🇧🇴 BOB - Boliviano boliviano
🇧🇷 BRL - Real brasileño
🇨🇱 CLP - Peso chileno
🇨🇴 COP - Peso colombiano
🇺🇸 USD - Dólar estadounidense
🛠️ Tecnologías Utilizadas
Java: Lenguaje principal para el desarrollo de la aplicación.
Maven: Herramienta de gestión de proyectos y dependencias.
Gson: Librería para manipulación de JSON en Java.
ExchangeRate-API: API para obtener tasas de cambio en tiempo real.
⚙️ Requisitos Previos
Antes de ejecutar el proyecto, asegúrate de tener instalados:

☕ JDK 17
📦 Maven
🖥️ IntelliJ IDEA (recomendado para el desarrollo)
🌐 Conexión a Internet (para acceder a las tasas de cambio)
🚀 Instrucciones para Ejecutar
Sigue estos pasos para ejecutar el conversor de monedas en tu máquina local:

Clona el repositorio:

bash
Copiar código
git clone https://github.com/usuario/conversor-de-monedas.git
Accede al directorio del proyecto:

bash
Copiar código
cd conversor-de-monedas
Compila el proyecto usando Maven:

bash
Copiar código
mvn clean install
Ejecuta la aplicación:

bash
Copiar código
java -jar target/conversor-de-monedas.jar
🔄 Funcionamiento
La aplicación solicita una cantidad y las monedas de origen y destino. Utiliza la API ExchangeRate-API para obtener la tasa de conversión más reciente y, con la ayuda de Gson, procesa la información en formato JSON. La conversión se realiza de manera eficiente, brindando resultados precisos y rápidos.

📝 Licencia
Este proyecto está licenciado bajo los términos de la MIT License.

📢 Contribuciones
Las contribuciones son bienvenidas. Si deseas colaborar, por favor sigue estos pasos:

Haz un fork del repositorio.
Crea una nueva rama (git checkout -b feature/nueva-caracteristica).
Realiza tus cambios y haz un commit (git commit -m 'Agrega una nueva característica').
Envía tus cambios a tu fork (git push origin feature/nueva-caracteristica).
Abre un pull request.
¡Gracias por usar el Conversor de Monedas! Si tienes alguna pregunta o sugerencia, no dudes en abrir un issue.
