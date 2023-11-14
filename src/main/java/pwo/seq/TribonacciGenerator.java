package pwo.seq;

import java.math.BigDecimal;

/**
 * Generuje ciąg Tribonacciego, rozszerzając klasę FibonacciGenerator.
 * Ciąg Tribonacciego to seria liczb, gdzie każda liczba jest sumą trzech poprzednich.
 *
  * @author gabriela
  * @version  1.0.0
 */
public class TribonacciGenerator extends
        FibonacciGenerator {

    /**
     * Konstruktor inicjuje trzeci wyraz ciągu Tribonacciego na 0.
     */
    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    /**
     * Resetuje generator Tribonacciego, wywołując metodę reset z nadklasy,
     * a następnie ustawia trzeci wyraz na 0.
     */
    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

    /**
     * Oblicza i zwraca następny wyraz ciągu Tribonacciego.
     * Przesłania metodę z nadklasy.
     *
     * @return Następny wyraz ciągu Tribonacciego.
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }
}
