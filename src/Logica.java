import javax.swing.*;

public class Logica {

    ConvertirMonedas monedas = new ConvertirMonedas();
    ConversorTemp temperaturas = new ConversorTemp();
    public void ConvertirMonedas( double valorRecibido){
        String opcion = (JOptionPane.showInputDialog(null, "Elige una moneda a la que deseas convertir tu dinero",
                "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Pesos a Dolar", "De Pesos a Euro"},
                "Seleccion")).toString();

        switch (opcion){
            case "De Pesos a Dolar":
                monedas.ConvertirPesosArgentinosADolar(valorRecibido);
                break;
            case "De Pesos a Euro":
                monedas.ConvertirPesosArgentinosAEuro(valorRecibido);
                break;

            }
        }

    public void ConvertirTemperaturas( double valorRecibido){
        String opcion = (JOptionPane.showInputDialog(null, "Elige una temperatura a convertir",
                "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Celsius a Fahrenheit", "De Fahrenheit a Celsius"},
                "Seleccion")).toString();

        switch (opcion){
            case "De Celsius a Fahrenheit":
                temperaturas.ConvertirCelsiusAFahrenheith(valorRecibido);
                break;
            case "De Fahrenheit a Celsius":
                temperaturas.ConvertirFahrenheithACelsius(valorRecibido);
                break;

        }


    }
}
