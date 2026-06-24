import java.util.Arrays;

public class AplicacaoOrdenacao {

    public static void main(String[] args) {

        String[] palavras = {
            "banana",   
            "abacaxi",  
            "uva",      
            "limao",    
            "manga",    
            "kiwi",     
            "melao",    
            "caqui",    
            "pessego",  
            "maracuja"  
        };

        // ── Antes da ordenação ──────────────────────────────────────────────
        System.out.println("Antes da ordenacao:");
        imprimirArray(palavras);

        // ── ORDENAÇÃO 1: por última letra ────────────────────────────────────
        Arrays.sort(palavras, new ComparadorUltimaLetra());

        System.out.println("\n[1] Ordenado pela ultima letra:");
        System.out.printf("  %-14s  %s%n", "Palavra", "Ultima letra");
        System.out.println("  " + "-".repeat(28));
        for (String palavra : palavras) {
            char ultimaLetra = palavra.charAt(palavra.length() - 1);
            System.out.printf("  %-14s  '%c'%n", palavra, ultimaLetra);
        }

        // ── ORDENAÇÃO 2: por tamanho ─────────────────────────────────────────
        Arrays.sort(palavras, new ComparadorTamanho());

        System.out.println("\n[2] Ordenado pelo tamanho:");
        System.out.printf("  %-14s  %s%n", "Palavra", "Tamanho");
        System.out.println("  " + "-".repeat(28));
        for (String palavra : palavras) {
            System.out.printf("  %-14s  %d letras%n", palavra, palavra.length());
        }
    }

    /** Exibe cada elemento do array numerado. */
    private static void imprimirArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("  [%d] %s%n", i, arr[i]);
        }
    }
}