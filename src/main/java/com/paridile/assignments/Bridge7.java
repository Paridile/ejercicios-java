package com.paridile.assignments;

public class Bridge7 {

	public enum Suits {
		CLUBS(20), DIAMONDS(20), HEARTS(30), SPADES(30), NOTRUMP(40) {
			// recibe 3 como parametro, se hace el cálculo
			public int getValue(int bid) {
				// (3 - 1) * 30 + 40 = 100
				return ((bid - 1) * 30) + 40;
			}
		};

		Suits(int points) {
			this.points = points;
		}

		private int points;

		public int getValue(int bid) {
			return points * bid;
		}
	}

	public enum Coords {
		NORTH, EAST, SOUTH, WEST;
	}

	public static void main(String[] args) {		
		// output: 							100
		System.out.println(Suits.NOTRUMP.getValue(3)); // Envia 3 como parametro al metodo getValue
		
		// output: 				SPADES 					30
		System.out.println(Suits.SPADES + " " + Suits.SPADES.points); // El primero solo hace referencia al enum, el segundo hace referencia al atributo points

		// output: 			
		System.out.println(Suits.values()); // El método values devuelve un array con los valores del enum, por lo tanto se imprime la referencia al objeto

	}
}
