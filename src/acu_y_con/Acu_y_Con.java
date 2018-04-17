package acu_y_con;
import javax.swing.JOptionPane;

public class Acu_y_Con
{
    public static void main(String[] args)
    {
        int con = 0;
	int acu = 0;
	while (con < 5)
        {
            con = con + 1;
            acu = acu + Integer.parseInt(JOptionPane.showInputDialog("Ingresar el " + con + "º número"));
	}
    JOptionPane.showMessageDialog(null, "La suma de los 5 números es " + acu);
    }
}
