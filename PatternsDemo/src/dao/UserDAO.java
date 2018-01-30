package dao;

import java.util.List;

/**
 *
 * @author ashok
 */
interface UserDAO {

    public List<User> getUsers();

    public void addUser(User user);

    public void deleteUser(User user);

}
