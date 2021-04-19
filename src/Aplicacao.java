public abstract class Aplicacao {
    protected Tema tema;

    public Aplicacao(Tema t) {
        tema = t;
    }

    public void definirTema(String titulo) {
        tema.definirTema(titulo);
    }

    public abstract void construir();
}
