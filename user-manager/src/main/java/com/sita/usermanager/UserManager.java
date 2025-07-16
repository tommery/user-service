package com.sita.usermanager;

import com.sita.domain.User;

public interface UserManager {
	User findUserById(Long id);
    User createUser(User user);
    void deleteUser(Long id);
}
