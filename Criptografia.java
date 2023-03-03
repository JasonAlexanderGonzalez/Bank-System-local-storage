/**
 * @author jason
 * Clase encripta contrasesena cliente
 */
public class Criptografia {

    /**
     *
     * @param palaSecreta
     * @return retorna la palbra encriptada
     */

    public String encriptacion(String palaSecreta) {

        palaSecreta = palaSecreta.replace("b", ",");
        palaSecreta = palaSecreta.replace("c", "|");
        palaSecreta = palaSecreta.replace("d", "!");
        palaSecreta = palaSecreta.replace("f", "#");
        palaSecreta = palaSecreta.replace("g", "$");
        palaSecreta = palaSecreta.replace("h", "V");
        palaSecreta = palaSecreta.replace("j", "&");
        palaSecreta = palaSecreta.replace("k", "/");
        palaSecreta = palaSecreta.replace("l", "(");
        palaSecreta = palaSecreta.replace("m", ")");
        palaSecreta = palaSecreta.replace("n", "=");
        palaSecreta = palaSecreta.replace("p", "?");
        palaSecreta = palaSecreta.replace("q", "¡");
        palaSecreta = palaSecreta.replace("r", "{");
        palaSecreta = palaSecreta.replace("s", "}");
        palaSecreta = palaSecreta.replace("t", "[");
        palaSecreta = palaSecreta.replace("w", "]");
        palaSecreta = palaSecreta.replace("x", "*");
        palaSecreta = palaSecreta.replace("y", "^");
        palaSecreta = palaSecreta.replace("z", "-");

        palaSecreta = palaSecreta.replace("B", "1");
        palaSecreta = palaSecreta.replace("C", "2");
        palaSecreta = palaSecreta.replace("D", "3");
        palaSecreta = palaSecreta.replace("F", "4");
        palaSecreta = palaSecreta.replace("G", "5");
        palaSecreta = palaSecreta.replace("H", "6");
        palaSecreta = palaSecreta.replace("J", "7");
        palaSecreta = palaSecreta.replace("K", "8");
        palaSecreta = palaSecreta.replace("L", "9");
        palaSecreta = palaSecreta.replace("M", "_");
        palaSecreta = palaSecreta.replace("N", "<");
        palaSecreta = palaSecreta.replace("P", ">");
        palaSecreta = palaSecreta.replace("Q", "?");
        palaSecreta = palaSecreta.replace("R", "~");
        palaSecreta = palaSecreta.replace("S", "%");
        palaSecreta = palaSecreta.replace("T", "@");
        palaSecreta = palaSecreta.replace("W", "£");
        palaSecreta = palaSecreta.replace("X", "¥");
        palaSecreta = palaSecreta.replace("Y", "¢");
        palaSecreta = palaSecreta.replace("Z", "½");

        palaSecreta = palaSecreta.replace("e", ".");
        palaSecreta = palaSecreta.replace("i", "¼");
        palaSecreta = palaSecreta.replace("o", "¾");
        palaSecreta = palaSecreta.replace("U", ";");
        palaSecreta = palaSecreta.replace("A", ":");
        palaSecreta = palaSecreta.replace("E", "'");
        palaSecreta = palaSecreta.replace("I", "_");
        palaSecreta = palaSecreta.replace("O", "@");
        palaSecreta = palaSecreta.replace("U", "?");

        String originalString = palaSecreta;

        int contador = 0;

        for (int i = 0; i < palaSecreta.length(); i++) {

            char c = palaSecreta.charAt(i);

            if ((c == 'a')) {

                contador++;

                String frente = palaSecreta.substring(0, i);
                String atras = palaSecreta.substring(i + 1);
                palaSecreta = frente + "+" + atras;

            }

        }
        return palaSecreta;
    }

    /**
     *
     * @param secreta
     * @return retona la palbra desencriptada
     */

    public String desEncriptacion(String secreta) {

        secreta = secreta.replace(",", "b");
        secreta = secreta.replace("|", "c");
        secreta = secreta.replace("!", "d");
        secreta = secreta.replace("#", "f");
        secreta = secreta.replace("$", "g");
        secreta = secreta.replace("V", "h");
        secreta = secreta.replace("&", "j");
        secreta = secreta.replace("/", "k");
        secreta = secreta.replace("(", "l");
        secreta = secreta.replace(")", "m");
        secreta = secreta.replace("=", "n");
        secreta = secreta.replace("?", "p");
        secreta = secreta.replace("¡", "q");
        secreta = secreta.replace("{", "r");
        secreta = secreta.replace("}", "s");
        secreta = secreta.replace("[", "t");
        secreta = secreta.replace("]", "w");
        secreta = secreta.replace("*", "x");
        secreta = secreta.replace("^", "y");
        secreta = secreta.replace("-", "z");

        secreta = secreta.replace("1", "B");
        secreta = secreta.replace("2", "C");
        secreta = secreta.replace("3", "D");
        secreta = secreta.replace("4", "F");
        secreta = secreta.replace("5", "G");
        secreta = secreta.replace("6", "H");
        secreta = secreta.replace("7", "J");
        secreta = secreta.replace("8", "K");
        secreta = secreta.replace("9", "L");
        secreta = secreta.replace("_", "M");
        secreta = secreta.replace("<", "N");
        secreta = secreta.replace(">", "P");
        secreta = secreta.replace("?", "Q");
        secreta = secreta.replace("~", "R");
        secreta = secreta.replace("%", "S");
        secreta = secreta.replace("@", "T");
        secreta = secreta.replace("£", "W");
        secreta = secreta.replace("¥", "X");
        secreta = secreta.replace("¢", "Y");
        secreta = secreta.replace("½", "Z");

        secreta = secreta.replace("+", "a");
        secreta = secreta.replace(".", "e");
        secreta = secreta.replace("¼", "i");
        secreta = secreta.replace("¾", "o");
        secreta = secreta.replace(";", "u");
        secreta = secreta.replace(":", "A");
        secreta = secreta.replace("'", "E");
        secreta = secreta.replace("_", "I");
        secreta = secreta.replace("@", "O");
        secreta = secreta.replace("?", "U");

        String originalString = secreta;

        for (int i = 0; i < secreta.length(); i++) {

            char c = secreta.charAt(i);

            String haciaFrente = secreta.substring(0, i);
            String HaciaAtras = secreta.substring(i + 1);
        }

        return secreta;

    }

}
