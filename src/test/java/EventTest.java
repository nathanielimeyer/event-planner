import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(100, "noise", "noise", true, "noise", "noise");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void getNumberOfAttendees_getsNumberOfAttendees_100() {
    Event testEvent = new Event(100, "noise", "noise", true, "noise", "noise");
    assertEquals(100, testEvent.getNumberOfAttendees());
  }

  @Test
  public void getLevelOfFoodService_getsLevelOfFoodService_snacks() {
    Event testEvent = new Event(100, "snacks", "noise", true, "noise", "noise");
    assertEquals("snacks", testEvent.getLevelOfFoodService());
  }

    @Test public void getFoodServiceUnitCost_sevenCourse_30() {
      Event testEvent = new Event(0, "seven course", "", false, "", "");
      assertEquals(30, testEvent.getFoodServiceUnitCost());
    }

    @Test public void getFoodServiceUnitCost_fiveCourse_20() {
      Event testEvent = new Event(0, "five course", "", false, "", "");
      assertEquals(20, testEvent.getFoodServiceUnitCost());
    }

    @Test public void getFoodServiceUnitCost_threeCourse_10() {
      Event testEvent = new Event(0, "three course", "", false, "", "");
      assertEquals(10, testEvent.getFoodServiceUnitCost());
    }

    @Test public void getFoodServiceUnitCost_snacks_4() {
      Event testEvent = new Event(0, "snacks", "", false, "", "");
      assertEquals(4, testEvent.getFoodServiceUnitCost());
    }

    @Test
    public void getLevelOfDrinkService_getsLevelOfDrinkService_openbar() {
      Event testEvent = new Event(100, "snacks", "open bar", true, "noise", "noise");
      assertEquals("open bar", testEvent.getLevelOfDrinkService());
    }

    @Test public void getDrinkServiceUnitCost_openBar_5() {
      Event testEvent = new Event(0, "", "open bar", false, "", "");
      assertEquals(5, testEvent.getDrinkServiceUnitCost());
    }

    @Test public void getDrinkServiceUnitCost_cashBar_1() {
      Event testEvent = new Event(0, "", "cash bar", false, "", "");
      assertEquals(1, testEvent.getDrinkServiceUnitCost());
    }

    @Test
    public void getCake_getsCake_true() {
      Event testEvent = new Event(100, "snacks", "open bar", true, "noise", "noise");
      assertEquals(true, testEvent.getCake());
    }

    @Test
    public void getCakeUnitCost_cakeTrue_3() {
      Event testEvent = new Event(0, "", "", true, "", "");
      assertEquals(3, testEvent.getCakeUnitCost());
    }

    @Test
    public void getCakeUnitCost_cakeFalse_0() {
      Event testEvent = new Event(0, "", "", false, "", "");
      assertEquals(0, testEvent.getCakeUnitCost());
    }

    @Test
    public void getLevelOfEntertainment_band_band() {
      Event testEvent = new Event(0, "", "", false, "band", "");
      assertEquals("band", testEvent.getLevelOfEntertainment());
    }

    @Test
    public void getEntertainmentCost_band_1000() {
      Event testEvent = new Event(0, "", "", false, "band", "");
      assertEquals(1000, testEvent.getEntertainmentCost());
    }

    @Test
    public void getCouponCode_getsCouponCode_freeDJ() {
      Event testEvent = new Event(100, "snacks", "open bar", true, "band", "freeDJ");
      assertEquals("freeDJ", testEvent.getCouponCode());
    }

    @Test
    public void getServicePercentDiscount_10PercentServiceDiscount_10() {
      Event testEvent = new Event(0, "", "", false, "", "10PercentServiceDiscount");
      assertEquals(10, testEvent.getServicePercentDiscount());
      assertEquals(0, testEvent.getPackagePercentDiscount());
      assertEquals(0, testEvent.getFlatDiscount());
    }

    @Test
    public void getPackagePercentDiscount_10PercentPackageDiscount_10() {
      Event testEvent = new Event(0, "", "", false, "", "10PercentPackageDiscount");
      assertEquals(0, testEvent.getServicePercentDiscount());
      assertEquals(10, testEvent.getPackagePercentDiscount());
      assertEquals(0, testEvent.getFlatDiscount());
    }

    @Test
    public void getFlatDiscount_50DollarsOff_50() {
      Event testEvent = new Event(0, "", "", false, "", "50DollarsOff");
      assertEquals(0, testEvent.getServicePercentDiscount());
      assertEquals(0, testEvent.getPackagePercentDiscount());
      assertEquals(50, testEvent.getFlatDiscount());
    }

  @Test
  public void calculateEventPrice_one100PeopleSnacksNoExtrasNoCoupons_400() {
    Event testEvent = new Event(100, "snacks", "", false, "", "");
    testEvent.calculateEventPrice();
    assertEquals(400, testEvent.getEventPrice(), 0);
  }

  @Test
  public void calculateEventPrice_one100PeopleThreeCourseNoExtrasNoCoupons_1000() {
    Event testEvent = new Event(100, "three course", "", false, "", "");
    testEvent.calculateEventPrice();
    assertEquals(1000, testEvent.getEventPrice(), 0);
  }

  @Test
  public void calculateEventPrice_one100PeopleFiveCourseNoExtrasNoCoupons_2000() {
    Event testEvent = new Event(100, "five course", "", false, "", "");
    testEvent.calculateEventPrice();
    assertEquals(2000, testEvent.getEventPrice(), 0);
  }

  @Test
  public void calculateEventPrice_one100PeopleSevenCourseNoExtrasNoCoupons_3000() {
    Event testEvent = new Event(100, "seven course", "", false, "", "");
    testEvent.calculateEventPrice();
    assertEquals(3000, testEvent.getEventPrice(), 0);
  }

  @Test
  public void calculateEventPrice_one100PeopleNoFoodOpenBarNoExtrasNoCoupons_500() {
    Event testEvent = new Event(100, "", "open bar", false, "", "");
    testEvent.calculateEventPrice();
    assertEquals(500, testEvent.getEventPrice(), 0);
  }

  @Test
  public void calculateEventPrice_one100PeopleNoFoodCashBarNoExtrasNoCoupons_100() {
    Event testEvent = new Event(100, "", "cash bar", false, "", "");
    testEvent.calculateEventPrice();
    assertEquals(100, testEvent.getEventPrice(), 0);
  }

  @Test
  public void calculateEventPrice_one100PeopleJustCake_300() {
    Event testEvent = new Event(100, "", "", true, "", "");
    testEvent.calculateEventPrice();
    assertEquals(300, testEvent.getEventPrice(), 0);
  }

  @Test
  public void calculateEventPrice_fiftyPeopleThreeCourseCashBarCakeNoCouponsNoEntertainment_700() {
    Event testEvent = new Event(50, "three course", "cash bar", true, "", "");
    testEvent.calculateEventPrice();
    assertEquals(700, testEvent.getEventPrice(), 0);
  }

  @Test
  public void calculateEventPrice_fiftyPeopleThreeCourseCashBarCakeNoCouponsKaraoke_750() {
    Event testEvent = new Event(50, "three course", "cash bar", true, "karaoke", "");
    testEvent.calculateEventPrice();
    assertEquals(750, testEvent.getEventPrice(), 0);
  }

  @Test
  public void calculateEventPrice_three300PeopleFiveCourseOpenBarCakeNoCouponsBand_9400() {
    Event testEvent = new Event(300, "five course", "open bar", true, "band", "");
    testEvent.calculateEventPrice();
    assertEquals(9400, testEvent.getEventPrice(), 0);
  }

  @Test
  public void calculateEventPrice_one150PeopleFiveCourseOpenBarCakeNoCouponsDJ_4500() {
    Event testEvent = new Event(150, "five course", "open bar", true, "DJ", "");
    testEvent.calculateEventPrice();
    assertEquals(4500, testEvent.getEventPrice(), 0);
  }

  @Test
  public void calculateEventPrice_three300PeopleFiveCourseOpenBarCakeBandTenPercentServiceDiscount_9400() {
    Event testEvent = new Event(300, "five course", "open bar", true, "band", "10PercentServiceDiscount");
    testEvent.calculateEventPrice();
    assertEquals(8560, testEvent.getEventPrice(), 0);
  }

  @Test
  public void calculateEventPrice_one1000PeopleSevenCourseOpenBarCakeBand10PercentPackageDiscount_35100() {
    Event testEvent = new Event(1000, "seven course", "open bar", true, "band", "10PercentPackageDiscount");
    testEvent.calculateEventPrice();
    assertEquals(35100, testEvent.getEventPrice(), 0);
  }

  @Test
  public void calculateEventPrice_one1001PeopleSevenCourseOpenBarCakeBand10PercentPackageDiscount_35134p2() {
    Event testEvent = new Event(1001, "seven course", "open bar", true, "band", "10PercentPackageDiscount");
    testEvent.calculateEventPrice();
    assertEquals(35134.2, testEvent.getEventPrice(), 0);
  }

  @Test
  public void calculateEventPrice_one100PeopleJustCake50DollarCoupon_250() {
    Event testEvent = new Event(100, "", "", true, "", "50DollarsOff");
    testEvent.calculateEventPrice();
    assertEquals(250, testEvent.getEventPrice(), 0);
  }
}
