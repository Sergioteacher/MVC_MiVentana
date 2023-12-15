package mvc_MiVentana;

public class MVC_MiVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando ...");
		
		mvc_MiVista La_Vista = new mvc_MiVista();
		MVC_Modelo El_Modelo = new MVC_Modelo();
		
		mvc_MiControle El_Control = new mvc_MiControle(La_Vista,El_Modelo);
		El_Control.iniciarVista();

	}

}
