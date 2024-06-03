import java.util.LinkedList;

import javax.swing.JOptionPane;

class Main {

	public static void main(String[] args) {
		
		GestorEquipos gestor = new GestorEquipos();
		    
		gestor.getEquipos().add(new Equipo("1","San juan"));
		gestor.getEquipos().add(new Equipo("2","Mendoza"));
		gestor.getEquipos().get(0).AgregarJugadorRelleno();
		
		
		
		

	}

}
