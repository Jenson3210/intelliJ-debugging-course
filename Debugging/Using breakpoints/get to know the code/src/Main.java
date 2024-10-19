import lombok.Data;
import lombok.NonNull;

public class Main {
   public static void main(String[] args) {
      Test test = new Test("SUCCESS");

      System.out.println(test.successMessageOrThrow());
   }
}

@Data
class Test {

   @NonNull String success;

   String successMessageOrThrow() {
      if ("TRUE".equalsIgnoreCase(success)) {
         return "YAAAY!!!";
      }
      throw new RuntimeException("Something went wrong!");
   }
}
