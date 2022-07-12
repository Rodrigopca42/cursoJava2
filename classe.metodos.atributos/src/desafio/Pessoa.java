package desafio;

public class Pessoa {
      

    String nome;
    double peso;
    

   Pessoa (String nome, double peso){
    this.nome = nome;
    this.peso = peso;
   }

 void comer(Comida comida){
    if(comida != null){
       this.peso += Comida.peso;
    }
  }

  String apresentar(){
    return "Olá ! Eu sou o " + nome + " e tenho  "+ peso + " Kgs.";
  }

}
