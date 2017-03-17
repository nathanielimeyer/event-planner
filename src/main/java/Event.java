class Event {
  private int mNumberOfAttendees;
  private String mLevelOfFoodService;
  private int mFoodServiceUnitCost;
  private String mLevelOfDrinkService;
  private int mDrinkServiceUnitCost;
  private boolean mCake;
  private String mLevelOfEntertainment;
  private String mCouponCode;
  private int mEventPrice;

  public Event(int numberOfAttendees, String levelOfFoodService, String levelOfDrinkService, boolean cake, String levelOfEntertainment, String couponCode) {
    mNumberOfAttendees = numberOfAttendees;
    mLevelOfFoodService = levelOfFoodService;
    if (mLevelOfFoodService.equals("snacks")) {
      mFoodServiceUnitCost = 4;
    } else if (mLevelOfFoodService.equals("three course")) {
      mFoodServiceUnitCost = 10;
    } else if (mLevelOfFoodService.equals("five course")) {
      mFoodServiceUnitCost = 20;
    } else if (mLevelOfFoodService.equals("seven course")) {
      mFoodServiceUnitCost = 30;
    }
    mLevelOfDrinkService = levelOfDrinkService;
    if (mLevelOfDrinkService.equals("full bar")) {
      mDrinkServiceUnitCost = 5;
    }
    else if (mLevelOfDrinkService.equals("cash bar")) {
      mDrinkServiceUnitCost = 1;
    }
    mCake = cake;
    mLevelOfEntertainment = levelOfEntertainment;
    mCouponCode = couponCode;
  }

  public int getNumberOfAttendees() {
    return mNumberOfAttendees;
  }

  public String getLevelOfFoodService() {
    return mLevelOfFoodService;
  }

  public String getLevelOfDrinkService() {
    return mLevelOfDrinkService;
  }

  public boolean getCake() {
    return mCake;
  }

  public String getLevelOfEntertainment() {
    return mLevelOfEntertainment;
  }

  public String getCouponCode() {
    return mCouponCode;
  }

  public int getEventPrice() {
    return mEventPrice;
  }

  public void calculateEventPrice() {
    mEventPrice = (mNumberOfAttendees * (mFoodServiceUnitCost + mDrinkServiceUnitCost));
  }

}
