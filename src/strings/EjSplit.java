package strings;

class EjSplit {

    static public void main(String[] args) {

        String cadena = " ya, casí, salen";
        String[] ninja = cadena.split("\\,");
        for (String ninja1 : ninja) {
            System.out.println(ninja1);
        }

        int posComa = cadena.indexOf(",");

        System.out.println(posComa);

        String cadena2 = cadena.substring(posComa, cadena.length());

        System.out.println(cadena2);

    }
}
