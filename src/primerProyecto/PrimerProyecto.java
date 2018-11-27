package primerProyecto;

import java.util.Scanner;

public class PrimerProyecto {

	static Scanner keyboard = new Scanner(System.in);

	//Creamos el Enum que utilizaremos en las siguientes funciones.

	public static enum ReadComparation {
		MAYOR_IGUAL, MENOR_IGUAL, MAYORVALOR, MENORVALOR
	}

	//Creamos este Enum para utilizarlo en las siguientes funciones.

	public static enum ReadIncluyed {
		INCLUIDOS, EXCLUIDOS, MINIMO_INCLUIDO, MAXIMO_INCLUIDO
	}

	public static void main(String[] args) {

	}

	public static void close() {
		keyboard.close();
	}

	// Creamos una función que reconozca un caracter

	/* Paso 1: Pedimos al usuario que introduzca un carácter.
	 * Paso 2: Se introduce el carácter por teclado.
	 * Paso 3: Nos devuelve un carácter. */

	public static char readChar(String msj) {
		char c = ' ';
		System.out.println(msj + ":");
		c = keyboard.next().charAt(0);

		return c;
	}

	//Creamos una función que reconozca una cadena

	/* Paso 1: Pedimos al usuario que introduzca una cadena.
	 * Paso 2: Se introduce la cadena por el teclado.
	 * Paso 3: Nos devuelve la cadena. */

	public static String readString(String msj) {
		String st;

		System.out.println(msj + ":");
		st = keyboard.next();
		return st;
	}

	//Lectura de datos numericos de tipo byte

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Mientras el número no es de tipo byte nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Nos devolverá el número tipo byte.*/

	public static byte readByte(String msj) {
		byte i = 0;
		boolean next;
		do {
			try {

				next = false;
				System.out.println(msj + ":");
				i = keyboard.nextByte();
			} catch (Exception e) {
				System.out.println("El número introducido no es de tipo byte");
				next = true;
				keyboard.nextLine();
			}
		} while (next);
		return i;

	}

	//Creamos una función que reconozca un número de tipo short.

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Mientras el número no es de tipo short nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Nos devolverá el número tipo short.*/

	public static short readShort(String msj) {
		Short s = 0;
		boolean next;
		do {
			try {

				next = false;
				System.out.println(msj + ":");
				s = keyboard.nextShort();
			} catch (Exception e) {
				System.out.println("El número introducido no es de tipo short");
				next = true;
				keyboard.nextLine();
			}
		} while (next);
		return s;

	}

	//Creamos una función que reconozca un número entero de tipo int

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Mientras el número no es de tipo int nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Nos devolverá el número tipo int.*/

	public static int readInt(String msj) {
		int i = 0;
		boolean next;
		do {
			try {

				next = false;
				System.out.println(msj + ":");
				i = keyboard.nextInt();
			} catch (Exception e) {
				System.out.println("El número introducido no es de tipo int");
				next = true;
				keyboard.nextLine();
			}
		} while (next);
		return i;

	}

	//Creamos una función que reconozca un número entero de tipo long

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Mientras el número no es de tipo long nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Nos devolverá el número tipo long.*/

	public static long readLong(String msj) {
		Long l = 0L;
		boolean next;
		do {
			try {

				next = false;
				System.out.println(msj + ":");
				l = keyboard.nextLong();
			} catch (Exception e) {
				System.out.println("El número introducido no es de tipo long");
				next = true;
				keyboard.nextLine();
			}
		} while (next);
		return l;

	}

	//Creamos una función que reconozca un número entero de tipo float

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Mientras el número no es de tipo float nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Nos devolverá el número tipo float.*/

	public static Float readFloat(String msj) {
		float f = 0f;
		boolean next;
		do {
			try {

				next = false;
				System.out.println(msj + ":");
				f = keyboard.nextFloat();
			} catch (Exception e) {
				System.out.println("El número introducido no es de tipo long");
				next = true;
				keyboard.nextLine();
			}
		} while (next);
		return f;

	}

