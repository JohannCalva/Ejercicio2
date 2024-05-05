import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String seguir = "Y";
        do{
            Operaciones op = new Operaciones();
            op.num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor 1:"));
            op.operador = JOptionPane.showInputDialog("Ingrese el operador: ");
            op.num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor 2: "));
            op.calculoResultado();
            JOptionPane.showMessageDialog(null, "El resultado de " + op.num1 + " " + op.operador + " " + op.num2 + " es: "+ op.resultado);
            seguir = JOptionPane.showInputDialog(null, "Desea realizar otra operacion? (y/n)");
        }while(seguir.equals("y") || seguir.equals("Y"));
        JOptionPane.showMessageDialog(null, "Gracias por usar");
    }
}