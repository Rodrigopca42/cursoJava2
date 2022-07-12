package data;

 
 public class Calendario {

    int dia;
    int mes;
    int ano;
  //  public int Calendario;

     public Calendario(){
        //dia = 01;
        //mes = 01;
        //ano = 1970;
        this(1, 1, 1970);
     }
     public Calendario(int diaInical, int mesInicial, int anoIncial){
        this.dia = diaInical;
        this.mes = mesInicial;
        this.ano = anoIncial;
    }

    public String obterDataFomatada(){
        return String.format("%d / %d / %d", dia, mes, ano);
    }
    
 }