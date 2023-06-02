
class Main { 
  static void imprime(){
    System.out.println("imprime só essa poha");
  }

static void meuMetodo(String nome) {
    System.out.println("seu nome é:" + nome );
}
  static void nomeEidade(String nome,int ano) {
    System.out.println(nome + " tem "  + ano + 
 " anos ");
}
  public static void main (String[] args){

  imprime();
    
  meuMetodo("Abner jezrrel");
  meuMetodo("Adriana Lopes");
  meuMetodo("Amanda Hillary");

  
  nomeEidade("abner",  17);  
  nomeEidade("adriana",  47); 
  nomeEidade("hillary",  24); 
    

  }



    
  
}