package kz.btsd.simplejwt;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    public User findByUsername(String username) {
        return new User("aibek", "$2a$12$lhmPFkhadtA28G.awvmMweMB9mLQsC7CMbgUqjr9dvsBI2eFf5cTu", true, true, true, true,
                new ArrayList<>());
    }
}
