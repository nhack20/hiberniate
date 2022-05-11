import entity.UserDataEntity;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {

        // сразу получаем готовый SessionFactory и сразу создаем сессию
        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.close();
//        HibernateUtil.close();

        //save new data
        session.getTransaction().begin();

        UserDataEntity user = new UserDataEntity();
        user.setEmail("asdf2@gmail.com");
        user.setUsername("makhanov2");
        user.setUserpassword("asdfasdf");
//        // id не указываем
//
        session.save(user);

        session.getTransaction().commit();
        session.close();
        HibernateUtil.close();

//        //HQL
//        Query query = session.createQuery("From User");
//        List<User> users = query.getResultList();
//
//        System.out.println(users.get(0));
//        session.close();
//        HibernateUtil.close();

    }

}