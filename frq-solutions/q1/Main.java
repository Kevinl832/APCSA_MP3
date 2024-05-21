
public class Main {
    public static void main(String[] args) {
        System.out.println("2024 Q1");
      
        Feeder test = new Feeder();
      
        test.setFood(500);
        test.simulateOneDay(1);
        test.displayFood();
        test.setFood(1000);
        test.simulateOneDay(2);
        test.displayFood();
        test.setFood(300);
        test.simulateOneDay(3);
        test.displayFood();
        //impossible to control the chance of food being eaten so different starting food value and bird value are used to ensure it is actually working.

        test.setFood(2400);
        test.simulateManyDays(10, 10);
        test.setFood(250);
        test.simulateManyDays(10, 2);
        test.setFood(0);
        test.simulateManyDays(10, 4);
    }


}
