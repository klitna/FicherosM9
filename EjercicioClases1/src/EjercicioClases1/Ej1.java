package EjercicioClases1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.logging.Logger;


public class Ej1{
	public static void main(String[] args) {
		/*Vehiculo v1 = new Vehiculo();
		//Vehiculo v2 = new Vehiculo("negro", "BM150", "B1254ES", "BMW", 200);
		//System.out.println(v1.toString());
		//ystem.out.println(v2.toString());*/
		Scanner sc = new Scanner(System.in);
		Vehiculo[] lista = new Vehiculo[5];
		for(int i=0; i<5; i++)
		{
			System.out.println("Introduce 1.Moto 2.Coche: ");
			int option=sc.nextInt();
			if (option==1)
				lista[i] = new Moto();
			else
				lista[i] = new Coche();
		}
		
		try {
			FileOutputStream file = new FileOutputStream("/home/cf19iryna.klitna/Escriptori/prova.txt");
			ObjectOutputStream file2 = new ObjectOutputStream(file);
			for(int i=0; i<5; i++)
			{
				file2.writeObject(lista[i]);
			}
			file2.close();
		}catch(Exception e) {
			System.out.print(e);
		}
		
		Vehiculo[] lista2 = new Vehiculo[5];
		
		try {
			FileInputStream file = new FileInputStream("/home/cf19iryna.klitna/Escriptori/prova.txt");
			ObjectInputStream file2 = new ObjectInputStream(file);
			for(int i=0; i<5; i++) {
				lista[i] = (Vehiculo)file2.readObject();
				System.out.println(lista[i].toString());
			}
			
			file2.close();
			
			
		}catch(Exception ex) {
			System.out.print(ex.getMessage());
		}
	}
}
