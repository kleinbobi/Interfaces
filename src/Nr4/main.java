package Nr4;

public class main {

    public static void main(String[] args) {
        MeineDefaultListe b = new MeineDefaultListe();

        for (int i = 0; i < 20; i++) {
            b.einfuegenErstesElement(i);
        }

        MeinIterator it = b.elemente();


        for (int i = 0; i < 20; i++) {
            if(i == 10){
                it.loeschenAktuellesElement();
            }

            System.out.println(i + "----->" + it.naechstesElement());


        }



    }
}
