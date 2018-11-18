package Nr1;

public class Fußballfelder implements Groesse, Comparable{

    int hoehe;

    int leange;

    int breite;

    public Fußballfelder(){
        hoehe = 0;

        breite = 70;

        leange = 105;
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
        return "Fußballfelder{" +

                ", leange=" + leange +
                ", breite=" + breite +
                " Fläche = " + breite*leange +
                '}';
    }
}
