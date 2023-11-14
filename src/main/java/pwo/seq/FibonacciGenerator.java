package pwo.seq;

import java.math.BigDecimal;

/**
 * Ta klasa reprezentuje generator ciągu Fibonacciego.
 * Rozszerza abstrakcyjną klasę Generator.
 * @author gabriela
 * @version 1.0.0
 */
public class FibonacciGenerator extends Generator {

    /**
     * Konstruktor dla FibonacciGenerator.
     * Inicjalizuje zmienne current, f_1 i f_2.
     */
    public FibonacciGenerator() {
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * Zresetuj generator do stanu początkowego.
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

     /**
     * Generuj następny element ciągu Fibonacciego.
     * @return Następny element ciągu jako BigDecimal.
     */
    @Override
    public BigDecimal nextTerm() {

        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 1) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }

        lastIndex++;
        return current;
    }
}
