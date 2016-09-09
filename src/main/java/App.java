
import java.io.Console;

public class App {
public static void main(String[] args ) {
Console myConsole = System.console();

System.out.println("Welcome to Krishna Event Planning!");
System.out.println("How many guests will be attending your event?");
Int numberOfGuests = Integer.parseInt(myConsole.readline());

System.out.println("If you are interested in having your event catered by us, please choose and enter the number associated with your prefered cuisine: Mexican(1), Indian(2), or American(3).");
Int foodOfChoice = Integer.parseInt(myConsole.readline());

System.out.println("Would you like to include drinks in your events? Please enter the number associated with your choice: No(0), Yes, Alcoholic and Non-Alcoholic(4), Yes, only Non-Alcoholic(1).");
Int drinksOfChoice = Integer.parseInt(myConsole.readline());

System.out.println("Our company offers the option of having live entertainment. Please enter the number associated with your choice: No entertainment(0), Rock Band(1), Dj services(2), Professional Singer with dancers(5).");
Int entertainmentOfChoice = Integer.parseInt(myConsole.readline());

  }
}
