import java.util.Scanner;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
           int week= scanner.nextInt();
           switch (week){
               case 1:
                   System.out.println(Week.Monday);
                   break;
               case 2:
                   System.out.println(Week.Tusday);
               default:

           }
    }
}