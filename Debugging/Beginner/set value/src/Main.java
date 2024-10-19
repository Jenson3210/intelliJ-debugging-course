import lombok.AllArgsConstructor;
import lombok.NonNull;

public class Main {
   public static void main(String[] args) {
      Test test = new Test("SUCCESS");

      System.out.println(test.successMessageOrThrow());
   }
}

@AllArgsConstructor
class Test {

   @NonNull
   private String success;

   String successMessageOrThrow() {
      if ("TRUE".equalsIgnoreCase(success)) {
         return "YAAAY!!!";
      }
      throw new RuntimeException("Something went wrong!");
   }
}
