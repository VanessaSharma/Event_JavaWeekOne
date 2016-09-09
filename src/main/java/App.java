
import java.io.Console;

public class App {
  public static void main(String[] args ) {
    Console myConsole = System.console();

Event packageOne = new Event(100, "Mexican", "Tequila Shots and Margaritas", "Mariachi Los Tres Potros");
Event packageTwo = new Event(150, "Indian", "Dirty Chai Martini and Whiskey", "Dj Prashant");
Event packageThree = new Event(200, "American", "Beers and Jello Shots", "Britney Spears");

Event[] allPackages = {"packageOne", "packageTwo", "packageThree"};

System.out.println("What event package would you like?");
String stringUserChoice = myConsole.readLine();
System.out.println("The total cost of your event will be : ");





  //  System.out.println( "How many people will attend your event? ");
    //int userGuests = Integer.parseInt(myConsole.readLine());
//
  //  System.out.println( "Do you need food to be catered for this event? ");
    //boolean userFood = myConsole.readLine();

    //System.out.println( "Do you also need drinks for this event? ");
    //boolean userDrinks = myConsole.readLine();

    //System.out.println( "Would you like live entertainment for your event?");
    //boolean userDrinks = myConsole.readLine();

    //Event customerEvent = new Event(userGuests, userFood, userDrinks, userFood, userEntertainment);

