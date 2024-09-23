public class Main {
  public static void main(String args[]) {
    int F [] = new int [100];
    
    int teste = 13;
    int v = 0;
    
    F[0] = 0;
    F[1] = 1;
    
    for (int i = 2; i < 100; i++) {
        F[i] = F[i-2] + F[i-1];
        
        if (teste == F[i]) {
            v = 1;
        }
    }
    
    if (v == 0) {
        System.out.printf("O número não está na sequência!");
    } else {
        System.out.printf("O número está na sequência!");
    }
  }
}
