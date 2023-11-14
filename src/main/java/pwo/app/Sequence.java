package pwo.app;

/**
  * Punkt wejścia do aplikacji Sequence.
 * Analizuje argumenty wiersza poleceń i wykonuje odpowiednią aplikację.
 * @author gabriela
 * @version  1.0.0
 */
public class Sequence {

    /**
     * Główna metoda, która sprawdza liczbę argumentów wiersza poleceń
     * i uruchamia odpowiednią aplikację.
     *
     * @param args Argumenty wiersza poleceń.
     */
    public static void main(String[] args) {

 switch(args.length){
 case 3: (new SeqToOutApp()).run(args); break;
 case 4: (new SeqToFileApp()).run(args); break;
default: System.out.println("!Illegal arguments\n"
 + "Legal usage: seqName from to [fileName]");
 }
 }
 }