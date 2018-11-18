package Nr3;

public class FunktionsPloter {
   public static void printTabel(Funktion funktion){
      System.out.println("Wertetabelle  + " +
              funktion.getClass().getName());

      for (double x = 0.0 ; x <= 5.0 ; x+= 1)
         System.out.println(x + "->" + funktion.compute(x));

   }

   public static void main(String[] args) {
      printTabel(new Wurzel());
      printTabel(new Quadrat());
   }
}
