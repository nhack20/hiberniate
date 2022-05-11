package hiber_select;
import entity.UserDataEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


import java.util.List;
public class SelectfromDB {
    public static void main(String[] args) {

        Session session;
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(UserDataEntity.class).buildSessionFactory()) {
            //Затем от данного объекта необходимо создать сессию,
            //где Session - обертка вокруг подключения к базе с помошью JDBC
            session = factory.openSession();
            session.beginTransaction();

        }
        List<UserDataEntity> users = session.createQuery("from UserDataEntity where id = 2019 OR username='username1'").getResultList();
        for (UserDataEntity e : users) {
            System.out.println(e);
        }

        session.getTransaction().commit();
    }
}

