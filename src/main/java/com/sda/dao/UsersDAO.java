package com.sda.dao;

import com.sda.db.HibernateUtils;
import com.sda.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UsersDAO {

    public void create(User user) {
        try (Session session = HibernateUtils.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
        }
    }

    public boolean deleteByUsername(String username) {
        try (Session session = HibernateUtils.openSession()) {
            Transaction transaction = session.beginTransaction();
            User user = session.find(User.class, username);
            boolean exists = user != null;
            if (exists) {
                session.remove(user);
            }
            transaction.commit();
            return exists;
        }
    }

    public List<User> findAll() {
        try (Session session = HibernateUtils.openSession()) {
            return session.createQuery("SELECT u FROM User u", User.class).list();
        }
    }

    public User findUserByUsername(String username) {
        try (Session session = HibernateUtils.openSession()) {
            return session.find(User.class, username);
        }
    }

    public void update(User updatedUser) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(updatedUser);
        transaction.commit();
        session.close();
    }

    public boolean existsByUsername(String username) {
        Session session = HibernateUtils.openSession();
        String query = "SELECT count(u) FROM User u WHERE u.username = :username";

        boolean exists = session.createQuery(query, Long.class)
                .setParameter("username", username)
                .uniqueResult() > 0;

        session.close();
        return exists;
    }
}
