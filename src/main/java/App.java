
import java.io.Console;

public class App {
  public static void main(String[] args ) {
    Console myConsole = System.console();

Event packageOne = new Event(100, "Mexican", "Tequila Shots and Margaritas", "Mariachi Los Tres Potros");
Event packageTwo = new Event(150, "Indian", "Dirty Chai Martini and Whiskey", "Dj Prashant");
Event packageThree = new Event(200, "American", "Beers and Jello Shots", "Britney Spears");

Event[] allPackages = {packageOne, packageTwo, packageThree};



System.out.println("What event package would you like?");

System.out.println("Events Provided by Krishna Events:");

for( Event userChoiceOfPackage : allPackages) {
  System.out.println("_________________________");
  System.out.println(userChoiceOfPackage.mGuests );
  System.out.println(userChoiceOfPackage.mFood );
  System.out.println(userChoiceOfPackage.mDrinks );
  System.out.println(userChoiceOfPackage.mEntertainment );

}

String stringUserChoice = myConsole.readLine();
System.out.println("The total cost of your event will be : ");



}

}
  
