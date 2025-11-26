public class Shapes {
    public static void main(String[] args) {
        Turtle jed = new Turtle(-250.0, 50.0);
        jed.speed(10);
        // Task 1: Draw a regular shape
        for(int x = 0; x < 5; x++){
            jed.forward(100.0);
            jed.left(72);
        }

        // Task 2: Draw a regular shape many times
         for(int y = 0; y < 10; y ++){
            for(int x = 0; x < 5; x++){
               jed.forward(100.0);
               jed.left(72);
            }
         jed.left(36);
         }

        // Task 3: How many times does Turtle turn!
          jed.up();
          jed.forward(325.0);
          jed.down();
          int total = 0;
          for(int y = 0; y < 10; y ++){
            for(int x = 0; x < 5; x++){
               jed.forward(100.0);
               jed.left(72);
               total ++;
            }
         jed.left(36);
         total ++;
         }
         System.out.print("jed has turned " + total + " times!");


        // Extension 1:
         jed.up();
         jed.forward(325.0);
         jed.down();
         int numSpokes = 32;
         for(int y = 0; y < numSpokes; y ++){
            for(int x = 0; x < 5; x++){
               jed.forward(100.0);
               jed.left(72);
            }
         jed.left(360 / numSpokes);
         }
        // Extension 2: Random errithing
        jed.up();
        jed.setPosition(0.0, 300);
        jed.down();
        int randomShape = (int)(Math.random() * 12);
        int randomNumSpoke = (int)(Math.random() * 64);
        int randomSize = (int)(Math.random() * 150);
        for(int y = 0; y < randomNumSpoke; y ++){
            for(int x = 0; x < randomShape; x++){
               jed.forward(randomSize);
               jed.left(360 / randomShape);
            }
         jed.left(360 / randomNumSpoke);
         }
    }
}
