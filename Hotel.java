public class Hotel {

  int cnpj;
  String nome;
  String endereco;
  Funcionario funcionario;
  Quarto quarto;

  public void tornarDisponivel (quarto.ocupado, quarto.limpo) {
    if ((quarto.reservado == false)&&(quarto.limpo ==true)){
      System.out.println("Quarto está disponível");
    
    }
}