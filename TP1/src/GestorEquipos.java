import java.util.LinkedList;

import javax.swing.JOptionPane;

public class GestorEquipos {
	private LinkedList<Equipo> equipos = new  LinkedList<Equipo> ();

	public GestorEquipos() {
	}

	public LinkedList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(LinkedList<Equipo> equipos) {
		this.equipos = equipos;
	}
	
	public void JugarPartido(GestorEquipos gestor) {
		if (gestor.getEquipos().get(0)==gestor.getEquipos().get(1)) {
			JOptionPane.showMessageDialog(null, "No se puede jugar entre los mismos equipo");
			
		} else {
			int Rondas1;
			int Rondas2;
			do {
				Rondas1 = (int)(Math.random()*5);
				Rondas2 = (int)(Math.random()*5);
				if (Rondas1==Rondas2) {
					JOptionPane.showMessageDialog(null, "Hay una sexta ronda");
				}
			} while (Rondas1==Rondas2);

			if (Rondas1>Rondas2) {
				JOptionPane.showMessageDialog(null, gestor.getEquipos().get(0));
			} else {
				JOptionPane.showMessageDialog(null, gestor.getEquipos().get(1));
			}
		}
		
	}
	
	
	
	public void CantitadTotal() {
		JOptionPane.showMessageDialog(null, "Cantidad total de equipos: " + equipos.size());
	}
	
	public void eliminarEquipo(String nombreEquipo) {
        equipos.removeIf(equipo -> equipo.getNombre().equals(nombreEquipo));
        JOptionPane.showMessageDialog(null, "Equipo eliminado exitosamente");
    }
	
	
	//Seleccionar Equipo, Añadir jugador, Jugar partido= Aprobado. Mientras más, más puntos tienen
}
