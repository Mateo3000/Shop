package service;

import entity.User;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class UserServiceTest {

    @Test
    public void testGetAllUsers() {
        //is
        List<User> users = new ArrayList<User>();
        users.add(new User(1l, "admin", "admin"));
        users.add(new User(2l, "pablo", "admin"));
        //then
        UserServiceImpl userService = new UserServiceImpl(users);
        List<User> usersFromTestClass = userService.getAllUsers();
        //expected
        Assert.assertEquals(users, usersFromTestClass);
    }
}
