
 
//rewriting code
//cannot excute final cost
public class Event {  //blueprint Event

  private Integer mGuests;
  private Integer mFood;
  private Integer mDrinks;
  private Integer mEntertainment;
  private Integer mFoodCost;
  private Integer mDrinksCost;
  private Integer mTotalEventCost;


public Event( Integer guests, Integer food, Integer drinks, Integer entertainment){

  mGuests = guests;
  mFood = food;
  mDrinks = drinks;
  mEntertainment = entertainment;

 }

  public Integer getGuests() {
    return mGuests;
  }

  public Integer getFood() {
    return mFood;
  }

  public Integer getDrinks() {
    return mDrinks;
  }

  public Integer getEntertainment() {
    return mEntertainment;
  }

  public Integer getFoodCost() {
    mFoodCost = mGuests*mFood;
    return mFoodCost;
}
public Integer getDrinksCost() {
   mDrinksCost = mGuests*mDrinks;
   return mDrinksCost;
}

  public Integer getTotalEventCost() {
    mTotalEventCost = (mGuests*mFood) + (mGuests*mDrinks) + mEntertainment;
    return mTotalEventCost;
 }

}
