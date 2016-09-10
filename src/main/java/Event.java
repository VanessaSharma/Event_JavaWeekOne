public class Event {

  private int mGuests;
  private int mFood;
  private int mDrinks;
  private int mEntertainment;
  private int mFoodCost;
  private int mDrinksCost;
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

  public int getFoodCost() {
     mFoodCost = mGuests*mFood;
     return mFoodCost;
}
public int getDrinksCost() {
  mDrinksCost = mGuests*mDrinks;
  return mDrinksCost;
}

  public int getTotalEventCost() {
    mTotalEventCost = (mGuests*mFood) + (mGuests*mDrinks) + mEntertainment;
    return mTotalEventCost;
 }

}
