package main;

import herencias_pokemon.*;

public class Start {

	public static void main(String[] args) {
		
		Pikachu pika = new Pikachu("Pikachu",2,100);
		Charmander charmander = new Charmander("Charmander",4,90);
		Squirtle squirtle = new Squirtle("Squirtle",3,89);
		
		
		Pokemon pokemons[];
		
		pokemons = new Pokemon[3] ;
		pokemons[0] = pika;
		pokemons[1] = charmander;
		pokemons[2] = squirtle;
		
		for(int i=0;i<3;i++) {
			
			System.out.println("Evoluciones Pokemons-->"+pokemons[i].evolucion());
			System.out.println("Atributos-->"+pokemons[i]);
			System.out.println(">>>>>>>>>>>>>>>>>>>");
		}
		
		
	}

}
