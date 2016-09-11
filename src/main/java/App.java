package main;

import java.util.Scanner;

public class App {
public static void main(String[] args ) {
Scanner aScanner = new Scanner(System.in);

//take user input for guests
System.out.println("Welcome to Krishna Event Planning!");
System.out.println("How many guests will be attending your event?");
int guests = Integer.parseInt(aScanner.nextLine());

int userInput;
int food = 0;
int mexicanFood = 20;
int indianFood = 40;
int americanFood = 75;
//take user input for the food
do{
System.out.println("If you are interested in having your event catered by us, please choose and enter the number associated with your prefered cuisine: Mexican(1), Indian(2), or American(3).");
 userInput = Integer.parseInt(aScanner.nextLine());

switch (userInput){
case 1:   
  food = mexicanFood;
  break;
case 2: 	
 food = indianFood;
 break;
case 3:
  food = americanFood;
  break;
default:
  System.out.println("This is not a valid input.");
  break;
}
}while(userInput<1 || userInput>3); //runs if user input is invalid, breaks once user input is valid

int drinksCost = 0;
int userInputDrinks;
//take user input for drinks
do{
System.out.println("Would you like to include drinks in your events? Please enter the number associated with your choice: No(1), Yes, Alcoholic and Non-Alcoholic(2), Yes, only Non-Alcoholic(3).");
 userInputDrinks = Integer.parseInt(aScanner.nextLine());
switch (userInputDrinks){
case 1:
  drinksCost = 0;
  break;
case 2:
  drinksCost = 35;
  break;
case 3:
  drinksCost = 10;
  break;
default:
 System.out.print("This is not a valid input.Please try again");
 break;
}
}while(userInputDrinks <1 || userInputDrinks>3); ////runs if user input is invalid, breaks once user input is valid

int entertainmentCost = 0;
int userInputEntertainment;

//take user input for entertainment
do{
System.out.println("Our company offers the option of having live entertainment. Please enter the number associated with your choice: No entertainment(1), Rock Band(2), Dj services(3), Professional Singer with dancers(4).");
 userInputEntertainment= Integer.parseInt(aScanner.nextLine());
switch (userInputEntertainment){
case 1:
 entertainmentCost = 100;
 break;
case 2:
  entertainmentCost = 200;
  break;
case 3:
  entertainmentCost = 350;
  break;
  
case 4:
  entertainmentCost = 650;
  break;
default:
 System.out.print("This is not a valid input.");
 break;
}
}while(userInputEntertainment<1 || userInputEntertainment>4); //runs if user input is invalid, breaks once user input is valid

Event event = new Event(guests, food, drinksCost, entertainmentCost);
int totalEventCost = event.getTotalEventCost();

System.out.println("The total cost of your desired event is: " + "$" +  totalEventCost);

 }
}
