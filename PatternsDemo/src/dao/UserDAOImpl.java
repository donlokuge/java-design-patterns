package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ashok
 */
public class UserDAOImpl implements UserDAO {

    private final List<User> users;

    public UserDAOImpl() {
        users = new ArrayList();
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void deleteUser(User user) {
        for (Iterator<User> iterator = users.iterator(); iterator.hasNext();) {
            User next = iterator.next();
            if(next.getId() == user.getId()){
                iterator.remove();
            }
        }
    }

}
