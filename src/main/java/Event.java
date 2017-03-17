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
  private int mPackagePercentDiscount;
  private int mFlatDiscount;
  private double mEventPrice;

  public Event(int numberOfAttendees, String levelOfFoodService, String levelOfDrinkService, boolean cake, String levelOfEntertainment, String couponCode) {
    mNumberOfAttendees = numberOfAttendees;
    mLevelOfFoodService = levelOfFoodService;
    determineFoodServiceUnitCost();
    mLevelOfDrinkService = levelOfDrinkService;
    determineDrinkServiceUnitCost();
    mCake = cake;
    determineCakeUnitCost();
    mLevelOfEntertainment = levelOfEntertainment;
    determineEntertainmentCost();
    mCouponCode = couponCode;
    determineApplicableDiscount();
  }

  private void determineFoodServiceUnitCost() {
    if (mLevelOfFoodService.equals("snacks")) {
      mFoodServiceUnitCost = 4;
    } else if (mLevelOfFoodService.equals("three course")) {
      mFoodServiceUnitCost = 10;
    } else if (mLevelOfFoodService.equals("five course")) {
      mFoodServiceUnitCost = 20;
    } else if (mLevelOfFoodService.equals("seven course")) {
      mFoodServiceUnitCost = 30;
    }
  }

  private void determineDrinkServiceUnitCost() {
    if (mLevelOfDrinkService.equals("open bar")) {
      mDrinkServiceUnitCost = 5;
    } else if (mLevelOfDrinkService.equals("cash bar")) {
      mDrinkServiceUnitCost = 1;
    }
  }

  private void determineCakeUnitCost() {
    if (mCake) {
      mCakeUnitCost = 3;
    }
  }

  private void determineEntertainmentCost() {
    if (mLevelOfEntertainment.equals("karaoke")) {
      mEntertainmentCost = 50;
    } else if (mLevelOfEntertainment.equals("band")) {
      mEntertainmentCost = 1000;
    } else if (mLevelOfEntertainment.equals("DJ")) {
      mEntertainmentCost = 300;
    } else {
      mEntertainmentCost = 0;
    }
  }

  private void determineApplicableDiscount() {
    if (mCouponCode.equals("10PercentServiceDiscount")) {
      mServicePercentDiscount = 10;
    } else if (mCouponCode.equals("10PercentPackageDiscount")) {
      mPackagePercentDiscount = 10;
    } else if (mCouponCode.equals("50DollarsOff")) {
      mFlatDiscount = 50;
    }
  }

  public int getNumberOfAttendees() {
    return mNumberOfAttendees;
  }

  public String getLevelOfFoodService() {
    return mLevelOfFoodService;
  }

  public int getFoodServiceUnitCost() {
    return mFoodServiceUnitCost;
  }

  public String getLevelOfDrinkService() {
    return mLevelOfDrinkService;
  }

  public int getDrinkServiceUnitCost() {
    return mDrinkServiceUnitCost;
  }

  public boolean getCake() {
    return mCake;
  }

  public int getCakeUnitCost() {
    return mCakeUnitCost;
  }

  public String getLevelOfEntertainment() {
    return mLevelOfEntertainment;
  }

  public int getEntertainmentCost() {
    return mEntertainmentCost;
  }

  public String getCouponCode() {
    return mCouponCode;
  }

  public int getServicePercentDiscount() {
    return mServicePercentDiscount;
  }

  public int getPackagePercentDiscount() {
    return mPackagePercentDiscount;
  }

  public int getFlatDiscount() {
    return mFlatDiscount;
  }

  public double getEventPrice() {
    calculateEventPrice();
    return mEventPrice;
  }

  public void calculateEventPrice() {
    mEventPrice = ((((double) mNumberOfAttendees * (mFoodServiceUnitCost + mDrinkServiceUnitCost + mCakeUnitCost) * (100 - mServicePercentDiscount)/100 + (double) mEntertainmentCost) * (100 - mPackagePercentDiscount)/100) - mFlatDiscount);
  }

}
