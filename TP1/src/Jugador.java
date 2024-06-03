import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Jugador {
	private String nombre;
	private int posicion;
	private int edad;//o año de nacimiento
	public Jugador(String nombre, int posicion, int edad) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "\nJugador [nombre=" + nombre + ", posicion=" + posicion + ", edad=" + edad + "]";
	}
	
	public void ValidarJugador(int edad) {
		int anio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de nacimiento"));
		int mes= Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes de nacimiento"));
		int dia= Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia de nacimiento"));
		
		 LocalDate fechaActual = LocalDate.now();
	     LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia); 
	     edad=Period.between(fechaNacimiento, fechaActual).getYears();
	     this.setEdad(edad);
	    
		if (edad<=18) {
			JOptionPane.showInputDialog("No puede participar porque es menor de edad");
		} else {
			JOptionPane.showInputDialog("Puede participar");
		}
	}
}
