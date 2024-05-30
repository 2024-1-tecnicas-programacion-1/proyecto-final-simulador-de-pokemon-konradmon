package simulador.batalla;

import simulador.entrenador.Entrenador;
import simulador.pokemon.Pokemon;

public class Batalla {

    private final Entrenador entrenadorA;
    private final Entrenador entrenadorB;

    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenadorA = entrenador1;
        this.entrenadorB = entrenador2;
    }

    public void iniciarBatalla() {

        //importamos la clase pokemon
        Pokemon pokemon1 = entrenadorA.elegirPokemon();
        Pokemon pokemon2 = entrenadorB.elegirPokemon();

        if (pokemon1 == null || pokemon2 == null) {
            System.out.println("\n puede que los entrenadores no tengan disponible el pokemon ");
        }
        System.out.println("\n ¡Inicia la batalla de " + entrenadorA.getNombre() + " y " + entrenadorB.getNombre() + "! \n " +
                entrenadorA.getNombre() + " elige a " + pokemon1.getNombre()+ "\n "+
                entrenadorB.getNombre() + " elige a " + pokemon2.getNombre());

        while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
            pokemon1.atacar(pokemon2);
            if (pokemon2.getSalud() > 0) {
                pokemon2.atacar(pokemon1);
            }
        }

        if (pokemon1.getSalud() > 0) {
            System.out.println("\n" +entrenadorA.getNombre() + " ha ganado la batalla con " + pokemon1.getNombre() + " aún en pie.");
        } else if (pokemon2.getSalud() > 0) {
            System.out.println("\n"+ entrenadorA.getNombre() + " ha ganado la batalla con " + pokemon2.getNombre() + " aún en pie.");
        } else {
            System.out.println("\n"+"La batalla terminó en empate, ambos Pokémon están debilitados.");
        }
    }
}