package tp1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public abstract class ConsoleService<T, R> {

  private Scanner scanner;

  public ConsoleService() {
    this.scanner = new Scanner(System.in);
  }

  public String readString() {
    return this.scanner.next();
  }

  
  
  /**
   * Permet de lire un entier.
   * 
   * 
   * @return entier lu &agrave; partir du <i>System.in</i>.
   */
  public int readInt() {
    return this.scanner.nextInt();
  }

  public double readDouble() {
    return this.scanner.nextDouble();
  }

  public char readChar() {
    return Character.forDigit(this.scanner.nextInt(), 10);
  }

  public void run(T args) {

  }

  public void assertEqual(Object a, Object b) {
    if (b == null || !a.equals(b)) {
      System.err.println("Attendu " + a + ", actuel : " + b);
      throw new RuntimeException();
    } else {
      System.out.println(" Test avec succés");
    }
  }

  public void assertEqual(int[] a, int[] b) {
    if (b == null || a.length != b.length) {
      System.err.println("Attendu " + Arrays.toString(a) + ", actuel : " + Arrays.toString(b));
      throw new RuntimeException();
    }

    long diff = IntStream.range(0, a.length)
      .filter(index -> a[index] != b[index])
      .count();

    if (diff != 0) {
      System.err.println("Attendu " + Arrays.toString(a) + ", actuel : " + Arrays.toString(b));
      throw new RuntimeException();
    } else {
      System.out.println(" Test avec succés");
    }
  }

  public R runWithControl(T args) {
    return null;
  }

}
