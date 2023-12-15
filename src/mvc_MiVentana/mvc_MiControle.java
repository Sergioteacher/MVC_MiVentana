package mvc_MiVentana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class mvc_MiControle {

	private mvc_MiVista Mio_Vista;
	private MVC_Modelo Mio_Modelo;
	
	public mvc_MiControle(mvc_MiVista mio_Vista, MVC_Modelo mio_Modelo) {
		//super();
		Mio_Vista = mio_Vista;
		Mio_Modelo = mio_Modelo;
		
		mio_Vista.addWindowListener(new manejadorVentana());
		mio_Vista.addComponentListener(new manejadorCompomentes());
		
		manejadorClicks CClicks = new manejadorClicks();
		mio_Vista.MiBoton.addActionListener(CClicks);
		mio_Vista.OtroBoton.addActionListener(CClicks);
	}
	
	public void iniciarVista() {
		Mio_Modelo.setNombreTitulo("Ventana Principale");
		
		Mio_Vista.setTitle( Mio_Modelo.getNombreTitulo() );
		
		Mio_Vista.setVisible(true);
		
	}
}


/**
 * Clase para gestionar los eventos de la Ventana
 * @author Sergio Teacher
 *
 */
class manejadorVentana implements WindowListener {

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("La ventana pricipal Activada    (cambio de estado 1)");
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("La ventana pricipal CERRADA");
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Terminado la aplicación: ventana pricipal");
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("La ventana pricipal Desactivada (cambio de estado 0)");
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("De-iconizada la ventana pricipal");
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Iconizada la ventana pricipal");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Abriendo ventana pricipal");
	}
	
}

/**
 * Clase para gestionar los eventos de forma de la Ventana
 * @author Sergio Teacher
 *
 */
class manejadorCompomentes implements ComponentListener {
	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Me muevo ...");
	}

	@Override
	public void componentResized(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Se ha cambiado su tamaño");
		System.out.println( arg0.getComponent().getSize() );

	}

	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}	
	
}

/**
 * Para manejar los eventos del ratón.
 * @author Sergio Teacher
 *
 */
class manejadorClicks implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println( arg0.getActionCommand() );
		System.out.println("He pulsado el botón");
	}
	
}