	//Creamos una función que reconozca un número entero de tipo double

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Mientras el número no es de tipo double nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Nos devolverá el número tipo double.*/

	public static Double readDouble(String msj) {
		double d = 0;
		boolean next;
		do {
			try {

				next = false;
				System.out.println(msj + ":");
				d = keyboard.nextDouble();
			} catch (Exception e) {
				System.out.println("El número introducido no es de tipo long");
				next = true;
				keyboard.nextLine();
			}
		} while (next);
		return d;
	}

	//Lectura de datos numericos de tipo byte para comparacion

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Si el número se sale del rango nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Comparará los dos números.
		  *4.1: Si es válido lo deuelvo.
	      *4.2: Si no es válido se lo vuelvo a pedir*/

	public static byte readNumbers(String msj, byte x, ReadComparation value) {
		byte b = 0;
		boolean next;

		switch (value) {

		case MAYOR_IGUAL:
			System.out.println(msj);
			do {
				next = false;
				try {
					b = keyboard.nextByte();
					if (b < x) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MENOR_IGUAL:
			System.out.println(msj);
			do {
				next = false;
				try {
					b = keyboard.nextByte();
					if (b > x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;
		case MAYORVALOR:
			System.out.println(msj);
			do {
				next = false;
				try {
					b = keyboard.nextByte();
					if (b <= x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;
		case MENORVALOR:
			System.out.println(msj);
			do {
				next = false;
				try {
					b = keyboard.nextByte();
					if (b >= x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;
		}

		return b;
	}

	//Lectura de datos numericos de tipo short para comparacion

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Si el número se sale del rango nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Comparará los dos números.
		  *4.1: Si es válido lo deuelvo.
	      *4.2: Si no es válido se lo vuelvo a pedir*/

	public static short readNumbers(String msj, short x, ReadComparation value) {
		short s = 0;
		boolean next;

		switch (value) {

		case MAYOR_IGUAL:
			System.out.println(msj);
			do {
				next = false;
				try {
					s = keyboard.nextShort();
					if (s < x) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MENOR_IGUAL:
			System.out.println(msj);
			do {
				next = false;
				try {
					s = keyboard.nextShort();
					if (s > x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;
		case MAYORVALOR:
			System.out.println(msj);
			do {
				next = false;
				try {
					s = keyboard.nextShort();
					if (s <= x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;
		case MENORVALOR:
			System.out.println(msj);
			do {
				next = false;
				try {
					s = keyboard.nextShort();
					if (s >= x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;
		}

		return s;
	}

	//Lectura de datos numericos de tipo int para comparacion

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Si el número se sale del rango nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Comparará los dos números.
		  *4.1: Si es válido lo deuelvo.
	      *4.2: Si no es válido se lo vuelvo a pedir*/

	public static int readNumbers(String msj, int x, ReadComparation value) {
		int i = 0;
		boolean next;

		switch (value) {

		case MAYOR_IGUAL:
			System.out.println(msj);
			do {
				next = false;
				try {
					i = keyboard.nextInt();
					if (i < x) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MENOR_IGUAL:
			System.out.println(msj);
			do {
				next = false;
				try {
					i = keyboard.nextInt();
					if (i > x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;
		case MAYORVALOR:
			System.out.println(msj);
			do {
				next = false;
				try {
					i = keyboard.nextInt();
					if (i <= x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;
		case MENORVALOR:
			System.out.println(msj);
			do {
				next = false;
				try {
					i = keyboard.nextInt();
					if (i >= x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;
		}

		return i;
	}

	//Lectura de datos numericos de tipo long para comparacion

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Si el número se sale del rango nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Comparará los dos números.
		  *4.1: Si es válido lo deuelvo.
	      *4.2: Si no es válido se lo vuelvo a pedir*/

	public static long readNumbers(String msj, long x, ReadComparation value) {
		long l = 0L;
		boolean next;

		switch (value) {

		case MAYOR_IGUAL:
			System.out.println(msj);
			do {
				next = false;
				try {
					l = keyboard.nextLong();
					if (l < x) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MENOR_IGUAL:
			System.out.println(msj);
			do {
				next = false;
				try {
					l = keyboard.nextLong();
					if (l > x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;
		case MAYORVALOR:
			System.out.println(msj);
			do {
				next = false;
				try {
					l = keyboard.nextLong();
					if (l <= x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;
		case MENORVALOR:
			System.out.println(msj);
			do {
				next = false;
				try {
					l = keyboard.nextLong();
					if (l >= x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;
		}

		return l;
	}

	//Lectura de datos numericos de tipo float para comparacion

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Si el número se sale del rango nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Comparará los dos números.
		  *4.1: Si es válido lo deuelvo.
	      *4.2: Si no es válido se lo vuelvo a pedir*/

	public static float readNumbers(String msj, float x, ReadComparation value) {
		float f = 0f;
		boolean next;

		switch (value) {

		case MAYOR_IGUAL:
			System.out.println(msj);
			do {
				next = false;
				try {
					f = keyboard.nextFloat();
					if (f < x) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MENOR_IGUAL:
			System.out.println(msj);
			do {
				next = false;
				try {
					f = keyboard.nextFloat();
					if (f > x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MAYORVALOR:
			System.out.println(msj);
			do {
				next = false;
				try {
					f = keyboard.nextFloat();
					if (f <= x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MENORVALOR:
			System.out.println(msj);
			do {
				next = false;
				try {
					f = keyboard.nextFloat();
					if (f >= x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;
		}

		return f;
	}

	//Lectura de datos numericos de tipo double para comparacion

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Si el número se sale del rango nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Comparará los dos números.
		  *4.1: Si es válido lo deuelvo.
	      *4.2: Si no es válido se lo vuelvo a pedir*/

	public static double readNumbers(String msj, double x, ReadComparation value) {
		double d = 0;
		boolean next;

		switch (value) {

		case MAYOR_IGUAL:
			System.out.println(msj);
			do {
				next = false;
				try {
					d = keyboard.nextDouble();
					if (d < x) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MENOR_IGUAL:
			System.out.println(msj);
			do {
				next = false;
				try {
					d = keyboard.nextDouble();
					if (d > x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MAYORVALOR:
			System.out.println(msj);
			do {
				next = false;
				try {
					d = keyboard.nextDouble();
					if (d <= x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MENORVALOR:
			System.out.println(msj);
			do {
				next = false;
				try {
					d = keyboard.nextDouble();
					if (d >= x) {
						System.out.println("el número no es válido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es válido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;
		}

		return d;
	}

	//Lectura de datos numericos de tipo byte para comparacion entre rangos.

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Si el número se sale del rango nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Comparará los dos números.
		  *4.1: Si es válido lo deuelvo.
	      *4.2: Si no es válido se lo vuelvo a pedir*/

	public static byte readNumberang(String msj, byte x, byte y, ReadIncluyed value) {
		byte b = 0;
		boolean next;

		if (y < x) {
			throw new IllegalArgumentException();
		}

		switch (value) {

		case INCLUIDOS:
			System.out.println(msj);
			do {
				next = false;
				try {
					b = keyboard.nextByte();
					if (b < x || b > y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case EXCLUIDOS:
			System.out.println(msj);
			do {
				next = false;
				try {
					b = keyboard.nextByte();
					if (b <= x || b >= y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MINIMO_INCLUIDO:
			System.out.println(msj);
			do {
				next = false;
				try {
					b = keyboard.nextByte();
					if (b < x || b >= y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MAXIMO_INCLUIDO:
			System.out.println(msj);
			do {
				next = false;
				try {
					b = keyboard.nextByte();
					if (b <= x || b > y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		}
		return b;

	}

	//Lectura de datos numericos de tipo short para comparacion entre rangos.

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Si el número se sale del rango nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Comparará los dos números.
		  *4.1: Si es válido lo deuelvo.
	      *4.2: Si no es válido se lo vuelvo a pedir*/

	public static short readNumberang(String msj, short x, short y, ReadIncluyed value) {
		short s = 0;
		boolean next;

		if (y < x) {
			throw new IllegalArgumentException();
		}

		switch (value) {

		case INCLUIDOS:
			System.out.println(msj);
			do {
				next = false;
				try {
					s = keyboard.nextShort();
					if (s < x || s > y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case EXCLUIDOS:
			System.out.println(msj);
			do {
				next = false;
				try {
					s = keyboard.nextShort();
					if (s <= x || s >= y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MINIMO_INCLUIDO:
			System.out.println(msj);
			do {
				next = false;
				try {
					s = keyboard.nextShort();
					if (s < x || s >= y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MAXIMO_INCLUIDO:
			System.out.println(msj);
			do {
				next = false;
				try {
					s = keyboard.nextShort();
					if (s <= x || s > y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		}
		return s;

	}

	//Lectura de datos numericos de tipo int para comparacion entre rangos.

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Si el número se sale del rango nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Comparará los dos números.
		  *4.1: Si es válido lo deuelvo.
	      *4.2: Si no es válido se lo vuelvo a pedir*/

	public static int readNumberang(String msj, int x, int y, ReadIncluyed value) {
		int i = 0;
		boolean next;

		if (y < x) {
			throw new IllegalArgumentException();
		}

		switch (value) {

		case INCLUIDOS:
			System.out.println(msj);
			do {
				next = false;
				try {
					i = keyboard.nextInt();
					if (i < x || i > y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case EXCLUIDOS:
			System.out.println(msj);
			do {
				next = false;
				try {
					i = keyboard.nextInt();
					if (i <= x || i >= y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MINIMO_INCLUIDO:
			System.out.println(msj);
			do {
				next = false;
				try {
					i = keyboard.nextInt();
					if (i < x || i >= y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MAXIMO_INCLUIDO:
			System.out.println(msj);
			do {
				next = false;
				try {
					i = keyboard.nextInt();
					if (i <= x || i > y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		}
		return i;

	}

	//Lectura de datos numericos de tipo long para comparacion entre rangos.

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Si el número se sale del rango nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Comparará los dos números.
		  *4.1: Si es válido lo deuelvo.
	      *4.2: Si no es válido se lo vuelvo a pedir*/

	public static long readNumberang(String msj, long x, long y, ReadIncluyed value) {
		long l = 0L;
		boolean next;

		if (y < x) {
			throw new IllegalArgumentException();
		}

		switch (value) {

		case INCLUIDOS:
			System.out.println(msj);
			do {
				next = false;
				try {
					l = keyboard.nextLong();
					if (l < x || l > y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case EXCLUIDOS:
			System.out.println(msj);
			do {
				next = false;
				try {
					l = keyboard.nextLong();
					if (l <= x || l >= y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MINIMO_INCLUIDO:
			System.out.println(msj);
			do {
				next = false;
				try {
					l = keyboard.nextLong();
					if (l < x || l >= y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MAXIMO_INCLUIDO:
			System.out.println(msj);
			do {
				next = false;
				try {
					l = keyboard.nextLong();
					if (l <= x || l > y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		}
		return l;

	}

	//Lectura de datos numericos de tipo float para comparacion entre rangos.

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Si el número se sale del rango nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Comparará los dos números.
		  *4.1: Si es válido lo deuelvo.
	      *4.2: Si no es válido se lo vuelvo a pedir*/

	public static float readNumberang(String msj, float x, float y, ReadIncluyed value) {
		float f = 0F;
		boolean next;

		if (y < x) {
			throw new IllegalArgumentException();
		}

		switch (value) {

		case INCLUIDOS:
			System.out.println(msj);
			do {
				next = false;
				try {
					f = keyboard.nextFloat();
					if (f < x || f > y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case EXCLUIDOS:
			System.out.println(msj);
			do {
				next = false;
				try {
					f = keyboard.nextFloat();
					if (f <= x || f >= y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MINIMO_INCLUIDO:
			System.out.println(msj);
			do {
				next = false;
				try {
					f = keyboard.nextFloat();
					if (f < x || f >= y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MAXIMO_INCLUIDO:
			System.out.println(msj);
			do {
				next = false;
				try {
					f = keyboard.nextFloat();
					if (f <= x || f > y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		}
		return f;

	}

	//Lectura de datos numericos de tipo double para comparacion entre rangos.

	/* Paso 1: Pedimos al usuario que introduzca un número
	 * Paso 2: Se introduce el número por teclado.
	 * Paso 3: Si el número se sale del rango nos mostrará un mensaje de error y se nos volverá
	 * a pedir el número.
	 * Paso 4: Comparará los dos números.
		  *4.1: Si es válido lo deuelvo.
	      *4.2: Si no es válido se lo vuelvo a pedir*/

	public static double readNumberang(String msj, double x, double y, ReadIncluyed value) {
		double d = 0;
		boolean next;

		if (y < x) {
			throw new IllegalArgumentException();
		}

		switch (value) {

		case INCLUIDOS:
			System.out.println(msj);
			do {
				next = false;
				try {
					d = keyboard.nextDouble();
					if (d < x || d > y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case EXCLUIDOS:
			System.out.println(msj);
			do {
				next = false;
				try {
					d = keyboard.nextFloat();
					if (d <= x || d >= y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MINIMO_INCLUIDO:
			System.out.println(msj);
			do {
				next = false;
				try {
					d = keyboard.nextDouble();
					if (d < x || d >= y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		case MAXIMO_INCLUIDO:
			System.out.println(msj);
			do {
				next = false;
				try {
					d = keyboard.nextDouble();
					if (d <= x || d > y) {
						System.out.println("el número no es valido");
						next = true;
					}
				} catch (Exception e) {
					System.out.println("El número introducido no es valido");
					keyboard.nextLine();
					next = true;
				}
			} while (next);
			break;

		}
		return d;

	}

	//Lectura de un booleano, introducción de 3 mensajes.

	/* Paso 1: Mostraremos al usuario 3 mensajes por pantalla.
	 * Paso 2: Para continuar o responder debera introducir el número 1 o el número 2
	 * Paso 3: si introduce "1", saldrá por pantalla "True"
	 * Paso 4: Si introduce "2", saldrá por pantalla "False"
	 * Paso 5: Si no introduce uno de esos dos números, saldrá un mensaje de error.*/

	public static Boolean readBoolean(String msj, String msj2, String msj3) {
		boolean b = false, exit = true;
		int x;

		do {
			try {
				System.out.println(msj + ":");
				System.out.println("   1-" + msj2);
				System.out.println("   2-" + msj3);
				x = keyboard.nextInt();
				exit = false;

				if (x != 1 && x != 2) {
					System.out.println("Error, ese número no es válido");
					exit = true;
				}

				else if (x == 1) {
					b = true;
				} else {
					b = false;
				}

			} catch (Exception e) {
				System.out.println("Error, porfavor introduce un número");
				keyboard.nextLine();
			}
		} while (exit);
		return b;

	}

	// Lectura del segundo boleeano, utilizando sobrecarga e introduciendo "s" o "n"

	//Lectura de un booleano, introducción de 3 mensajes.

	/* Paso 1: Mostraremos al usuario 3 mensajes por pantalla.
	 * Paso 2: Para continuar o responder debera introducir las letras "y" o "n"
	 * Paso 3: si introduce "y", saldrá por pantalla "True"
	 * Paso 4: Si introduce "n", saldrá por pantalla "False"
	 * Paso 5: Si no introduce uno de esos dos números, saldrá un mensaje de error.*/

	public static boolean readBoolean(String msj) {
		boolean b = false, exit = true;
		char c;

		do {
			System.out.println(msj + " " + "(s/n)");
			c = keyboard.next().charAt(0);
			c = Character.toUpperCase(c);
			exit = false;
			keyboard.nextLine();

			if (c != 'S' && c != 'N') {
				System.out.println("Error, las letras introducidas no son válidas");
				exit = true;
			} else if (c == 'S') {
				b = true;
			} else {
				b = false;
			}

		} while (exit);
		return b;
	}

}
