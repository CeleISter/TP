import java.util.LinkedList;

import javax.swing.JOptionPane;

class Main {

	public static void main(String[] args) {
		
		GestorEquipos gestor = new GestorEquipos();
		    
		gestor.getEquipos().add(new Equipo("1","San juan"));
		gestor.getEquipos().add(new Equipo("2","Mendoza"));
		gestor.getEquipos().get(0).AgregarJugadorRelleno();
		
		
		String[] Opciones = {
				"Jugar partido", "Revisar Equipo", "Salir"
		};
		int opcion = 0;
		do {
		
			opcion= JOptionPane.showOptionDialog(null, "Bienvenido", null, opcion, opcion, null, Opciones, Opciones[0]);
			
			switch (opcion) {
			case 0:
				
				break;

			default:
				break;
			}
		} while ();
	}
	
	public static int BuscarEquipo(LinkedList<Equipo> equipos) {
		String[] equiposarray = new String[equipos.size()];
		for (int i = 0; i < equipos.size(); i++) {
			equiposarray[i] = equipos.get(i).getNombre();
		}
		int opcion = JOptionPane.showOptionDialog(null, 
				"Seleccione equipo", null, 0, 0, null, equiposarray, equiposarray[0]);
		
		return opcion;
		

	}
	
		
		
		

	}

}
