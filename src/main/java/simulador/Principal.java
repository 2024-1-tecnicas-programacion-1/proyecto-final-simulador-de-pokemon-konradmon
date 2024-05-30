package simulador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import simulador.entrenador.*;
import simulador.pokemon.*;
public class Principal {
    // Lista de entrenadores
    public static List<Entrenador> entrenadores = new ArrayList<>();


    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int op;

        do {
            op=menuPrincipal();
            switch (op) {
                case 1:
                    gestionarEntrenadores();
                    break;
                case 2:
                    gestionarPokemon();
                    break;
                case 3:
                    iniciarBatalla();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (op != 4);
    }
    public static int menuPrincipal(){
        System.out.println("Simulador de Batallas Pokémon");
        System.out.println("1. Gestionar Entrenadores");
        System.out.println("2. Gestionar Pokémones");
        System.out.println("3. Iniciar Batalla");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();
        return opcion;
    }

    public static int menuEntrenadores(){
        System.out.println("");
        System.out.println("");
        System.out.println("Gestionar Entrenadores");
        System.out.println("1. Registrar nuevo entrenador");
        System.out.println("2. Ver lista de entrenadores");
        System.out.println("3. Seleccionar un entrenador");
        System.out.println("4. Volver al menu principal");
        System.out.print("Elige una opcion: ");
        int opcion = sc.nextInt();
        return opcion;
    }
    public static void gestionarEntrenadores() {
        boolean volver = false;
        int op;
        while (!volver) {
            op=menuEntrenadores();
            switch (op) {
                case 1:
                    registrarNuevoEntrenador();
                    break;
                case 2:
                    verListaDeEntrenadores();
                    break;
                case 3:
                    seleccionarEntrenador();
                    break;
                case 4:
                    volver = true;
                    break;
                default:
                    System.out.println("Opcion no valida. Intenta nuevamente.");
            }
        }
    }

    public static void gestionarPokemon() {
    }

    public static void iniciarBatalla() {
    }
}