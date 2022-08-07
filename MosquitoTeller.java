import java.util.Scanner;

public class MosquitoTeller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to MosquitoTeller!");
        System.out.println("Please answer the following questions:");
        System.out.println("1) Do you belong to the following categories of people (at least one): pregnant women, athletes, people with special chemical compounds in sweat that are attractive to mosquitoes (1/0)?");

        System.out.println();
        int q1 = scan.nextInt();

        System.out.println();
        System.out.println("2) Have you had a beer lately (1/0)?");

        System.out.println();
        int q2 = scan.nextInt();

        System.out.println();
        System.out.println("3) Are you wearing clothes in the following colors: blue, black or red (1/0)?");

        System.out.println();
        int q3 = scan.nextInt();

        System.out.println();
        System.out.println("4) Do you belong to the following categories of people (at least one): people who are often outdoors, people with low immunity to mosquito bites, people with immunodeficiency (1/0)?");

        System.out.println();
        int q4 = scan.nextInt();

        System.out.println();
        System.out.println("5) Do you emit a lot of carbon dioxide (1/0)?");

        System.out.println();
        int q5 = scan.nextInt();

        System.out.println();
        System.out.println("6) Is there a lot of light in your place of residence (1/0)?");

        System.out.println();
        int q6 = scan.nextInt();

        System.out.println();
        System.out.println("7) Is it warm in your place of stay (1/0)?");

        System.out.println();
        int q7 = scan.nextInt();

        System.out.println();
        int sum = q1 + q2 + q3 + q4 + q5 + q6 + q7;
        System.out.println("The level of mosquito danger according to MosquitoTeller: " + sum + " of 7.");

        if (sum >= 5) {
            System.out.println("We advise you to take appropriate measures to protect yourself from mosquitoes.");
        }

        System.out.println("Thanks for using it! Goodbye!");
    }
}
