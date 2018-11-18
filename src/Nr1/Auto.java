package Nr1;

public class Auto implements Groesse, Comparable{

    int hoehe;

    int leange;

    int breite;

    public Auto(int hoehe, int leange, int breite) {
        this.hoehe = hoehe;
        this.leange = leange;
        this.breite = breite;
    }

    public Auto(){
        super();
    }

    public void setHoehe(int hoehe){
        this.hoehe = hoehe;
    }

    public void setLeange(int leange){
        this.leange = leange;
    }

    public void setBreite(int breite){
        this.breite = breite;
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
        return "Auto{" +
                "hoehe=" + hoehe +
                ", leange=" + leange +
                ", breite=" + breite +
                " Fläche = " + breite*leange +
                '}';
    }
}
