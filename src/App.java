public class App {
    public static void main(String[] args) throws Exception {
        Aplicacao aplicacao = new Blog(new Light());
        aplicacao.construir();

        Aplicacao app = new Loja(new Dark());
        app.construir();

        Aplicacao ap = new SiteNoticias(new Light());
        ap.construir();

    }
}
