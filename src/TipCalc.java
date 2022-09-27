import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalc {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");


        //Declaring variables
        int people; // number of people in the party
        double itemCost = 0;
        double totalCost = 0; // Total cost without tip
        double tipPercent;
        double totalTip;
        String totalTipRound;
        double totalTipCost; // Total cost including tip
        String totalTipCostRound;
        double perCost; //Total cost per person without tip
        String perCostRound;
        double perTipCost; //Total cost per person including tip
        String perTipCostRound;
        double perTip; //total tip per person
        String perTipRound;

        //Greeting + # of people + tip percentage
        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("How many people are in your group? ");
        people = scan.nextInt();
        System.out.print("What's the tip percentage? ");
        tipPercent = scan.nextDouble();

        //Total cost
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end) ");
        totalCost += scan.nextDouble();
        while (itemCost != -1){
            System.out.print("Enter a cost in dollars and cents (-1 to end) ");
            itemCost = scan.nextDouble();
            if (itemCost > 0.0) {
                totalCost += itemCost;
            }
        }

        //Calculations
        tipPercent /= 100; //Turning tip percentage into a decimal
        totalTip = totalCost * tipPercent;
        totalTipRound = formatter.format(totalTip);

        totalTipCost = totalCost + totalTip;
        totalTipCostRound = formatter.format(totalTipCost);

        perCost = totalCost / people;
        perCostRound = formatter.format(perCost);

        perTipCost = totalTipCost / people;
        perTipCostRound = formatter.format(perTipCost);

        perTip = totalTip / people;
        perTipRound = formatter.format(perTip);


        //Printing
        System.out.println("**************************");
        System.out.println("Total Bill Before Tip: $" + totalCost);
        System.out.println("Tip Percentage: " + (tipPercent *= 100) + "%");
        System.out.println("Total Tip : $" + totalTipRound);
        System.out.println("Total Bill With Tip: $" + totalTipCostRound);
        System.out.println("Per Person Cost Before Tip: $" + perCostRound);
        System.out.println("Tip Per Person: $" + perTipRound);
        System.out.println("Total cost Per Person: $" + perTipCostRound);




    }
}
