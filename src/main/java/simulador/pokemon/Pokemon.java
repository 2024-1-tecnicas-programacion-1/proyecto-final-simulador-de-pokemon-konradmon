package simulador.pokemon;

public abstract class Pokemon {
    protected String nombre;
    protected int salud;
    protected int puntosDeAtaque;
    protected TipoPokemon tipo;
    protected EstadoPokemon estado;

    public Pokemon(String nombre, TipoPokemon tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = EstadoPokemon.NORMAL;
    }

    public abstract void atacar(Pokemon oponente);

    public void recibirDaño(int daño) {
        this.salud -= daño;
        if (this.salud <= 0) {
            this.salud = 0;
            this.estado = EstadoPokemon.DEBILITADO;
        }
    }

    public void entrenar() {
    }
}
 
   
