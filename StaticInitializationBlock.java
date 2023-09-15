
public class StaticInitializationBlock {
  static {
    System.out.println(2);
  }

  public static void main(String[] args) {
    System.out.println(3);

    System.out.println(A.i);
  }
}

class A {
  static int i = 80;

  static {
    System.out.println(1);

    // i = 100;
  }
}
