import javax.swing.JOptionPane;


public class Calcu {

	public static void main(String[] args) {
		
		int opcion=0;
		double num1, num2, res;
		
		opcion=Integer.parseInt(JOptionPane.showInputDialog("[1]Sumar"+
		"/n"+"[2]Restar/n"+"[3]Dividir/n"+"[4]Multiplicar/n"+"Ingresa una opcion/n"));
		
		switch(opcion) 
		{
		
		case 1:
			num1=Double.parseDouble(JOptionPane.showInputDialog("escriba el primer valor: "));
			num2=Double.parseDouble(JOptionPane.showInputDialog("escriba el segundo valor: "));
			res=num1+num2;
			JOptionPane.showMessageDialog(null, "El resultado es: "+res);
			break;
			
		case 2:
			num1=Double.parseDouble(JOptionPane.showInputDialog("escriba el primer valor: "));
			num2=Double.parseDouble(JOptionPane.showInputDialog("escriba el segundo valor: "));
			res=num1-num2;
			JOptionPane.showMessageDialog(null, "El resultado es: "+res);
			
	}
		
		

	}
}
