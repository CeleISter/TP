import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Equipo {
	private String nombre;
	private String ciudad;
	private LinkedList<Jugador> jugadores = new LinkedList<Jugador>();
	public Equipo(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public LinkedList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(LinkedList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", ciudad=" + ciudad + ", jugadores=" + jugadores + "]";
	} 
	
	public  void AgregarJugador() {
		Jugador jugador = new Jugador("",0,0);
		
	    
		String nombre=JOptionPane.showInputDialog("Ingrese el nombre del jugador");
		jugador.setNombre(nombre);
		int posicion1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicón del jugador"));
		jugador.setPosicion(posicion1);//1)Colocador. 2)Opuesto. 3)Centrales. 4)Puntas. 5) Libero. 6)Punta Receptora.	
		jugador.ValidarJugador(posicion1);

		Equipo.this.getJugadores().add(jugador);
		JOptionPane.showMessageDialog(null, "Jugador agregado exitosamente");
		}
	
		
	public  void AgregarJugadorRelleno() {
		  Jugador[] jugadores = new Jugador[10];

	        // Crear 10 jugadores con datos falsos
	        jugadores[0] = new Jugador("Ana", 170, 25);
	        jugadores[1] = new Jugador("Carlos", 185, 28);
	        jugadores[2] = new Jugador("María", 165, 23);
	        jugadores[3] = new Jugador("Pedro", 190, 30);
	        jugadores[4] = new Jugador("Laura", 175, 27);
	        jugadores[5] = new Jugador("Javier", 180, 26);
	        jugadores[6] = new Jugador("Sofía", 172, 24);
	        jugadores[7] = new Jugador("Alejandro", 188, 29);
	        jugadores[8] = new Jugador("Elena", 168, 22);
	        jugadores[9] = new Jugador("David", 183, 31);

	        // Mostrar los jugadores creados
	        for (int i = 0; i < 10; i++) {
	        	Equipo.this.getJugadores().add(jugadores[i] );	       
            }
		
		
		
		
		}
		
	 public void eliminarJugador(String nombreJugador) {
	        jugadores.removeIf(jugador -> jugador.getNombre().equals(nombreJugador));
	        JOptionPane.showMessageDialog(null, "Jugador eliminado exitosamente");
	    }
	
	public void BuscarJugador(){
		LinkedList<Jugador> jugadores = new LinkedList<Jugador>();
		if (jugadores.isEmpty()) {
			JOptionPane.showMessageDialog(null, "La lista no tiene elementos");
		} else {
			String[] elegible = new String[jugadores.size()];
			for (int i = 0; i < elegible.length; i++) {
				elegible[i] = jugadores.get(i).toString();
			}
			String elec = (String)JOptionPane.showInputDialog(null,
					"Elija el jugador que desee ", null,
					0, null, elegible, elegible[0]);
		}
	}
	
	public void CantidadTotal(){
	JOptionPane.showMessageDialog(null, "Cantidad total de jugadores: " + jugadores.size());
	}
	
	
	public void MostrarJugadores() {
		  if (jugadores.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "La lista no tiene elementos");
	        } else {
	            StringBuilder sb = new StringBuilder();
	            for (Jugador jugador : jugadores) {
	                sb.append(jugador).append("\n");
	            }
	            JOptionPane.showMessageDialog(null, sb.toString());
	        }
	    
	}
}
