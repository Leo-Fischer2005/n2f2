public class Main {
   public static void main(String[] args) {
    GerenciadorDeContatos Gerenciador = new GerenciadorDeContatos();

    Gerenciador.AdicionarContato("Glauco", "123456789");

    Gerenciador.AdicionarContato("Maria", "987654321"); 

    Gerenciador.BuscarContato("Maria.");

    Gerenciador.ListarContatos();
    }
}