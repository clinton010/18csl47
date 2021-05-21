import java.util.Scanner;
import java.util.StringTokenizer;
public class Customer {
  public static void main(String[] args) {
    String name;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Name and Date_of_Birth in the format <Name,DD/MM/YYYY>");
    name = scan.next();
    // create stringTokenizer with delimiter "/"
    StringTokenizer st = new StringTokenizer(name, ",/");
    // Print one token at a time and induce new delimiter ","
    while (st.hasMoreTokens()) {
      System.out.print(st.nextToken());
      if (st.hasMoreTokens())
        System.out.print(",");
    }
    scan.close();
  }
}
