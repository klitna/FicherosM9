package EjercicioClases1;

public class Coche extends Vehiculo {
	private int numPuertas;
	private int capacidadDeMaletero;
	
	public Coche()
	{
		super();
		numPuertas = 0;
		capacidadDeMaletero = 0;
	}

	public Coche(String color, String modelo, String matricula, String marca, int caballos, int numPuertas,
			int capacidadDeMaletero) {
		super(color, modelo, matricula, marca, caballos);
		this.numPuertas = numPuertas;
		this.capacidadDeMaletero = capacidadDeMaletero;
	}

	/*@Override
	public String toString() {
		return super.toString() + "Coche [numPuertas=" + numPuertas + ", capacidadDeMaletero=" + capacidadDeMaletero + "]";
	}*/
	
	@Override
	public String toString() {
		return "Coche [numPuertas=" + numPuertas + ", capacidadDeMaletero=" + capacidadDeMaletero + "]";
	}
	  
}
