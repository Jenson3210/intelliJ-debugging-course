public class Main {
   public static void main(String[] args) {
      int result = 0;

      result = calculateAndCheck(result);

      System.out.println("You did it!: " + result);
   }

   public static int calculateAndCheck(int a) {
      int result = a;
      // Set a breakpoint on the following line
      result = add(5, 7);

      // Step over the following line
      result = subtract(result, 3);

      // Step into the following line
      result = multiply(result, 2);

      // Set the cursor inside the if statement and run to the cursor
      if (result > 0) {
         result = divide(result, 3);
      }

      try {
         checkResult(result);
      } catch (Exception e) {
         throw new RuntimeException("Something went wrong!");
      }

      return result;
   }

   public static int add(int a, int b) {
      return a + b;
   }

   public static int subtract(int a, int b) {
      int c = a - b;
      return c;
   }

   public static int multiply(int a, int b) {
      return a * b;
   }

   public static int divide(int a, int b) {
      return a / b;
   }

   public static void checkResult(int a) {
      try {
         if (a == 6) {
            throw new RuntimeException("Root cause: result is 6");
         }
      } catch (RuntimeException e) {
         throw new IllegalArgumentException("There is an invalid result.", e);
      }
   }
}
