package main.java.org.example._2024_03_27;

import lombok.Getter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class HiberUtil {

    @Getter
    private final SessionFactory sessionFactory = buildSessionFactory();

    private SessionFactory buildSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        configuration.addAnnotatedClass(Author.class);
        ServiceRegistry serviceRegistry =
                new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        return configuration.buildSessionFactory(serviceRegistry);
    }

    public static void main(String[] args) {
        SessionFactory sessionFactory1 = new HiberUtil().getSessionFactory();
        Session session = sessionFactory1.openSession();

        Query<Author> query = session.createQuery("from Author", Author.class);
        List<Author> list = query.getResultList();

        for (Author author : list) {
            System.out.println("ID: " + author.getId() + " || NAME: " + author.getName());
        }
    }

}
