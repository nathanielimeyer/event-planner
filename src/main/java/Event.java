class Event {
  private int mNumberOfAttendees;
  private String mLevelOfFoodService;
  private int mFoodServiceUnitCost;
  private String mLevelOfDrinkService;
  private int mDrinkServiceUnitCost;
  private boolean mCake;
  private int mCakeUnitCost;
  private String mLevelOfEntertainment;
  private int mEntertainmentCost;
  private String mCouponCode;
  private int mServicePercentDiscount;
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
    if (mLevelOfDrinkService.equals("open bar")) {
      mDrinkServiceUnitCost = 5;
    }
    else if (mLevelOfDrinkService.equals("cash bar")) {
      mDrinkServiceUnitCost = 1;
    }
    mCake = cake;
    if (mCake) {
      mCakeUnitCost = 3;
    }
    mLevelOfEntertainment = levelOfEntertainment;
    if (mLevelOfEntertainment.equals("karaoke")) {
      mEntertainmentCost = 50;
    } else if (mLevelOfEntertainment.equals("band")) {
      mEntertainmentCost = 1000;
    } else if (mLevelOfEntertainment.equals("DJ")) {
      mEntertainmentCost = 300;
    }
    mCouponCode = couponCode;
    if (mCouponCode.equals("10PercentServiceDiscount")) {
      mServicePercentDiscount = 10;
    }
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
    mEventPrice = (mNumberOfAttendees * (mFoodServiceUnitCost + mDrinkServiceUnitCost + mCakeUnitCost) * (100 - mServicePercentDiscount)/100 + mEntertainmentCost);
  }

}
