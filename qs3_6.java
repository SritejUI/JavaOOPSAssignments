class Exception1 extends Exception {
  Exception1(String str) {
    super(str);
  }
}

public class qs3_6 {
  public static void main(String[] args) {
    throw {
      throw new Exception1("Exception1 Handled");
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
