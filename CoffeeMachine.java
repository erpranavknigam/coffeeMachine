package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int cups = 9;
        int money = 550;
        boolean boolValue = true;
        Scanner scanner = new Scanner(System.in);
        while (boolValue) {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String tempAction = scanner.next();
        String action = tempAction.toLowerCase();
        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu");
                String typeOfCoffee = scanner.next();
                switch (typeOfCoffee) {
                    case "1":
                        if (water >= 250 && coffeeBeans >= 16 && cups >= 1 ) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water = water - 250;
                            coffeeBeans = coffeeBeans - 16;
                            cups = cups - 1;
                            money = money + 4;
                        } else if (water < 250) {
                            System.out.println("Sorry, not enough water!");
                        } else if (coffeeBeans < 16) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (cups < 1) {
                            System.out.println("Sorry, not enough cups!");
                        }
                        
                        break;
                    case "2":
                        if (water >= 350 && coffeeBeans >= 20 && cups >= 1 && milk >= 75 ) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water = water - 350;
                            milk = milk - 75;
                            coffeeBeans = coffeeBeans - 20;
                            cups = cups - 1;
                            money = money + 7;
                        } else if (water < 350) {
                            System.out.println("Sorry, not enough water!");
                        } else if (milk < 75) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (coffeeBeans < 20) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (cups < 1) {
                            System.out.println("Sorry, not enough cups!");
                        }
                        break;
                    case "3":
                        if (water >= 200 && coffeeBeans >= 12 && cups >= 1 && milk >= 100 ) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water = water - 200;
                            milk = milk - 100;
                            coffeeBeans = coffeeBeans - 12;
                            cups = cups - 1;
                            money = money + 6;
                        } else if (water < 200) {
                            System.out.println("Sorry, not enough water!");
                        } else if (milk < 100) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (coffeeBeans < 12) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (cups < 1) {
                            System.out.println("Sorry, not enough cups!");
                        }
                        break;
                    case "back":
                        continue;
                    default:
                        System.out.println("Invalid Entry");
                }
                break;
            case "fill" :
                System.out.println("Write how many ml of water do you want to add:");
                int amountOfWater = scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                int amountOfMilk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                int amountOfCoffee = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int numberOfCups = scanner.nextInt();
                water = water + amountOfWater;
                milk = milk + amountOfMilk;
                coffeeBeans = coffeeBeans + amountOfCoffee;
                cups = cups + numberOfCups;
                break;
            case "take":
                System.out.println("I gave you $" + money);
                money = 0;
                break;
            case "remaining":
                System.out.println("The coffee machine has: ");
                System.out.println(water + " of water");
                System.out.println(milk + " of milk");
                System.out.println(coffeeBeans + " of coffee beans");
                System.out.println(cups + " of disposable cups");
                System.out.println(money + " of money");
                break;
            case "exit":
                boolValue = false;
                break;
            default:
                System.out.println("Invalid Input");
        }
        }
    }
}
