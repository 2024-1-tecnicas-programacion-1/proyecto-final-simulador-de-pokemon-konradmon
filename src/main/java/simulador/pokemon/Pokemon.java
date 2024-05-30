package simulador.pokemon;

public abstract class Pokemon {
    protected String nombre;
    protected int salud;
    protected int puntosDeAtaque;
    protected TipoPokemon[] tipo;
    protected String estado;

    public Pokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon... tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipo = tipo;
        this.estado = "NORMAL";
    }

    public void atacar(Pokemon oponente) {
        double multiplicador = TipoPokemon.obtenerMultiplicadorDeDaño(this.tipo, oponente.getTipo());
        //El (int) sirve para cambiar el tipo de dato
        int daño = (int) (this.puntosDeAtaque * multiplicador);
        oponente.recibirDaño(daño);
        System.out.println("");
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " causando " + daño + " puntos de daño.");
    }


    public void recibirDaño(int daño) {
        this.salud -= daño;
        if (this.salud <= 0) {
            this.salud = 0;
            this.estado = "DEBILITADO";
        }
    }

    public void entrenar() {

        this.puntosDeAtaque +=20;
        this.salud+=30;
    }

    public int getSalud (){

        return salud;
    }

    public int getpuntosDeAtaque (){

        return puntosDeAtaque;
    }

    public TipoPokemon[] getTipo() {
        return tipo;
    }

    public String getEstado() {

        return estado;

    }

    public String getNombre(){

        return nombre;
    }
}
