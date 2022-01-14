import javax.swing.JOptionPane;
public class diaSemanaAPP {

	public static void main(String[] args) {
		
		//Pedimos el dia
		String dia=JOptionPane.showInputDialog("Introduce un dia de la semana");
		
		//Creamos la estructura condicional con switch
		switch(dia) {
			case "lunes":
				System.out.println("Has puesto un dia laboral");
				break;
			case "martes":
				System.out.println("Has puesto un dia laboral");
				break;
			case "miercoles":
				System.out.println("Has puesto un dia laboral");
				break;
			case "jueves":
				System.out.println("Has puesto un dia laboral");
				break;
			case "viernes":
				System.out.println("Has puesto un dia laboral");
				break;
			case "sabado":
				System.out.println("Has puesto un dia festivo");
				break;
			case "domingo":
				System.out.println("Has puesto un dia festivo");
				break;
			default:
				System.out.println("No has puesto un dia correcto");
		}
	}
}
