package githubconect;

public class ContinueExample {
public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
       if (i % 2 == 0) {
          continue; // skips even numbers
       }
       System.out.println(i);
    }
 }
}
