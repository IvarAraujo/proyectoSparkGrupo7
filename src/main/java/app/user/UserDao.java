package app.user;

import com.google.common.collect.*;

import myapp.user;

import java.util.*;
import java.util.stream.*;

import org.eclipse.jetty.server.Authentication.User;

public class UserDao {

    private final List<user> users = ImmutableList.of(
            //        Username    Salt for hash                    Hashed password (the password is "password" for all users)
            new user("01","perwendel", "$2a$10$h.dl5J86rGH7I8bD9bZeZe", "333452","021999888"),
            new user("02","davidase","$2a$10$e0MYzXyjpJS7Pd0RVvHwHe", "333452","021999888"),
            new user("03","federico",  "$2a$10$E3DgchtVry3qlYlzJCsyxe", "333452","021999888")
    );

    public user getUserByUsername(String username) {
        return users.stream().filter(b -> b.getUsername().equals(username)).findFirst().orElse(null);
    }

    public Iterable<String> getAllUserNames() {
        return users.stream().map(User::getUsername).collect(Collectors.toList());
    }

}
