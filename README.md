# ConversorJava

Este es un proyecto simple que ejecuta diferentes conversores programados mediante lenguaje Java.

Emplea diferentes objetos JOptionPanel para desplegar una interfaz sencilla que guía al usuario.

Actualmente tiene dos módulos: Conversor de Divisas y Conversor de Temperatura.

![Image text](img/menu_principal.png)

Una vez elegido se solicita un valor que debe ser numérico:

![Image text](img/entrada.PNG)

Después se despliega el menú desplegable para seleccionar la conversión deseada:

![Image text](img/menu_divisas.png)

Y se muestra el resultado:

![Image text](img/resultado_divisas.PNG)

En caso de que se haya introducido una entrada no numérica se captura e indica el error:

![Image text](img/error.PNG)

Finalmente, se pregunta al usuario si desea permanecer en el módulo y repetirlo, o permanecer en el programa y repetirlo.
De seleccionar las opciones Cancelar, salta el mensaje de finalización:

![Image text](img/adios.PNG)

Algo a destacar es que, al traterse de constantes (aún con las divisas), se crearon clases de tipo "enum" para manejarlas:

![Image text](img/enum_class.PNG)