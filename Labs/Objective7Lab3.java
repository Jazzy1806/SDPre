public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    String oddEven;

    while (counter <= 20) {
      if (counter % 2 == 0) {
        oddEven = "even";
      }
      else {
        oddEven = "odd";
      }
      System.out.println(counter + " is " + oddEven);
      counter ++;
    }
  }
}
