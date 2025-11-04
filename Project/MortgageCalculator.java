
import java.util.Scanner ;
public class MortgageCalculator {

    public static void main (String[]args) {
        System.out.println ("Mortgage Calculator") ;
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter loan ammount: ");
        int M = input.nextInt();
        System.out.println("Enter the inrest rate: ") ;
        float P = input.nextFloat();
        System.out.println("Enter the loan period time in years : ") ;
        int years = input.nextInt();
        double r = years/100/12;
        int n = years*12 ;
        double numerator = r * Math.pow (1+r, n);
        double denominator = Math.pow (1+r, n)-1;
        double M = (numerator/denominator);
        System.out.println(Total amount: + M);

    }
}