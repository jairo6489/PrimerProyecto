package primerProyecto;

import static primerProyecto.PrimerProyecto.*;

public class Pruebas {

	public static void main(String[] args) {

		//Prueba reconocer un carácter
		System.out.println(readChar("introduzca un carácter"));

		//Prueba reconocer una cadena
		System.out.println(readString("introduzca una cadena"));

		//Prueba leer número tipo byte
		System.out.println(readByte("introduzca un número de tipo byte"));

		//Prueba leer número tipo short
		System.out.println(readShort("introduzca un número de tipo short"));

		//Prueba leer número tipo int
		System.out.println(readInt("introduzca un número de tipo Int"));

		//Prueba leer número tipo long
		System.out.println(readLong("introduzca un número de tipo long"));

		//Prueba leer número tipo float
		System.out.println(readFloat("introduzca un número de tipo float"));

		//Prueba leer número tipo double
		System.out.println(readDouble("introduzca un número de tipo double"));

		//Prueba para leer número tipo byte mayor, menor, o igual que un valor pasado como parámetro.

		System.out.println(readNumbers("introduce un número tipo byte que sea mayor o igual", 10,ReadComparation.MAYOR_IGUAL));

		System.out.println(readNumbers("introduce un número tipo byte que sea menor o igual", 10,ReadComparation.MENOR_IGUAL));

		System.out.println(readNumbers("introduce un número tipo byte mayor", 10, ReadComparation.MAYORVALOR));

		System.out.println(readNumbers("introduce un número tipo byte menor", 10, ReadComparation.MENORVALOR));

		//Prueba para leer número tipo short mayor, menor, o igual que un valor pasado como parámetro.

		System.out.println(readNumbers("introduce un número tipo short que sea mayor o igual", 17,ReadComparation.MAYOR_IGUAL));

		System.out.println(readNumbers("introduce un número tipo short que sea menor o igual", 17,ReadComparation.MENOR_IGUAL));

		System.out.println(readNumbers("introduce un número tipo short mayor", 17, ReadComparation.MAYORVALOR));

		System.out.println(readNumbers("introduce un número tipo short menor", 17, ReadComparation.MENORVALOR));

		//Prueba para leer número tipo int mayor, menor, o igual que un valor pasado como parámetro.

		System.out.println(readNumbers("introduce un número tipo int que sea mayor o igual", 250,ReadComparation.MAYOR_IGUAL));

		System.out.println(readNumbers("introduce un número tipo int que sea menor o igual", 250,ReadComparation.MENOR_IGUAL));

		System.out.println(readNumbers("introduce un número tipo int mayor", 250, ReadComparation.MAYORVALOR));

		System.out.println(readNumbers("introduce un número tipo int menor", 250, ReadComparation.MENORVALOR));
		
		//Prueba para leer número tipo long mayor, menor, o igual que un valor pasado como parámetro.
		
		System.out.println(readNumbers("introduce un número tipo long que sea mayor o igual", 1500L,ReadComparation.MAYOR_IGUAL));

		System.out.println(readNumbers("introduce un número tipo long que sea menor o igual", 1500L,ReadComparation.MENOR_IGUAL));

		System.out.println(readNumbers("introduce un número tipo long mayor", 1500L, ReadComparation.MAYORVALOR));

		System.out.println(readNumbers("introduce un número tipo long menor", 1500L, ReadComparation.MENORVALOR));
		
		//Prueba para leer número tipo float mayor, menor, o igual que un valor pasado como parámetro.
		
		System.out.println(readNumbers("introduce un número tipo float que sea mayor o igual", 8.53f,ReadComparation.MAYOR_IGUAL));

		System.out.println(readNumbers("introduce un número tipo float que sea menor o igual", 8.53f,ReadComparation.MENOR_IGUAL));

		System.out.println(readNumbers("introduce un número tipo float mayor", 8.53f, ReadComparation.MAYORVALOR));

		System.out.println(readNumbers("introduce un número tipo float menor", 8.53f, ReadComparation.MENORVALOR));
		
		//Prueba para leer número tipo double mayor, menor, o igual que un valor pasado como parámetro.
		
		System.out.println(readNumbers("introduce un número tipo double que sea mayor o igual", 43.01,ReadComparation.MAYOR_IGUAL));

		System.out.println(readNumbers("introduce un número tipo double que sea menor o igual", 43.01,ReadComparation.MENOR_IGUAL));

		System.out.println(readNumbers("introduce un número tipo double mayor", 43.01, ReadComparation.MAYORVALOR));

		System.out.println(readNumbers("introduce un número tipo double menor", 43.01, ReadComparation.MENORVALOR));
		
		//Lectura de datos numericos de tipo byte para comparacion entre rangos.
		
		System.out.println(readNumberang("introduce un número de tipo byte entre dos parametros los cuales pueden estar incluidos", 10, 15, ReadIncluyed.INCLUIDOS));
		
		System.out.println(readNumberang("introduce un número de tipo byte entre dos parametros los cuales estan excluidos", 10, 15, ReadIncluyed.EXCLUIDOS));
		
		System.out.println(readNumberang("introduce un número de tipo byte entre dos parametros pudiendo incluir el menor", 10, 15, ReadIncluyed.MINIMO_INCLUIDO ));
		
		System.out.println(readNumberang("introduce un número de tipo byte entre dos parametros pudiendo incluir el mayor", 10, 15, ReadIncluyed.MAXIMO_INCLUIDO ));
		
		//Lectura de datos numericos de tipo short para comparacion entre rangos.
		
		System.out.println(readNumberang("introduce un número de tipo short entre dos parametros los cuales pueden estar incluidos", 130, 150, ReadIncluyed.INCLUIDOS));
				
		System.out.println(readNumberang("introduce un número de tipo short entre dos parametros los cuales estan excluidos", 130, 150, ReadIncluyed.EXCLUIDOS));
				
		System.out.println(readNumberang("introduce un número de tipo short entre dos parametros pudiendo incluir el menor", 130, 150, ReadIncluyed.MINIMO_INCLUIDO ));
				
		System.out.println(readNumberang("introduce un número de tipo short entre dos parametros pudiendo incluir el mayor", 130, 150, ReadIncluyed.MAXIMO_INCLUIDO ));
		
		//Lectura de datos numericos de tipo int para comparacion entre rangos.
		
		System.out.println(readNumberang("introduce un número de tipo int entre dos parametros los cuales pueden estar incluidos", 200, 350, ReadIncluyed.INCLUIDOS));
						
		System.out.println(readNumberang("introduce un número de tipo int entre dos parametros los cuales estan excluidos", 200, 350, ReadIncluyed.EXCLUIDOS));
						
		System.out.println(readNumberang("introduce un número de tipo int entre dos parametros pudiendo incluir el menor", 200, 350, ReadIncluyed.MINIMO_INCLUIDO ));
						
		System.out.println(readNumberang("introduce un número de tipo int entre dos parametros pudiendo incluir el mayor", 200, 350, ReadIncluyed.MAXIMO_INCLUIDO ));
		
		//Lectura de datos numericos de tipo long para comparacion entre rangos.
		
		System.out.println(readNumberang("introduce un número de tipo long entre dos parametros los cuales pueden estar incluidos", 1200L, 1350L, ReadIncluyed.INCLUIDOS));
								
		System.out.println(readNumberang("introduce un número de tipo long entre dos parametros los cuales estan excluidos", 1200L, 1350L, ReadIncluyed.EXCLUIDOS));
								
		System.out.println(readNumberang("introduce un número de tipo long entre dos parametros pudiendo incluir el menor", 1200L, 1350L, ReadIncluyed.MINIMO_INCLUIDO ));
								
		System.out.println(readNumberang("introduce un número de tipo long entre dos parametros pudiendo incluir el mayor", 1200L, 1350L, ReadIncluyed.MAXIMO_INCLUIDO ));
		
		//Lectura de datos numericos de tipo float para comparacion entre rangos.
		
		System.out.println(readNumberang("introduce un número de tipo float entre dos parametros los cuales pueden estar incluidos", 1.0F, 1.5F, ReadIncluyed.INCLUIDOS));
				
		System.out.println(readNumberang("introduce un número de tipo float entre dos parametros los cuales estan excluidos", 1.0F, 1.5F, ReadIncluyed.EXCLUIDOS));
				
		System.out.println(readNumberang("introduce un número de tipo float entre dos parametros pudiendo incluir el menor", 1.0F, 1.5F, ReadIncluyed.MINIMO_INCLUIDO ));
				
		System.out.println(readNumberang("introduce un número de tipo float entre dos parametros pudiendo incluir el mayor", 1.0F, 1.5F, ReadIncluyed.MAXIMO_INCLUIDO ));
		
		//Lectura de datos numericos de tipo double para comparacion entre rangos.
		
		System.out.println(readNumberang("introduce un número de tipo float entre dos parametros los cuales pueden estar incluidos", 12.0, 41.5, ReadIncluyed.INCLUIDOS));
						
		System.out.println(readNumberang("introduce un número de tipo float entre dos parametros los cuales estan excluidos", 12.0, 41.5, ReadIncluyed.EXCLUIDOS));
						
		System.out.println(readNumberang("introduce un número de tipo float entre dos parametros pudiendo incluir el menor", 12.0, 41.5, ReadIncluyed.MINIMO_INCLUIDO ));
						
		System.out.println(readNumberang("introduce un número de tipo float entre dos parametros pudiendo incluir el mayor", 12.0, 41.5, ReadIncluyed.MAXIMO_INCLUIDO ));
		
		//Lectura de un booleano, introducción de 3 mensajes.
		
		System.out.println(readBoolean("Eva me aprobará el pryecto?", "Si?", "No?"));
		
		// Lectura del segundo boleeano, utilizando sobrecarga e introduciendo "s" o "n".
		
		System.out.println(readBoolean("Se puede parar el tiempo?"));
		
		


	}

}
