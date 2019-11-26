package authenticationTemplate.utility;

import authenticationTemplate.model.User;

import java.util.ArrayList;
import java.util.Arrays;

// zawiera tylko składowe statyczne
public class InMemoryDB {
    public static ArrayList<User> tableUser = new ArrayList<>(
            Arrays.asList(
                    new User("mk@mk.pl","MMMmmm111_"),
                    new User("kk@kk.pl","MMMkkk111_"),
                    new User("mm@mm.pl","MMMlll111_")
            )
    );
}
