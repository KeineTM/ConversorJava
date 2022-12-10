package modulos;

public enum Temperaturas {
    CELSIUS,
    FAHRENHEIT,
    KELVIN;

    /**
     * Método para convertir CELSIUS o KELVIN a FAHRENHEIT
     * @param valor: cantidad de grados a convertir
     * @return un string con el resultado de la conversión
     */
    public String convertirAFahrenheit(double valor) {
        double resultado = 0.0;
        if(this.name() == CELSIUS.name())
            resultado = (valor * 1.8) + 32;
        else if (this.name() == KELVIN.name())
            resultado = (valor - 273.15) * (1.8) + 32;
        
        return String.format("%.2f° %s es igual a %.2f° FAHRENHEIT", valor, this.name(), resultado);
    }

    /**
     * Método para convertir CELSIUS o FAHRENHEIT a KELVIN
     * @param valor: cantidad de grados a convertir
     * @return un string con el resultado de la conversión
     */
    public String convertirAKelvin(double valor) {
        double resultado = 0.0;
        if(this.name() == CELSIUS.name())
            resultado = valor + 273.15;
        else if(this.name() == FAHRENHEIT.name())
            resultado = (valor - 32) * (0.5556) + 273.15;

        return String.format("%.2f° %s es igual a %.2f° KELVIN", valor, this.name(), resultado);
    }

    /**
     * Método para convertir KELVIN o FAHRENHEIT a CELSIUS
     * @param valor: cantidad de grados a convertir
     * @return un string con el resultado de la conversión
     */
    public String convertirACelsius(double valor) {
        double resultado = 0.0;
        if(this.name() == FAHRENHEIT.name())
            resultado = (valor - 32) * (0.5556);
        else if(this.name() == KELVIN.name()) 
            resultado = valor - 273.15;

        return String.format("%.2f° %s es igual a %.2f° CELSIUS", valor, this.name(), resultado);
    }
}
