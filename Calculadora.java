import javax.swing.JOptionPane;


public class Calculadora{
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo valor: ");

        double n1 = Double.parseDouble(valor1);
        double n2 = Double.parseDouble(valor2);

        double resultado = n1 + n2;

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}