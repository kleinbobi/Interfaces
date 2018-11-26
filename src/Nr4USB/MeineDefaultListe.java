package Nr4USB;

import Nr4.MeinIterator;
import Nr4.MeineListe;

public class MeineDefaultListe implements MeineListe {
    private ListenElement erstesElem = null;

    public boolean einfuegenErstesElement(Object element) {
        boolean ret = false;
        if (element != null) {
            ret = true;
            this.erstesElem = new ListenElement(element, erstesElem);
        }
        return ret;
    }

    public boolean loeschenErstesElement() {
        boolean ret = false;
        if (erstesElem != null) {
            ret = true;
            this.erstesElem = this.erstesElem.naechstesElem;
        }
        return ret;
    }

    public boolean istLeer() {
        return this.erstesElem == null;
    }

    public void leeren() {
        this.erstesElem = null;
    }

    public MeinIterator elemente() {
        // Anonyme Klasse
        return new MeinIterator() {

            private ListenElement aktuellesElem = null;

            public boolean hatNaechstesElement() {
                boolean ret = false;
                if (this.aktuellesElem == null)
                    ret = MeineDefaultListe.this.erstesElem != null;
                else
                    ret = this.aktuellesElem.naechstesElem != null;
                return ret;
            }

            public Object naechstesElement() {
                Object ret = null;
                if (this.aktuellesElem == null) {
                    if (MeineDefaultListe.this.erstesElem != null) {
                        this.aktuellesElem = MeineDefaultListe.this.erstesElem;
                        ret = this.aktuellesElem.element;
                    }
                } else if (this.aktuellesElem.naechstesElem == null)
                    this.aktuellesElem = null;
                else {
                    this.aktuellesElem = this.aktuellesElem.naechstesElem;
                    ret = this.aktuellesElem.element;
                }
                return ret;
            }

            public boolean einfuegenElement(Object element) {
                boolean ret = false;
                if (element != null) {
                    ret = true;
                    if (this.aktuellesElem == null) {
                        MeineDefaultListe.this.erstesElem = new ListenElement(element,
                                MeineDefaultListe.this.erstesElem);
                        this.aktuellesElem = MeineDefaultListe.this.erstesElem;
                    } else {
                        this.aktuellesElem.naechstesElem =
                                new ListenElement(element, this.aktuellesElem.naechstesElem);
                        this.aktuellesElem = this.aktuellesElem.naechstesElem;
                    }
                }
                return ret;
            }

            /**
             * Setzt das Element auf welchem momentan der Iterator zeigt, indem es das in der
             * Liste vorhandene Element mit dem �bergebenen Element ersetzt. Die Position des
             * Iterators wird dabei nicht ver�ndert.
             * @param element das zu setzen ist
             * @return false falls das �bergebene Element null ist oder kein aktuelles Element
             * angesprungen wurde
             */
            public boolean setzenAktuellesElement(Object element) {
                boolean ret = false;

                if (element != null && this.aktuellesElem != null) {
                    ret = true;

                    this.aktuellesElem.element = element;
                }
                return ret;
            }

            /**
             * L�scht das Element, welches momentan das aktuelle Element des Iterators ist. Beim
             * L�schen des aktuellen Elementes wird als neues aktuelles Element jenes Element
             * genommen, welches nach dem zu l�schenden Element steht. Dabei wird von dieser
             * Methode der Iterator so gesetzt, dass der nachfolgende Aufruf von naechstesElement()
             * dieses Element zur�ckliefert.
             * @return false falls es noch kein aktuelles Element gibt, das gel�scht werden k�nnte
             */
            public boolean loeschenAktuellesElement() {
                boolean ret = false;
                ListenElement nech = null;
                ListenElement akk = this.aktuellesElem;
                if (akk == null) {
                    return false;
                }

                if (akk.getnaechstesElem() == null) {
                    this.aktuellesElem = null;
                    return true;
                }


                do {
                    this.naechstesElement();


                    try {
                        aktuellesElem.getnaechstesElem().equals(akk);
                    } catch (NullPointerException e) {
                        this.naechstesElement();
                        this.naechstesElement();
                    }
                } while (!aktuellesElem.getnaechstesElem().equals(akk));

                this.aktuellesElem.naechstesElem = nech;

                return ret;
            }
        };
    }

    // Lokale Klasse
    class ListenElement extends Object {
        private Object element = null;
        private ListenElement naechstesElem = null;

        private ListenElement(
                Object element, ListenElement naechstesElem) {
            this.element = element;
            this.naechstesElem = naechstesElem;
        }

        public Object getnaechstesElem() {
            return naechstesElem;
        }
    }
}
