class Event {
  private int mNumberOfAttendees;
  private String mLevelOfFoodService;
  private String mLevelOfDrinkService;
  private boolean mCake;
  private String mLevelOfEntertainment;
  private String mCouponCode;

  public Event(int numberOfAttendees, String levelOfFoodService, String levelOfDrinkService, boolean cake, String levelOfEntertainment, String couponCode) {
    mNumberOfAttendees = numberOfAttendees;
    mLevelOfFoodService = levelOfFoodService;
  }

  public int getNumberOfAttendees() {
    return mNumberOfAttendees;
  }

  public String getLevelOfFoodService() {
    return mLevelOfFoodService;
  }
}
