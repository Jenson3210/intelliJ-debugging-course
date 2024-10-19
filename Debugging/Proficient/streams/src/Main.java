import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.extern.java.Log;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Log
public class Main {
    public static void main(String[] args) {
        List<String> users = keepEvenUserNames(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        if (!"Coworker: 2".equalsIgnoreCase(users.get(0))) {
           throw new RuntimeException("The first even coworker in the list should be 2");
        }
    }

    private static List<String> keepEvenUserNames(Integer... users) {
        List<String> toReturn = Arrays.stream(users)
                     .distinct()
                     .map(nr -> new User(nr, "Coworker: " + nr))
                     .filter(user -> user.getId() % 2 == 0)
                     .map(User::getName)
                     .collect(Collectors.toList());

        return toReturn;
    }
}

@Value
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
class User {
    @EqualsAndHashCode.Include
    Integer id;
    String name;

    public User(Integer id, String name) {
        this.id = id + 1;
        this.name = name;
    }
}
