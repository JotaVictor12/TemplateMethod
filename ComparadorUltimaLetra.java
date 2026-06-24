import java.util.Comparator;

public class ComparadorUltimaLetra implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1 == null || o1.isEmpty()) return -1;
        if (o2 == null || o2.isEmpty()) return  1;

        char ultimaLetraO1 = Character.toLowerCase(o1.charAt(o1.length() - 1));
        char ultimaLetraO2 = Character.toLowerCase(o2.charAt(o2.length() - 1));

        if (ultimaLetraO1 < ultimaLetraO2) return -1;
        if (ultimaLetraO1 > ultimaLetraO2) return  1;
        return 0; // últimas letras iguais
    }
}
