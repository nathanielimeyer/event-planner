import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    String stringInputtedNumberOfAttendees;
    int intInputtedNumberOfAttendees;
    String inputtedLevelOfFoodService;
    String inputtedLevelOfDrinkService;
    boolean inputtedCake = false;
    String inputtedLevelOfEntertainment;
    String inputtedCouponCode = "";

    System.out.println("I'm an event price quote calculator. After we fill out a six point questionnaire I'll provide a price quote for your event.");

    System.out.println("First, how many people are you inviting to your event?");
    stringInputtedNumberOfAttendees = myConsole.readLine();
    intInputtedNumberOfAttendees = Integer.parseInt(stringInputtedNumberOfAttendees);
    while (intInputtedNumberOfAttendees < 1) {
      System.out.println("I'm sorry, how many people are you inviting to your event? I need a positive whole number.");
      stringInputtedNumberOfAttendees = myConsole.readLine();
      intInputtedNumberOfAttendees = Integer.parseInt(stringInputtedNumberOfAttendees);
    }

    System.out.println("What food would you like to serve? Please choose one of the following options: 'snacks', 'three course', 'five course', 'seven course'.");
    inputtedLevelOfFoodService = myConsole.readLine();
    while (!inputtedLevelOfFoodService.equals("snacks") && !inputtedLevelOfFoodService.equals("three course") && !inputtedLevelOfFoodService.equals("five course") && !inputtedLevelOfFoodService.equals("seven course")) {
      System.out.println("I need you to enter one of these options exactly: 'snacks', 'three course', 'five course', 'seven course'.");
      inputtedLevelOfFoodService = myConsole.readLine();
    }

    System.out.println("Would you like to have an 'open bar' or a 'cash bar'?");
    inputtedLevelOfDrinkService = myConsole.readLine();
    while (!inputtedLevelOfDrinkService.equals("open bar") && !inputtedLevelOfFoodService.equals("cash bar")) {
      System.out.println("I need you to enter one of these options exactly: 'open bar', 'cash bar'.");
      inputtedLevelOfDrinkService = myConsole.readLine();
    }

    System.out.println("Would you like to have cake?");
    String stringInputtedCake = myConsole.readLine();
    if (stringInputtedCake.equals("yes") || stringInputtedCake.equals("Yes") || stringInputtedCake.equals("true")) {
      inputtedCake = true;
    }

    System.out.println("What kind of entertainment would you like to provide? Please select from these choices: 'band', 'DJ', 'karaoke', 'none'.");
    inputtedLevelOfEntertainment = myConsole.readLine();
    while (!inputtedLevelOfEntertainment.equals("band") && !inputtedLevelOfEntertainment.equals("DJ") && !inputtedLevelOfEntertainment.equals("karaoke") && !inputtedLevelOfEntertainment.equals("none")) {
      System.out.println("I only understand these options: 'band', 'DJ', 'karaoke', 'none'.");
      inputtedLevelOfEntertainment = myConsole.readLine();
    }

    System.out.println("If you have a coupon code enter it here. (Hint: 10PercentServiceDiscount, 10PercentPackageDiscount, 50DollarsOff)");
    inputtedCouponCode = myConsole.readLine();

    Event myEvent = new Event(intInputtedNumberOfAttendees, inputtedLevelOfFoodService, inputtedLevelOfDrinkService, inputtedCake, inputtedLevelOfEntertainment, inputtedCouponCode);

    System.out.println(intInputtedNumberOfAttendees);
    System.out.println(inputtedLevelOfFoodService);
    System.out.println(inputtedLevelOfDrinkService);
    System.out.println(inputtedCake);
    System.out.println(inputtedLevelOfEntertainment);
    System.out.println(inputtedCouponCode);

    System.out.println(String.format("You indicated that you plan to invite %d guests, serve them %s at $%d a head, provide a %s at $%d a head, and entertain your guests with %s for $%d. Your event will cost $%f.", myEvent.getNumberOfAttendees(), myEvent.getLevelOfFoodService(), myEvent.getFoodServiceUnitCost(), myEvent.getLevelOfDrinkService(), myEvent.getDrinkServiceUnitCost(), myEvent.getLevelOfEntertainment(), myEvent.getEntertainmentCost(), myEvent.getEventPrice()));

  }
}
