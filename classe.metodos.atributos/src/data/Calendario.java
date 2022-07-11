package data;

 
 public class Calendario {

    int dia;
    int mes;
    int ano;
    public int Calendario;

     public Calendario(){
        dia = 01;
        mes = 01;
        ano = 1970;
    }

     public Calendario(int diaInical, int mesInicial, int anoIncial){
        dia = diaInical;
        mes = mesInicial;
        ano = anoIncial;
    }

    public String obterDataFomatada(){
        return String.format("%d / %d / %d", dia, mes, ano);
    }
    
 }