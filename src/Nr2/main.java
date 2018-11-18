package Nr2;

import Nr1.*;


public class main {

    public static void main(String[] args) {

        Nr1.Groesse[] g = new Groesse[10];


        g[0] = new Auto(1500,4000,2500);
        g[1] = new Auto(1000,5600,2600);
        g[2] = new Auto(1800,2200,2100);
        g[3] = new Fußballfelder();
        g[4] = new Fußballfelder();
        g[5] = new Papierblätter(0);
        g[6] = new Papierblätter(1);
        g[7] = new Papierblätter(2);
        g[8] = new Papierblätter(3);
        g[9] = new Papierblätter(4);



        for (int i = 0; i < g.length; i++) {
            System.out.println(g[i].toString());
        }

        for (int i = 0; i < g.length; i++) {
            for (int j = 0 ; j < g.length-1; j++) {
                if(((Comparable)g[j+1]).compareTo(g[j])<0){
                    Groesse e = g[j];

                    g[j]=g[j+1];

                    g[j+1]=e;


                }
            }
        }

        System.out.println("-------------------------------------------------");


        for (int i = 0; i < g.length; i++) {
            System.out.println(((Comparable)g[i]).toString());
        }



    }


}
