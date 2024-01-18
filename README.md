### Proyecto base de Selenium

Este proyecto implementa Seleniun para conocer sus funciones basicas para interactuar con el Navegadro apoyandose el la libreria Junit para ejecutar las pruebas

- Rama **main**: Esta rama contiene una estructura basica con las dependencias y un ejemplo  de los metodos de Selenium
- Rama **webdriver**: Esta rama contiene la implementacion de varios escenarios donde se usan difenretes metodos proporcionados por Selenium para conocer su funcionamienot
- Rama **SeleniumEdge**: Esta rama contiene ejemplo de uso de selenium usando como navegador para los escenarios Edge


#### Consideraciones
- cada rama tiene uncluida  el chromedrver o el edgedriver con la version 120.0 de los respectivos navegadores  verifique que su navegador tiene esta version en el caso de tener una version diferente
  actualice en la carpeta  `RUTA_DEL_PRUYECTO/src/test/java/resource/drivers` el driver correspondiente a la version de su navegador

- chrome: https://chromedriver.chromium.org/downloads/version-selection
- Edge : https://developer.microsoft.com/es-es/microsoft-edge/tools/webdriver/?form=MA13LH#downloads

####  Ejecuccion con Gradle

- Abrir una terminal en la ubicacion del proyecto  y ejecutar el siguiente comando

  `gradle clean test`
  o
  `./gradlew clean test`
  si quieres ver la trazabilidad de la ejcución, anade al comando que vas a ejecutar

  `--info --stacktrace`

- si quiere ejecutar los escenarios de forma independiente puede usar las opcines del IDE en cada clase
#### Revisión de resultado

Gradle genera un reporte en HTML para revisar este reporte ve a la siguiente ruta

`RUTA_DEL_PRUYECTO/Build/report/tests/test/index.html`

### Happy Coding!


------------

#### Diplomado de Automatización de Pruebas Web
##### Dip Learn Academy y AseUTP
##### Juan de Jesús Fernández Graciano
##### Bryan Estefan Moreno Diaz