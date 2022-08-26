package strings;

public class EjStringBuffer {

    public static void main(String[] args) {
        String g = "g";
        Long timeInicial = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            g = g + "o";

        }
        Long timeFinal = System.currentTimeMillis();
        long tt = timeFinal - timeInicial;

        System.out.println(tt + " milisegundos, utilizando el operador +");

        //vamos con la clase StringBuffer
        timeInicial = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            // g=g+"o";

            sb.append("o");

        }

        timeFinal = System.currentTimeMillis();
        tt = timeFinal - timeInicial;

        System.out.println(tt + " milisegundos, utilizando la clase StringBuffer");

        //vamos con la clase StringBuffer
        timeInicial = System.currentTimeMillis();
        StringBuilder sbui = new StringBuilder();
        for (int i = 0; i < 10000; i++) {

            sbui.append("o");

        }

        timeFinal = System.currentTimeMillis();
        tt = timeFinal - timeInicial;

        System.out.println(tt + " milisegundos, utilizando la clase StringBuilder");

    }

}
