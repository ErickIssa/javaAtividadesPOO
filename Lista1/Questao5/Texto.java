package Questao5;

public final class Texto{ //quando tem so metodos usar final

  public static int contarVogais(String texto) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        String vogais = "aeiouAEIOUáéíóúÁÉÍÓÚãõâêîôûÃÕÂÊÎÔÛ";
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (vogais.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

     public static String conjugarVerbo(String verbo) {
        if (verbo == null || verbo.length() < 3 || !verbo.endsWith("ar")) {
            throw new IllegalArgumentException("Verbo deve terminar em 'ar'");
        }
        
        String radical = verbo.substring(0, verbo.length() - 2);
        
        return "Eu " + radical + "o\n" +
               "Tu " + radical + "as\n" +
               "Ele " + radical + "a\n" +
               "Nós " + radical + "amos\n" +
               "Vós " + radical + "ais\n" +
               "Eles " + radical + "am";
    }

    public static String obterInverso(String texto) {
        if (texto == null) {
            return null;
        }
        return new StringBuilder(texto).reverse().toString();
    }
    
       public static boolean isPalindrome(String texto) {
        if (texto == null) {
            return false;
        }
        
        String textoLimpo = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return textoLimpo.equals(obterInverso(textoLimpo));
    }
}
