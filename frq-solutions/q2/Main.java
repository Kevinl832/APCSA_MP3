public class Main {
  public static void main(String[] args) {
    System.out.println("2024 Question 2!");

    String info;
    Scoreboard game = new Scoreboard("Red", "Blue");
    info = game.getScore(); 
    System.out.println("Return 1: " + info);
    game.recordPlay(1); 
    info = game.getScore(); 
    System.out.println("Return 2: " + info);
    
    game.recordPlay(0); 
    info = game.getScore(); 
    System.out.println("Return 3: " + info);
    info = game.getScore(); 
    System.out.println("Return 4: " + info);
    game.recordPlay(3); 
    info = game.getScore(); 
    System.out.println("Return 5: " + info);
    
    game.recordPlay(1);
    game.recordPlay(0);
    info = game.getScore();
    System.out.println("Return 6: " + info);
    
    game.recordPlay(0); 
    game.recordPlay(4); 
    game.recordPlay(0); 
    info = game.getScore();
    System.out.println("Return 7: " + info);
    
    Scoreboard match =new Scoreboard("Lions", "Tigers");
    info = match.getScore();
    System.out.println("Return 8: " + info);
    info = game.getScore(); 
    System.out.println("Return 9: " + info);
  }
}
