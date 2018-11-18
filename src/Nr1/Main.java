package Nr1;

import javax.swing.undo.AbstractUndoableEdit;

public class Main {
    public static void main(String[] args) {
        Groesse[] g = new Groesse[8];

        g[0] = new Auto();

        ((Auto)g[0]).setBreite(10);
        ((Auto)g[0]).setHoehe(1000);
        ((Auto)g[0]).setLeange(4);

        g[1] = new Auto();

        ((Auto)g[1]).setBreite(10);
        ((Auto)g[1]).setHoehe(1000);
        ((Auto)g[1]).setLeange(4);

        g[2] = new Fußballfelder();

        g[3] = new Papierblätter(0);
        g[4] = new Papierblätter(1);
        g[5] = new Papierblätter(2);
        g[6] = new Papierblätter(3);
        g[7] = new Papierblätter(4);


        for(int i = 0 ; i < g.length ; i++){
            System.out.println(g[i].toString());
        }
    }
}
