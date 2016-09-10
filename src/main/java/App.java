
//program cannot execute cost 

import java.io.Console;

public class App {
public static void main(String[] args ) {
Console myConsole = System.console();

Event event = new Event(guests, food, drinks, entertainment);
Integer foodCost = event.getFoodCost();
Integer drinksCost = event.getDrinksCost();
Integer totalEventCost = event.getTotalEventCost();


//int totalEventCost = (mGuests + (mGuests * mFood) + (mGuests * mDrinks ) + mEntertainment);

System.out.println("Welcome to Krishna Event Planning!");
System.out.println("How many guests will be attending your event? Please choose between our three options. Make sure to enter the number associated with the option: 50 guests (1) , 100 guests (2) , 200 guests (3)");
Integer guests = Integer.parseInt(myConsole.readLine());
if( guests == 1) {
  guests = 50;
} else if (guests == 2) {
  guests = 100;
} else if ( guests == 3) {
  guests = 200;
} else {
  System.out.println("Sorry, I didn't understand what you meant.Please choose of of the above options by providing the number associated with it.");
}

System.out.println("If you are interested in having your event catered by us, please choose and enter the number associated with your prefered cuisine: Mexican(1), Indian(2), or American(3).");
Integer food = Integer.parseInt(myConsole.readLine());
if( food == 1) {
  food = 20;
} else if (food == 2) {
  food = 40;
} else if ( food == 3) {
  food = 75;
} else {
  System.out.println("Sorry, I didn't understand what you meant.Please choose of of the above options by providing the number associated with it.");
}

System.out.println("Would you like to include drinks in your events? Please enter the number associated with your choice: No(1), Yes, Alcoholic and Non-Alcoholic(2), Yes, only Non-Alcoholic(3).");
Integer drinks = Integer.parseInt(myConsole.readLine());
if( drinks == 1) {
  drinks = 0;
} else if (drinks == 2) {
  drinks = 35;
} else if ( drinks == 3) {
  drinks = 10;
} else {
  System.out.println("Sorry, I didn't understand what you meant.Please choose of of the above options by providing the number associated with it.");
}

System.out.println("Our company offers the option of having live entertainment. Please enter the number associated with your choice: No entertainment(1), Rock Band(2), Dj services(3), Professional Singer with dancers(4).");
Integer entertainment= Integer.parseInt(myConsole.readLine());
if( entertainment == 1) {
  entertainment = 100;
} else if (entertainment == 2) {
  entertainment = 200;
} else if ( entertainment == 3) {
  entertainment = 350;
} else if (entertainment == 2) {
  entertainment = 650;
} else {
  System.out.println("Sorry, I didn't understand what you meant.Please choose of of the above options by providing the number associated with it.");
}

System.out.println("The total cost of your desired event is:/n" + "$" +  totalEventCost);

 }
}
