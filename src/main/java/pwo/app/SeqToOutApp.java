package pwo.app;

import pwo.utils.SequenceTools;

/**
 * Ta klasa reprezentuje aplikację CLI, która drukuje ciąg do terminala.
 * Rozszerza klasę SeqToFileApp, co sugeruje, że jest częścią hierarchii aplikacji związanych z ciągami.
 * Przesłania metody obsługi argumentów, zapisywania ciągów i uruchamiania aplikacji.
 * @author gabriela
 * @version  1.0.0
 */
public class SeqToOutApp extends SeqToFileApp {

    /**
     * Przesłania metodę do obsługi argumentów wiersza polecenia. 
     * Najpierw sprawdza argumenty za pomocą metody nadklasy i zwraca true, jeśli są one poprawne.
     * Następnie sprawdza, czy seqType nie jest nullem, a from/to są nieujemne.
     * 
     * @param args Argumenty wiersza polecenia
     * @return true, jeśli argumenty są poprawne, false w przeciwnym razie
     */
    @Override
 protected boolean getArgs(String[] args) {

 if(super.getArgs(args)) return true;

 return seqType != null && from >= 0 && to >= 0;
 }

    /**
     * Przesłania metodę do zapisywania ciągu do terminala.
     * Używa SequenceTools.getTermsAsColumn do pobrania terminów ciągu w formie kolumny i drukuje je.
     * 
     * @return true, oznaczające udane zapisywanie ciągu
     */
    @Override
 protected boolean wirteSeq() {

 System.out.println(SequenceTools.getTermsAsColumn(
 seqType.getGenerator(), from, to));

 return true;
 }

     /**
     * Przesłania metodę do uruchamiania aplikacji.
     * Drukuje komunikat o rozpoczęciu aplikacji.
     * Jeśli argumenty nie są ważne, drukuje komunikat o błędzie i kończy działanie.
     * W przeciwnym razie zapisuje ciąg do terminala.
     * 
     * @param args Argumenty wiersza polecenia
     */
    @Override
 public void run(String[] args) {

 System.out.println("Sequence to terminal CLI app");

 if (!getArgs(args)) {
 System.out.println("""
                    !Illegal arguments
                    Legal usage: seqName from to""");
 return;
 }

 wirteSeq();
 }
     
 }