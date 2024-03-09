import java.util.*;

class Main{
  public static void main(String[] args){
    
    Scanner scr = new Scanner(System.in);
    int n = scr.nextInt();
    int firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + " ");

      // Computing the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
    
  }
}
