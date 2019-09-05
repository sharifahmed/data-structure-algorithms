package prep.codewars;

/**
 * @author sharifahmed
 * @since 9/5/19
 */
public class ComplementaryDNA {

    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
        System.out.println(makeComplement("GTAT"));
    }

    public static String makeComplement(String dna) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            char dnaChar = dna.charAt(i);
            sb.append(getAlternate(dnaChar));
        }
        return sb.toString();
    }

    private static char getAlternate(char ch) {
        switch (ch) {
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'G':
                return 'C';
            case 'C':
                return 'G';
        }
        return ' ';
    }
}
