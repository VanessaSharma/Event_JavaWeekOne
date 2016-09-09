public class Event {

  public int mGuests;
  public String mFood;
  public String mDrinks;
  public String mEntertainment;
  public int mCost = 0;



public Event( int guests, String food, String drinks, String entertainment){

  mGuests = guests;
  mFood = food;
  mDrinks = drinks;
  mEntertainment = entertainment;

  }
  public int guests(int numberOfGuests) {
    return mGuests;
  }

  public String food(int foodOfChoice) {
    return mFood;
  }

  public String drinks(int drinksOfChoice) {
    return mDrinks;
  }

  public String entertainment(int entertainmentOfChoice) {
    return mEntertainment;
  }

  public
