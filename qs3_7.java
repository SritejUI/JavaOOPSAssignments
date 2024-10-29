class Exception1 extends Exception {
  Exception1(String str) {
    super(str);
  }
}

class Tester {
  public void method1() throws Exception1 {
    throw new Exception1("Exception1 Handled");
  }
}

public class qs3_7 {
  public static void main(String[] args) {
    Tester t = new Tester();
    throw {
      t.method1();
    }
    catch(Exception1 e) {
      System.out.println(e.getMessage());
    }
  }
}
