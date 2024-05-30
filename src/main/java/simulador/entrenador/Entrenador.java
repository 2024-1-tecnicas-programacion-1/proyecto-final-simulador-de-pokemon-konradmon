package simulador.entrenador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import simulador.pokemon.Pokemon;

public class Entrenador {
    private String nombre;
    private List<Pokemon> pokemones;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemones = new ArrayList<>();
    }

    public void agregarPokemon(Pokemon pokemon) {
        if (pokemones.size() < 6) {
            pokemones.add(pokemon);
        } else {
            System.out.println("Equipo completo");
        }
    }

    public void entrenarPokemon(Pokemon pokemon) {
        pokemon.entrenar();
    }

    public void mostrarPokemones() {
        if (!pokemones.isEmpty()) {
        System.out.println("Pokemones de " + nombre + ":");
        for (Pokemon pokemon : pokemones) {
            System.out.println("\n "+ pokemon.getNombre());
        }}
        System.out.println("lista vacia");

    }

    public Pokemon elegirPokemon() {mostrarPokemones();
        if (!pokemones.isEmpty()) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Selecciona el número del Pokemon para la batalla: ");
            int numero = sc.nextInt() - 1;

            if (numero >= 0 && numero < pokemones.size()) {
                return pokemones.get(numero);
            } else {
                System.out.println("num no válido. Seleccionando el primer Pokemon.");
                return pokemones.get(0);
            }
        } else {
            System.out.println("No hay Pokemones disponibles.");
            return null;
        }
    }

    public String getNombre() {
        return nombre;
    }
}
