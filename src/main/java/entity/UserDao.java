package entity;

public interface UserDao {
    void saveUser(User user);
    saveUsers(List<User> users);
    getAllUsers();
    getUserByLogin(String login);
    User getUserById(Long userId);
    removeUserByLogin(String login);
    removeUserById(Long id);
}
