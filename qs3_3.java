class SuperException extends Exception {
  SuperException(String str) {
    super("SuperException");
  }
}

class SubException extends SuperException {
    SubException(String str) {
      super(str);
    }
}

public class qs3_3 {
  public static void main(String[] args) {
    try {
      throw new SubException("This is a SubException");
    }
    catch(SuperException e) {
      System.out.println(e);
    }
  }
}
