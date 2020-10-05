package EjercicioClases1;

import java.io.Serializable;
import java.util.ArrayList;

public class Vehiculo implements Serializable{
	 
	private String color;
	private String modelo;
	private String matricula;
	private String marca;
	private int caballos;
	//private ArrayList<Integer> lista;
	
	public Vehiculo() {
		color = "Default color";
		marca = "Default brand";
		matricula = "A0000AA";
		modelo = "Default modelo";
		caballos = 0;
	}
	
	public Vehiculo(String color, String modelo, String matricula, String marca, int caballos) {
		super();
		this.color = color;
		this.modelo = modelo;
		this.matricula = matricula;
		this.marca = marca;
		this.caballos = caballos;
	}

	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", modelo=" + modelo + ", matricula=" + matricula + ", marca=" + marca
				+ ", caballos=" + caballos + "]";
	}
	
	
	
}
