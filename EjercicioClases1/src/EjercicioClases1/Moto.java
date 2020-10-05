package EjercicioClases1;

public class Moto extends Vehiculo {
	
	private int precio;
	private String descripcion;
	public Moto() {
		super();
	}
	public Moto(int precio, String descripcion) {
		super();
		this.precio = precio;
		this.descripcion = descripcion;
	}
	
	public Moto(String color, String modelo, String matricula, String marca, int caballos, int precio,
			String descripcion) {
		super(color, modelo, matricula, marca, caballos);
		this.precio = precio;
		this.descripcion = descripcion;
	}

	
}
