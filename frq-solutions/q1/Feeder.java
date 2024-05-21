public class Feeder
{
    /**
    * The amount of food, in grams, currently in the bird feeder; initialized in the     constructor and
    * always greater than or equal to zero
    */
    private int currentFood;
    
    /**
    * Simulates one day with numBirds birds or possibly a bear at the bird feeder,
    * as described in part (a)
    * Precondition: numBirds > 0
    */

    public Feeder() {
        currentFood = 0;
    }
    
    public void simulateOneDay(int numBirds)
    {
        //Non-essential Lines 22, 23, 27, 29, 33
        System.out.println("The starting food is " + currentFood);
        System.out.println("Simulating one day... with " + numBirds + " birds");
        boolean isGoodDay = Math.random() < 0.95;
        if(isGoodDay && currentFood > 0) {
            currentFood -= numBirds * ((int)(Math.random() * 41) + 10);
            System.out.println("There is remaining food of: " + currentFood);
            if(currentFood < 0) {
                System.out.println("There is no food left");
                currentFood = 0;
            }
        } else {
            System.out.println("There is no food");
            currentFood = 0;
        }
        System.out.println();
    }//end of simulateOneDay

    public void setFood(int value) {
        currentFood = value;
    }//end of set food

    public void displayFood() {
        System.out.println(currentFood);
    }//end of display food

    //Non-essentials line 49, 52, 57, 60
    public int simulateManyDays(int numBirds, int numDays)
    {
        System.out.println("This is a new manyDays run");
        int dayPassed = 0;
        if(currentFood == 0) {
            System.out.println("This is day 0: No food left \n break");
            return 0;
        }
        for(int i = 0; i < numDays; i++) {
            dayPassed++;
            System.out.println("This is day: " + dayPassed + "\n");
            simulateOneDay(numBirds);
            if(currentFood == 0) {
                System.out.println("No food left \n break");
                return dayPassed;
            }
        }
        System.out.println();
        return dayPassed;
    }
}//end of class
