/*
 * Una compañía de venta de coches usados, paga a su personal de ventas un salario de 1000$ mensuales, 
 * más una comisión de 150$ por cada coche vendido, más el 5% del valor de la venta por coche. 
 * Cada mes el capturista de la empresa ingresa en el ordenador los datos pertienentes. 
 * 
 * Hacer un programa que calcule e imprima el salario mensual de un vendedor dado. 
 * 
 * */
import java.util.Scanner;

public class E4salarioMensualVendedor {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	
		final int salarioMensual = 1000;
		int nCochesVendidos;
		float costeCoche, salarioTotal;
		
		System.out.println("Digite el total de coches vendidos");
		nCochesVendidos = entrada.nextInt();
		System.out.println("Digite el coste del coche");
		costeCoche = entrada.nextFloat();
		
		salarioTotal = salarioMensual + (nCochesVendidos*150) + (0.05f*costeCoche*nCochesVendidos);
		System.out.println("\nEl salario total al mes es: " + salarioTotal + " €");
		
	}

}
