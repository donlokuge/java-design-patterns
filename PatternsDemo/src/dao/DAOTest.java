package dao;

/**
 *
 * @author ashok
 */
public class DAOTest {

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();
        
        
        User user1 = new User("DJ", 1);
        
        userDAO.addUser(user1);

    }
}
