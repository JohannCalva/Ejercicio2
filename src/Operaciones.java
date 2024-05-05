import javax.swing.*;

public class Operaciones {
    float num1, num2, resultado;
    String operador;
    public void calculoResultado(){
        switch(operador){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if(num2 == 0){
                    JOptionPane.showMessageDialog(null, "No existe división para 0.");
                }else {
                    resultado = num1 / num2;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "No existe tal operador");
        }

    }
}
