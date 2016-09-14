public class Event {  

  private int mGuests;
  private int mFood;
  private int mDrinks;
  private int mEntertainment;
  private int mTotalEventCost;

public Event( int guests, int food, int drinks, int entertainment){
  mGuests = guests;
  mFood = food;
  mDrinks = drinks;
  mEntertainment = entertainment;

 }

 public int getGuests() {
  return mGuests;
  }

  public int getFood() {
   return mFood;
  }

  public int getDrinks() {
   return mDrinks;
  }

  public int getEntertainment() {
   return mEntertainment;
  }
  

  public int getTotalEventCost() {
   int userInput;
   int food = 0;
   int mexicanFood = 20;
   int indianFood = 40;
   int americanFood = 75;
   
   mTotalEventCost = (mGuests*mFood()) + (mGuests*mDrinks) + mEntertainment;
   return mTotalEventCost;
 }

}
