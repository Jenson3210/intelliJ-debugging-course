import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;
import java.util.Arrays;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      List<User> users = Arrays.asList(new User1("No ToString()"), new User2("Custom method"), new User3("Value Object"));
      System.out.println("Users: " + users);
   }
}

interface User {
   String getName();
}

@AllArgsConstructor
@Getter
class User1 implements User{
   String name;
}

@AllArgsConstructor
@Getter
class User2 implements User {
   String name;

   @Override
   public String toString() {
      return name;
   }
}

@Value
class User3 implements User {
   String name;
}
