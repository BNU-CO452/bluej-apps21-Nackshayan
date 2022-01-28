
/**
 * This class will call the main method, that runs the application.
 *
 * @author Nackshayan
 * @version 18/10/2021
 */
public class Program {
   private static StockApp app;

   public static void main(String[] args) {
      app = new StockApp();
      app.run();
   }
}
