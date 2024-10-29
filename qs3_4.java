class Exception1 extends Exception{}
class Exception2 extends Exception{}
class Exceotion3 extends Exception{}

class Tester {
  public void m1ethod(int x) throws Exception1,Exception2,Exception3 {
    if (x == 1) throw new Exception1{};
    if (x == 2) throw new Exception2{};
    if (x == 3) throw new Exception3();
  }
}

public class qs3_4 {
  public static void main(String[] args) {
      Tester t = new Tester();
      try {
        t.m1ethod(1);
      }
      catch (Exception e) {
        System.out.println(e);
      }
  }
}
