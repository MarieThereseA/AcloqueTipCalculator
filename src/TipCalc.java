import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalc {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");


        //Declaring variables
        int people; // number of people in the party
        double totalCost = 0;
        double tipPercent;
        double totalTip;
        String totalTipRounded;
        double totalTipCost; // Total cost including tip
        double perCost;
        double perTipCost; //Total cost per person including tip
        double perTip;

        //Greeting + # of people + tip percentage
        System.println("Welcome to the Tip Calculator!");
        System.print("How many people are in your group? ");
        people = scan.nextInt();
        System.print("What's the tip percentage? ");
        tipPercent = scan.nextDouble();

        //Total cost
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end)");
        totalCost =+ scan.nextDouble();
        while (totalCost != -1){
            System.out.print("Enter a cost in dollars and cents (-1 to end)");
            totalCost =+ scan.nextDouble();
        }

        //Calculations
        tipPercent /= 100;
        totalTip = totalCost * tipPercent;
        totalTipRounded = formatter.format(totalTip);
//
    }
}
