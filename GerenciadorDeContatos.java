import java.util.HashMap;

public class GerenciadorDeContatos {
  public HashMap<String, String> Contatos= new HashMap<String, String>();  

  public void AdicionarContato(String nome, String tele){
    this.Contatos.put(nome, tele);
  }
  public void RemoverContato(String nome){
    this.Contatos.remove(nome);
  }
  public void BuscarContato(String nome){
    System.out.println(this.Contatos.get(nome));
  }
  public void ListarContatos(){
    Contatos.forEach((nome, tele)->{
        System.out.print(nome);
        System.out.print("  ");
        System.out.println(tele);
    });
  }
    public void pesquisarImplantar(String nome, String tele) {
        if (Contatos.containsKey(nome)) {
            System.out.println("Contato já existe. Atualizando o número de telefone...");
        } else {
            System.out.println("Novo contato. Implantando...");
        }
        
        Contatos.put(nome, tele);
        System.out.println("Contato " + nome + " implantado com sucesso!");
  }
}
