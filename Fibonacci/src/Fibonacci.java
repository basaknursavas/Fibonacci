import java.util.Scanner ;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int first = 0, second = 1, total = 0, n ;
        System.out.print("Enter the number : ");
        n = input.nextInt();
        System.out.println(first);
        
        for (int i = 1 ; i < n ; i++){
            total = first + second ;
            System.out.println(total);
            first = second;
            second = total;
        }
    }
}
