public class Main
{
    public static void main(String[] args)
    {
        int springCost = 100;
        int summerCost = 200;
        int fallCost = 50;
        int winterCost = 100;
        int yearlyCost = 0;

        yearlyCost = springCost + summerCost + fallCost + winterCost + yearlyCost;

        System.out.println("For a spring cost of " + springCost + ", a summer cost of " + summerCost + ", a fall cost of " + fallCost + ", and a winter cost of " + winterCost + ", the yearly maintenance cost would be " + yearlyCost);

    }
}