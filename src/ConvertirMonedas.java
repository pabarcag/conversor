import javax.swing.JOptionPane;

public class ConvertirMonedas {
    public void ConvertirPesosArgentinosADolar( double valorRecibido){
        double monedaDolar = valorRecibido / 173.91;
        monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
    }

    public void ConvertirPesosArgentinosAEuro( double valorRecibido){
        double monedaEuro = valorRecibido / 184.75;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
    }

}
