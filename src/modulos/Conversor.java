package modulos;

import javax.swing.JOptionPane;

public class Conversor {
    public static void main(String[] args) {
        int repetir = 0;

        // Ejecución del programa, por lo menos 1 vez
        do {
            // Despliegue del menú
            String menu [] = {"Conversor de Divisas", "Conversor de Temperaturas"};
            String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione la tarea que desea realizar", "Conversor", 
                JOptionPane.QUESTION_MESSAGE, null,menu, menu[0]);
    
            // De acuerdo con la opción seleccionada se ejecuta el conversor correspondiente
            switch (seleccion) {
                case "Conversor de Divisas":
                    conversorDivisas();
                    break;
                case "Conversor de Temperaturas":
                    conversorTemperaturas();
                    break;
            }

            // Pregunta si desea continuar y repetir el menú principal
            repetir = JOptionPane.showConfirmDialog(null, "¿Desea continuar en el programa?", "Elija una opción", 2);

        } while(repetir == 0);

        // Al salir del ciclo de repetición de los menús, muestra un mensaje de finalización del programa
        JOptionPane.showMessageDialog(null, "Programa Finalizado", "Adiós", 1);
    }

    /** Método que ejecuta la lógica del conversor de divisas */
    public static void conversorDivisas() {
        // Variable para almacenar el resultado del showConfirmDialog que pregunta al usuario si quiere continuar ejecutando el programa.
        int repetir; // Por defecto la opción Aceptar es 0.

        do {
            String cantidad = JOptionPane.showInputDialog("Ingrese el monto a convertir:");
            String resultadoDivisa = "";
            double cantidadDouble = 0.0;
            String[] menu = {
                "De Pesos Mexicanos (MXN) a Dólares (USD)",
                "De Pesos Mexicanos (MXN) a Euros (EUR)",
                "De Pesos Mexicanos (MXN) a Libras Esterlinas (GBP)",
                "De Pesos Mexicanos (MXN) a Yenes Japoneses (JPY)",
                "De Pesos Mexicanos (MXN) a Wones SurCoreanos (KRW)",
                "De Dólares (USD) a Pesos Mexicanos (MXN)",
                "De Euros (EUR) a Pesos Mexicanos (MXN)",
                "De Libras Esterlinas (GBP) a Pesos Mexicanos (MXN)",
                "De Yenes Japoneses (JPY) a Pesos Mexicanos (MXN)",
                "De Wones SurCoreanos (KRW) a Pesos Mexicanos (MXN)",
            };
                
            try {
                /**
                 * Validación de la entrada al intentar asignarla en una variable de tipo double.
                 * Aquí se detiene la ejecución de este bloque de código si la excepción NumberFormatException es lanzada.
                 **/ 
                cantidadDouble = Double.parseDouble(cantidad);

                // Si el usuario elige la opción cancelar el String adquiere el valor null
                String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione la opción de conversión de divisas", "Divisas", 
                    JOptionPane.QUESTION_MESSAGE, null,menu, menu[0]);

                // Así que mientras la selección sea diferente de null se ejecutan las conversiones
                if (seleccion != null) {
                    switch (seleccion) {
                        case "De Pesos Mexicanos (MXN) a Dólares (USD)":
                            resultadoDivisa = Divisas.USD.convertirMXNADivisa(cantidadDouble);
                            break;
                        case "De Pesos Mexicanos (MXN) a Euros (EUR)":
                            resultadoDivisa = Divisas.EUR.convertirMXNADivisa(cantidadDouble);
                            break;
                        case "De Pesos Mexicanos (MXN) a Libras Esterlinas (GBP)":
                            resultadoDivisa = Divisas.GBP.convertirMXNADivisa(cantidadDouble);
                            break;
                        case "De Pesos Mexicanos (MXN) a Yenes Japoneses (JPY)":
                            resultadoDivisa = Divisas.JPY.convertirMXNADivisa(cantidadDouble);
                            break;
                        case "De Pesos Mexicanos (MXN) a Wones SurCoreanos (KRW)":
                            resultadoDivisa = Divisas.KRW.convertirMXNADivisa(cantidadDouble);
                            break;
                        case "De Dólares (USD) a Pesos Mexicanos (MXN)":
                            resultadoDivisa = Divisas.USD.convertirDivisaAMXN(cantidadDouble);
                            break;
                        case "De Euros (EUR) a Pesos Mexicanos (MXN)":
                            resultadoDivisa = Divisas.EUR.convertirDivisaAMXN(cantidadDouble);
                            break;
                        case "De Libras Esterlinas (GBP) a Pesos Mexicanos (MXN)":
                            resultadoDivisa = Divisas.GBP.convertirDivisaAMXN(cantidadDouble);
                            break;
                        case "De Yenes Japoneses (JPY) a Pesos Mexicanos (MXN)":
                            resultadoDivisa = Divisas.USD.convertirDivisaAMXN(cantidadDouble);
                            break;
                        case "De Wones SurCoreanos (KRW) a Pesos Mexicanos (MXN)":
                            resultadoDivisa = Divisas.USD.convertirDivisaAMXN(cantidadDouble);
                            break;
                        default:
                            break;
                    }
                    // Y se despliega el resultado
                    JOptionPane.showMessageDialog(null, resultadoDivisa);
                }
            
            } catch (NumberFormatException e) {
                // Si encuentra una cadena lanza la excepción:
                JOptionPane.showMessageDialog(null, "Sólo se aceptan valores numéricos", "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                // Una vez completado, lanzada la excepción o siendo la seleccion igual a null, se le pregunta al usuario si desea continuar con la ejecución
                repetir = JOptionPane.showConfirmDialog(null, "¿Desea continuar en el conversor de Divisas?", "Elija una opción", 2);
            }

        } while(repetir == 0);
    }

    /** Método que ejecuta la lógica del conversor de temperaturas */
    public static void conversorTemperaturas() {
        int repetir = 0;
        do {
            String cantidad = JOptionPane.showInputDialog("Ingrese el monto a convertir:");
            String resultadoTemperatura = "";
            double cantidadDouble = 0.0;
            String menu [] = {
                "Convertir °C a °F.",
                "Convertir °C a °K.",
                "Convertir °F a °C.",
                "Convertir °F a °K.",
                "Convertir °K a °F",
                "Convertir °K a °C"
            };

            try {
                /**
                 * Validación de la entrada al intentar asignarla en una variable de tipo double.
                 * Aquí se detiene la ejecución de este bloque de código si la excepción NumberFormatException es lanzada.
                 **/ 
                cantidadDouble = Double.parseDouble(cantidad);
                
                String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione la opción de conversión de divisas", "Divisas", 
                    JOptionPane.QUESTION_MESSAGE, null,menu, menu[0]);

                if (seleccion != null) {
                    switch (seleccion) {
                        case "Convertir °C a °F.":
                            resultadoTemperatura = Temperaturas.CELSIUS.convertirAFahrenheit(cantidadDouble);
                            break;
                        case "Convertir °C a °K.":
                            resultadoTemperatura = Temperaturas.CELSIUS.convertirAKelvin(cantidadDouble);
                            break;
                        case "Convertir °F a °C.":
                            resultadoTemperatura = Temperaturas.FAHRENHEIT.convertirACelsius(cantidadDouble);
                            break;
                        case "Convertir °F a °K.":
                            resultadoTemperatura = Temperaturas.FAHRENHEIT.convertirAKelvin(cantidadDouble);
                            break;
                        case "Convertir °K a °F":
                            resultadoTemperatura = Temperaturas.KELVIN.convertirAFahrenheit(cantidadDouble);
                            break;
                        case "Convertir °K a °C":
                            resultadoTemperatura = Temperaturas.KELVIN.convertirACelsius(cantidadDouble);
                            break;
                        default:
                            break;
                    }

                    JOptionPane.showMessageDialog(null, resultadoTemperatura);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Sólo se aceptan valores numéricos", "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                repetir = JOptionPane.showConfirmDialog(null, "¿Desea continuar en el conversor de Temperaturas?", "Elija una opción", 2);
            }

        } while(repetir == 0);
    }
}