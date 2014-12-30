public class CounterView
    {
       public static void main(String[] args)
       {
          Counter tally = new Counter();
          tally.click();
          tally.click();
          int result = tally.getValue(); // Sets result to 2
          System.out.print("result: ");
          System.out.println(result);
          tally.reset(); // Resets the tally
          int finalTally = tally.getValue(); // Sets the result to 0
          System.out.print("New result: ");
          System.out.println(finalTally);
          
      }
   }
