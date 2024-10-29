import java.util.Scanner;
class CustomException extends Exception {
  CustomException(String str) {
    super(str);
  }
}

public class qs3_1-2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int temp = x;
    int sum = 0;
    int prod = 1;
    int count = 0;
    while (x > 0) {
      int r = x%10;
      sum = sum + r;
      prod = prod * r;
      x = x / 10;
      count++;
    }
    int ans = sum + prod;
    try {
      if (temp == ans && count == 2) {
        System.out.println("Special Number");
      }
      else {
        throw new CustomException("Not a special number");
      }
    }
    catch(CustomException e) {
      System.out.println(e);
    }
  }
}
