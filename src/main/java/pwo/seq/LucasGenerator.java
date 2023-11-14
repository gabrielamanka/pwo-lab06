package pwo.seq;

import java.math.BigDecimal;

/**
  * Klasa implementująca generator ciągu Lucasa, dziedzicząca po FibonacciGenerator.
 * LucasGenerator rozszerza funkcjonalność o specyficzne dla ciągu Lucasa właściwości.
 * @author gabriela
 * @version  1.0.0
 */
public class LucasGenerator extends FibonacciGenerator {

    /**
     * Konstruktor klasy LucasGenerator. Inicjalizuje wartości current i f_2 na podstawie specyfiki ciągu Lucasa.
     */
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Metoda resetująca stan generatora, wywołuje także reset z klasy bazowej (FibonacciGenerator).
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Metoda generująca kolejny element ciągu Lucasa. Nadpisuje funkcję z klasy bazowej w przypadku pierwszego indeksu.
     *
     * @return Kolejny element ciągu Lucasa.
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }
}
