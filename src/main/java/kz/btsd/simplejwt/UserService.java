package kz.btsd.simplejwt;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    public User findByUsername(String username) {
        return new User("", "", true, true, true, true,
                new ArrayList<>());
    }
}
