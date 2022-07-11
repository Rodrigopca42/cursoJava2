

import data.Calendario;


public class App {
   
    public static void main(String[] args) {
        
       Calendario d1 = new Calendario(25, 03, 2012);

        var d2 = new Calendario();



        System.out.println(d1.obterDataFomatada());
        System.out.println(d2.obterDataFomatada());




    }
}
