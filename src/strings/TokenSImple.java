package strings;

import java.util.StringTokenizer;

public class TokenSImple {

    public static void main(String[] args) {
        String cadena = "Debo, estudiar, mucho, más";
        StringTokenizer st = new StringTokenizer(cadena,",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }
}
