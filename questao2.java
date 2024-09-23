public class Main {
  public static void main(String args[]) {
    String texto = "Marco Aurelio";
    int contador = 0;
    char a = 'a';
    char A = 'A';
    
    for (int i = 0; i < texto.length(); i++) {
        if (texto.charAt(i) == a || texto.charAt(i) == A){
            contador++;
        }
    }
    
    if(contador == 0){
        System.out.printf("A letra 'a' não aparece nessa frase!");
    } else{
        System.out.println("A letra 'a' aparece " + contador + " vezes!");
    }
  }
}
