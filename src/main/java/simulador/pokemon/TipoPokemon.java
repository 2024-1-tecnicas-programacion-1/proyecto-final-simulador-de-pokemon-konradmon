package simulador.pokemon;

public enum TipoPokemon {
    FUEGO,
    AGUA,  
    VENENO,
    PLANTA, 
    ELECTRICO,
    PSIQUICO,
    HADA,
    TIERRA,
    HIELO, 
    ROCA,
    VOLADOR,
    FANTASMA;

    public static double obtenerMultiplicadorDeDaño(TipoPokemon[] atacantes, TipoPokemon[] defensores) {
        double multiplicador = 1.0;
        for (TipoPokemon atacante : atacantes) {
            for (TipoPokemon defensor : defensores) {
                multiplicador *= obtenerMultiplicadorDeDaño(atacante, defensor);
            }
        }
        return multiplicador;
    }
    
    public static double obtenerMultiplicadorDeDaño(TipoPokemon atacante, TipoPokemon defensor) {
        switch (atacante) {
            case FUEGO:
                switch (defensor) {
                    case PLANTA, HIELO:
                        return 2.0;
                    case AGUA, FUEGO:
                        return 0.5;
                }
            case AGUA:
                switch (defensor) {
                    case FUEGO, ROCA:
                        return 2.0;
                    case AGUA, PLANTA:
                        return 0.5;                }
            case ELECTRICO:
                switch (defensor) {
                    case AGUA, VOLADOR:
                        return 2.0;
                    case ELECTRICO, TIERRA:
                        return 0.5;
                }
            case PLANTA:
                switch (defensor){
                    case AGUA,TIERRA:
                        return 2.0;
                    case FUEGO,PLANTA:
                        return 0.5;
                }
                break;
            case HIELO:
                switch (defensor){
                    case PLANTA,VOLADOR:
                        return 2.0;
                    case FUEGO,HIELO:
                        return 0.5;
                }
                break;
            case ROCA:
                switch (defensor){
                    case FUEGO,VOLADOR:
                        return 2.0;
                    case AGUA, PLANTA:
                        return 0.5;
                }
                break;
            case VOLADOR:
                switch (defensor){
                    case PLANTA:
                        return 2.0;
                    case ELECTRICO,ROCA:
                        return 0.5;
                }
                break;
            case FANTASMA:
                switch (defensor){
                    case PSIQUICO,FANTASMA:
                        return 2.0;
                }
                break;
            case PSIQUICO:
                switch (defensor){
                    case VENENO:
                        return 2.0;
                    case PSIQUICO:
                        return 0.5;
                }
                break;
            case HADA:
                switch (defensor){
                    case VENENO:
                        return 0.5;
                }
                break;
            case TIERRA:
                switch (defensor){
                    case VENENO,ROCA:
                        return 2.0;
                    case PLANTA,VOLADOR:
                        return 0.5;
                                }break;
            case VENENO:
                switch (defensor){
                case PLANTA,HADA:
                    return 2.0;
                case VENENO,TIERRA:
                    return 0.5;
                }break;
            default:
                return 1.0;
        }
        return 1.0;
    }
}



