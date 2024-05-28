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
    
    public double obtenerMultiplicadorDeDaño(TipoPokemon atacante, TipoPokemon defensor) {
        switch (atacante) {
            case FUEGO:
                if (defensor == PLANTA || defensor == HIELO) return 2.0;
                if (defensor == AGUA || defensor == FUEGO) return 0.5;
                break;
            case AGUA:
                if (defensor == FUEGO || defensor == ROCA) return 2.0;
                if (defensor == AGUA || defensor == PLANTA) return 0.5;
                break;
            case ELECTRICO:
                if (defensor == AGUA || defensor == VOLADOR) return 2.0;
                if (defensor == ELECTRICO || defensor == TIERRA) return 0.5;
                break;
            case PLANTA:
                if (defensor == AGUA || defensor == TIERRA) return 2.0;
                if (defensor == FUEGO || defensor == PLANTA) return 0.5;
                break;
            case HIELO:
                if (defensor == PLANTA || defensor == VOLADOR) return 2.0;
                if (defensor == FUEGO || defensor == HIELO) return 0.5;
                break;
            case ROCA:
                if (defensor == FUEGO || defensor == VOLADOR) return 2.0;
                if (defensor == AGUA || defensor == PLANTA) return 0.5;
                break;
            case VOLADOR:
                if (defensor == PLANTA) return 2.0;
                if (defensor == ELECTRICO || defensor == ROCA) return 0.5;
                break;
            case FANTASMA:
                if (defensor == PSIQUICO || defensor == FANTASMA) return 2.0;
                break;
            case PSIQUICO:
                if (defensor == VENENO) return 2.0;
                if (defensor == PSIQUICO ) return 0.5;
                break;
            case HADA:
                if (defensor == VENENO) return 0.5;
                break;
            case TIERRA:
                if (defensor == VENENO || defensor == ROCA) return 2.0;
                if (defensor == PLANTA || defensor == VOLADOR) return 0.5;
                break;
            case VENENO:
                if (defensor == PLANTA || defensor == HADA) return 2.0;
                if (defensor == VENENO || defensor == TIERRA) return 0.5;
                break;
            default:
                return 1.0;
        }
        return 1.0;
    }
}



