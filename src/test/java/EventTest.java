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

  @Test
  public void getLevelOfDrinkService_getsLevelOfDrinkService_openbar() {
    Event testEvent = new Event(100, "snacks", "open bar", true, "noise", "noise");
    assertEquals("open bar", testEvent.getLevelOfDrinkService());
  }

  @Test
  public void getCake_getsCake_true() {
    Event testEvent = new Event(100, "snacks", "open bar", true, "noise", "noise");
    assertEquals(true, testEvent.getCake());
  }

  @Test
  public void getCouponCode_getsCouponCode_freeDJ() {
    Event testEvent = new Event(100, "snacks", "open bar", true, "band", "freeDJ");
    assertEquals("freeDJ", testEvent.getCouponCode());
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

}
