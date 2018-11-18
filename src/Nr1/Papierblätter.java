package Nr1;

public class Papierblätter implements Groesse, Comparable{

    int hoehe;

    int leange;

    int breite;

    public Papierblätter(int format){
        hoehe = 0;
        setFormat(format);


    }


    @Override
    public int getLeange() {
        return leange;
    }

    @Override
    public int getBreite() {
        return breite;
    }

    @Override
    public int getHoehe() {
        return hoehe;
    }

    @Override
    public int compareTo(Object o) throws ClassCastException{
        if(!(o instanceof Groesse))
            throw new ClassCastException();

        int grundfleache1 = breite*leange;
        int grundfleache2 = ((Groesse) o).getBreite()*((Groesse) o).getLeange();



        return grundfleache1 - grundfleache2;
    }

    @Override
    public String toString() {
        return "Papierblätter{" +

                ", leange=" + leange +
                ", breite=" + breite +
                " Fläche = " + breite*leange +
                '}';
    }

    private void setFormat(int format){
        switch (format){
            case 0:{
                breite = 841;
                leange = 1189;
                break;
            }

            case 1:{
                breite = 594;
                leange = 841;
                break;
            }

            case 2:{
                breite = 420;
                leange = 594;
                break;
            }

            case 3:{
                breite = 297;
                leange = 420;
                break;
            }

            case 4:{
                breite = 210;
                leange = 297;
                break;
            }


        }





    }

}
