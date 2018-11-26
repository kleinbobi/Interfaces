package Nr4USB;

import Nr4.MeinIterator;
import Nr4.MeineDefaultListe;

public class main {

    public static void main(String[] args) {
        MeineDefaultListe b = new MeineDefaultListe();

        for (int i = 0; i < 20; i++) {
            b.einfuegenErstesElement(i);
        }

        MeinIterator it = b.elemente();

        it.hatNaechstesElement();

        for (int i = 0; i < 20; i++) {

            if (i == 14) {
                it.setzenAktuellesElement(71);
            } else {

                if (i == 10) {
                    it.loeschenAktuellesElement();
                } else {
                    it.naechstesElement();
                }
            }

        }

        MeinIterator itt = b.elemente();
        itt.hatNaechstesElement();

        for (int i = 0; i < 20; i++) {
            System.out.println(itt.naechstesElement());
        }


    }
}
