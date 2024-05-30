package simulador.entrenador;

import java.util.ArrayList;
import java.util.List;
import simulador.pokemon.Pokemon;

public class Entrenador {
    private String nombre;
    private List<Pokemon> pokemones;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemones = new ArrayList<>();
    }

    public void agregarPokemon(Pokemon pokemon) {
        this.pokemones.add(pokemon);
    }

    public void entrenarPokemon(Pokemon pokemon) {
        pokemon.entrenar();
    }

    public void mostrarPokemones() {
        System.out.println("Los pokemones de " + this.nombre + "son: ");
        for (Pokemon pokemon : pokemones) {
            System.out.println("\n "+ pokemon.getNombre());
        }
    }

    public Pokemon elegirPokemonParaBatalla() {
        
        return null;
    }
}