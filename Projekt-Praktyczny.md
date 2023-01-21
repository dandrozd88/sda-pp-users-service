# <h1 align="center">Projekt Praktyczny</h1>

<hr style="height: 4px; background: #885188"/>

## Task 1

> Stwórz nowy projekt Maven'owy w Intellij IDEA.<br>
> Dadaj dwa pakiety pod folderem głównym `src/main/java` ==> `com` ==> `sda`.

---

## Task 2

> Stwórz nowe repozytorium na **GitHub** `sda-pp-<imie os1>-<imie os2>`.

<details> 
<summary>Creating Project Example</summary>

![Create-Project-Example](assets/Create-Project-Example.png)

</details>

> Otwórz terminal, przejdź do folderu głównego projektu i wykonaj następujące kroki:

<div style="border: 1px solid #a47e02; padding: 0 10px; border-radius: 3px;">

```bash
# Zainicjuj repo lokalnie.
git init

# Dodaj `remote` o nazwie `origin` wskazujący na URL utworzonego repo zdalnego.
git remote add origin https://github.com/szjozi/sda-pp-<imie os1>-<imie os2>

# Dodaj plik README.md
echo "# sda-pp-<imie os1>-<imie os2>" >> README.md

# Dodaj plik do gita.
git add README.md

# Commit - Zatwierdź zmiany.
git commit -m "README.md added"

# Push - Wypchnij zmianę do repo zdalnego.
git push -u origin master
```

</div>
<br>
<details> 
<summary>First Commit Example</summary>

![First-Commit-Example](assets/First-Commit-Example.png)
</details>
<br>
<details> 
<summary>Github Screen Shot</summary>

![Github-Page-1](assets/Github-Page-1.png)
</details>

---

## Task 3

> Odbij się z branch'a `master` na nowy dedykowany branch dla tego taska.
<div style="border: 1px solid #a47e02; padding: 0 10px; border-radius: 3px;">

```bash
# Utworzenie nowego branch'a z branch'a na którym się obecnie znajdujemy i `checkout` na ten branch.
# <twój identyfikator> powinny mieć format pierwsza litera/litery imienia, podłoga, nazwisko => `j_kowalski`
git checkout -b <twój identyfikator>/feature/Task_3
```

</div>

> Dodaj plik `.gitignore` - [Generator](https://www.toptal.com/developers/gitignore) <br>
> Wygeneruj plik dla `Maven` oraz `Intellij`, skopiuj wygenerowany plik i usuń z niego niepotrzebne wartości.

<div style="border: 1px solid rgba(80,164,2,0.7);padding: 0 10px; border-radius: 3px;">

```bash
# Dodaj utworzony plik do Git'a
git add .gitignore

# Commit 
git commit -m ".gitignore added"

# Push - <branch_name> == <twój identyfikator>/feature/Task_3
git push -u origin <branch_name>  
```

</div>

> Wchodzimy na Github i tworzymy Pull Request (PR)  do branch'a `master` - klikamy `Compare & pull request`.
> Dodajemy kolegę jako `reviewer` (osobę sprawdzającą).

---

## Task 4

<div style="border: 1px solid #a47e02; padding: 0 10px; border-radius: 3px;">

```bash
git checkout -b <twój identyfikator>/feature/Task_4
```

</div>

> Zmodyfikuj plik `README.md` [Markdown Cheat Sheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet) <br>
> Dodaj tytuł projektu `SDA Projekt Praktyczny`, krótki opis oraz listę użytych technologi (Maven, Hibernate, MySQL, Lombok, Java 17, Logback).

<div style="border: 1px solid rgba(80,164,2,0.7);padding: 0 10px; border-radius: 3px;">

```bash
git add README.md

git commit -m "README.md changed"

git push -u origin <twój identyfikator>/feature/Task_4  
```

</div>
<br>
<details> 
<summary>Task-4 Commit Example</summary>

![Task-4-Commit.png](assets/Task-4-Commit.png)
</details>
<br>
<details> 
<summary>Github Screen Shot</summary>

![Github-Page-3.png](assets/Github-Page-3.png)
</details>

> Wchodzimy na Github i tworzymy Pull Request (PR) do branch'a `master`.
> Dodajemy kolegę jako `reviewer` (osobę sprawdzającą).

<details> 
<summary>Create Pull Request Screen Shot</summary>

![PR-1.png](assets/PR-1.png)
</details>

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

> Po wykonaniu zadań wchodzimy na Github i sprawdzamy PR kolegi/koleżanki.<br>
> Komentujemy, sugerujemy zmiany lub jeśli wszystko jest ok dajemy `Approve`.<br>
> Kolega/Koleżanki merguje swoje zmiany do branch'a master (klikamy przycisk `Merge pull request`).

<details> 
<summary>Pull Request Screen Shots</summary>

![PR-2.png](assets/PR-2.png)
![PR-3.png](assets/PR-3.png)
![PR-4.png](assets/PR-4.png)
![Github-Page-After-Merge.png](assets/Github-Page-After-Merge.png)

</details>

---

## Task 5

<div style="border: 1px solid #a47e02; padding: 0 10px; border-radius: 3px;">

```bash
# Zaciąga i synchronizuje dane o comitach branchach itd ze zdalnego repo, bez mergowania go z lokalnym.  
git fetch

# Przeniesienie na branch `master`
git checkout master

# Zaciągniecie zmian z `remote` repo i `merge` z lokalnym branch'em. 
git pull

# Utworzenie nowego branch'a z branch'a na którym się obecnie znajdujemy i `checkout` na ten branch.
git checkout -b <twój identyfikator>/feature/Task_5
```

</div>

> Dodaj zależność do biblioteki `Hibernate` - [Maven Repository](https://mvnrepository.com/artifact/org.hibernate.orm/hibernate-core).

````xml

<dependency>
    <groupId>org.hibernate.orm</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>6.1.6.Final</version>
</dependency>
````

<div style="border: 1px solid rgba(80,164,2,0.7);padding: 0 10px; border-radius: 3px;">

```bash
git add pom.xml

git commit -m "Hibernate dependency added"

git push -u origin <twój identyfikator>/feature/Task_5
```

</div>

---

## Task 6

<div style="border: 1px solid #a47e02; padding: 0 10px; border-radius: 3px;">

```bash
git fetch

git checkout master
 
git pull

git checkout -b <twój identyfikator>/feature/Task_6
```

</div>

> Dodaj zależność do biblioteki `Lombok` - [Maven Repository](https://mvnrepository.com/artifact/org.projectlombok/lombok). <br>

````xml

<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.24</version>
    <scope>provided</scope>
</dependency>
````

<div style="border: 1px solid rgba(80,164,2,0.7);padding: 0 10px; border-radius: 3px;">

```bash
git add pom.xml

git commit -m "Lombok dependency added"

git push -u origin <twój identyfikator>/feature/Task_6
```

</div>

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

> Sprawdzamy PR kolegi/koleżanki. Komentujemy, sugerujemy zmiany lub jeśli wszystko jest ok dajemy `Approve`.<br>
> Kolega/Koleżanki merguje swoje zmiany do branch'a master (klikamy przycisk `Merge pull request`).

---

## Task 7

<div style="border: 1px solid #a47e02; padding: 0 10px; border-radius: 3px;">

```bash
git checkout master
 
git pull

git checkout -b <twój identyfikator>/feature/Task_7
```

</div>

> Dodaj zależność do biblioteki `Logback` - [Maven Repository](https://mvnrepository.com/artifact/ch.qos.logback/logback-classic).

````xml

<dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.4.5</version>
    <scope>test</scope>
</dependency>
````

<div style="border: 1px solid rgba(80,164,2,0.7);padding: 0 10px; border-radius: 3px;">

```bash
git add pom.xml

git commit -m "Logback dependency added"

git push -u origin <twój identyfikator>/feature/Task_7  
```

</div>

---

## Task 8

<div style="border: 1px solid #a47e02; padding: 0 10px; border-radius: 3px;">

```bash
git checkout master
 
git pull

git checkout -b <twój identyfikator>/feature/Task_8
```

</div>

> Dodaj JDBC Driver - `MySQL Connector` - [Maven Repository](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j).

````xml

<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.0.31</version>
</dependency>
````

<div style="border: 1px solid rgba(80,164,2,0.7);padding: 0 10px; border-radius: 3px;">

```bash
git add pom.xml

git commit -m "MySQL Connector dependency added"

git push -u origin <twój identyfikator>/feature/Task_8
```

</div>

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

> Sprawdzamy PR kolegi/koleżanki. Komentujemy, sugerujemy zmiany lub jeśli wszystko jest ok dajemy `Approve`.<br>
> Kolega/Koleżanki merguje swoje zmiany do branch'a master (klikamy przycisk `Merge pull request`).

---

## Task 9

> Utwórz plik `hibernate.properties` w folderze `resources` a następnie dodaj do niego konfiguracje `Hibernate`.

<details>
<summary>Hibernate Config</summary>

```properties
hibernate.connection.url=jdbc:mysql://localhost:3306/sda_users
hibernate.connection.username=<username>
hibernate.connection.password=<password>
hibernate.show_sql=true
hibernate.format_sql=true
hibernate.hbm2ddl.auto=update
hibernate.dialect=org.hibernate.dialect.MySQLDialect
hibernate.connection.driver_class=com.mysql.cj.jdbc.Driver
hibernate.current_session_context_class=thread
```

</details>
<br>
<details>
<summary>Hibernate XML Config Example</summary>

```xml
<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.connection.driver_class">org.h2.Driver</property>
        <property name="hibernate.connection.url">jdbc:h2:mem:test;MODE=MySQL;NON_KEYWORDS=USER</property>
        <property name="hibernate.connection.username">sa</property>
        <property name="hibernate.connection.password"></property>
        <property name="hibernate.dialect">org.hibernate.dialect.H2Dialect</property>
        <property name="hibernate.show_sql">true</property>
        <property name="hibernate.format_sql">true</property>
        <property name="hibernate.hbm2ddl.auto">create-drop</property>
        <property name="hibernate.current_session_context_class">thread</property>
    </session-factory>
</hibernate-configuration>
```

</details>

> Utwórz plik `logback.xml` w folderze `resources` a następnie dodaj do niego konfigurację `Logback`.

<details>
<summary>Logback Config</summary>

```xml

<configuration>
    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <encoder class="ch.qos.logback.classic.encoder.PatternLayoutEncoder">
            <Pattern>
                %d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n
            </Pattern>
        </encoder>
    </appender>
    <logger name="org.hibernate.sql" level="trace" additivity="false">
        <appender-ref ref="STDOUT"/>
    </logger>
    <logger name="org.hibernate" level="info" additivity="false">
        <appender-ref ref="STDOUT"/>
    </logger>
    <root level="info">
        <appender-ref ref="STDOUT"/>
    </root>
</configuration>
```

</details>

---

## Task 10

> Dodaj zależność do biblioteki `JUnit5` - [Maven Repository](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine)  
> Zaktualizuj listę technologi w pliku `README.md`.

```xml

<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.9.1</version>
    <scope>test</scope>
</dependency>
```

> Dodaj zależność dla testów parametryzowanych `JUnit5 Params` - [Maven Repository](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-params)

```xml

<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-params</artifactId>
    <version>5.9.1</version>
    <scope>test</scope>
</dependency>
```

> Dodaj zależność do bazy `H2` dla testów - [Maven Repository](https://mvnrepository.com/artifact/com.h2database/h2)

```xml

<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <version>2.1.214</version>
    <scope>test</scope>
</dependency>
```

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

---

## Task 11

> Stwórz folder `resources` w folderze `test`. <br>
> Dodaj do niego plik konfiguracyjny `hibernate.properties`.

<details>
<summary>Hibernate Test Config</summary>

````properties
hibernate.connection.url=jdbc:h2:mem:test;MODE=MySQL;NON_KEYWORDS=USER
hibernate.connection.username=sa
hibernate.connection.password=
hibernate.show_sql=true
hibernate.format_sql=true
hibernate.hbm2ddl.auto=create-drop
hibernate.dialect=org.hibernate.dialect.H2Dialect
hibernate.connection.driver_class=org.h2.Driver
hibernate.current_session_context_class=thread
````

</details>

---

## Task 12

> - Utwórz pakiet `db` a w nim klasę `HibernateUtils`.<br>
> - Dodaj prywatne i statyczne pole `SessionFactory sessionFactory`.<br>
> - Prywatna i statyczna metode `createSessionFactory` która inicjujące pole `sessionFactory`.<br>
> - Publiczny `getter` do wyciągania `sessionFactory` - metoda powinna inicjować pole `sessionFactory` jeżeli jest wartością null.<br>

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.db;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


@Slf4j
public class HibernateUtils {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            createSessionFactory();
        }
        return sessionFactory;
    }

    private static void createSessionFactory() {
        Configuration configuration = new Configuration();
        //        configuration.addAnnotatedClass()

        final ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .build();
        try {
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            log.error("Creating SessionFactory failed! Exception: {}\n{}", e.getMessage(), e);
            StandardServiceRegistryBuilder.destroy(serviceRegistry);
        }
    }

}

```

</details>

---

## Task 13

> - Utwórz pakiet `model` a w nim klasę POJO `User`.<br>
> - Klasa ta powinna być encją. <br>
> - Powinna posiadać następujące pola: `username`, `password`, `name`, `surname`, `age`, `email`.<br>
> - `username` jest unikalnym `id` użytkownika.
> - Dodaj encje do konfiguracji `hibernate` w klasie `HibernateUtils`. <br>

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String username;

    private String password;
    private String name;
    private String surname;
    private int age;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return username != null && Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
```

```java
package com.sda.db;

import com.sda.model.User;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


@Slf4j
public class HibernateUtils {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            createSessionFactory();
        }
        return sessionFactory;
    }

    private static void createSessionFactory() {
        Configuration configuration = new Configuration();
        // added line
        configuration.addAnnotatedClass(User.class);

        final ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .build();
        try {
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            log.error("Creating SessionFactory failed! Exception: {}\n{}", e.getMessage(), e);
            StandardServiceRegistryBuilder.destroy(serviceRegistry);
        }
    }
}
```

</details>

---

## <div style="color: #ec5757"> Pre-Work </div>

> Utwórz pakiet `dao` a w nim klasę `UsersDAO`.<br>
> Utwórz pakiet `com.sda.dao` (foldery ==> com ==> sda ==> dao) pod folderem `test/java` i dodaj klasę testową `UsersDAOTest`.<br>
> W klasie testowej dodaj i zainicjuj prywatne finalne pole `userDAO` typu `UsersDAO`
> `Commit => Push => PR => Merge` do `master`

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

---

## Task 14

> Dodaj metodę do dodawania nowych użytkowników (do klasy `UsersDAO`) oraz test dla tej metody w klasie `UsersDAOTest`.


<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.dao;

import com.sda.db.HibernateUtils;
import com.sda.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsersDAO {

    public void addUser(User user) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
        }
    }
}
```

```java
package com.sda.dao;

import com.sda.db.HibernateUtils;
import com.sda.model.User;
import org.hibernate.Session;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UsersDAOTest {

    private final UsersDAO usersDAO = new UsersDAO();

    @Test
    void testAddUser() {
        // given
        String expectedUsername = "user1";
        User expectedUser = User.builder()
                .username(expectedUsername)
                .password("password")
                .name("name")
                .surname("surname")
                .email("example@email.com")
                .age(30).build();

        // when
        usersDAO.addUser(expectedUser);

        // then
        User actualUser;

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            actualUser = session.get(User.class, expectedUsername);
        }

        Assertions.assertNotNull(actualUser);
        Assertions.assertEquals(expectedUser, actualUser);
        Assertions.assertEquals(expectedUser.getAge(), actualUser.getAge());
        Assertions.assertEquals(expectedUser.getEmail(), actualUser.getEmail());
        Assertions.assertEquals(expectedUser.getName(), actualUser.getName());
        Assertions.assertEquals(expectedUser.getPassword(), actualUser.getPassword());
        Assertions.assertEquals(expectedUser.getSurname(), actualUser.getSurname());
    }
}
```

</details>

---

## Task 15

> Dodaj metodę `deleteByUsername` do usuwania użytkowników po `username`. <br>
> Metoda powinna zwracać true lub false. <br>
> Dodaj testy sprawdzające poprawność zaimplementowanej metody. <br>

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.dao;

import com.sda.db.HibernateUtils;
import com.sda.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsersDAO {

    public void addUser(User user) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
        }
    }

    public boolean deleteByUsername(String username) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            User user = session.get(User.class, username);
            if (user != null) {
                session.remove(user);
            }
            transaction.commit();
            return user != null;
        }
    }
}
```

```java
package com.sda.dao;

import com.sda.db.HibernateUtils;
import com.sda.model.User;
import org.hibernate.Session;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UsersDAOTest {

    private final UsersDAO usersDAO = new UsersDAO();

    @Test
    void testAddUser() {
        // given
        String expectedUsername = "user1";
        User expectedUser = User.builder()
                .username(expectedUsername)
                .password("password")
                .name("name")
                .surname("surname")
                .email("example@email.com")
                .age(30).build();

        // when
        usersDAO.addUser(expectedUser);

        // then
        User actualUser;

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            actualUser = session.get(User.class, expectedUsername);
        }

        Assertions.assertNotNull(actualUser);
        Assertions.assertEquals(expectedUser, actualUser);
        Assertions.assertEquals(expectedUser.getAge(), actualUser.getAge());
        Assertions.assertEquals(expectedUser.getEmail(), actualUser.getEmail());
        Assertions.assertEquals(expectedUser.getName(), actualUser.getName());
        Assertions.assertEquals(expectedUser.getPassword(), actualUser.getPassword());
        Assertions.assertEquals(expectedUser.getSurname(), actualUser.getSurname());
    }

    @Test
    void testDeleteByUsernameUserNotExist() {
        // given
        String nonExistingUsername = "NON EXISTING USER";

        // when
        boolean deleted = usersDAO.deleteByUsername(nonExistingUsername);

        // then
        Assertions.assertFalse(deleted);
    }

    @Test
    void testDeleteByUsernameUserExist() {
        // given
        String username = "username";
        User expectedUser = User.builder()
                .username(username)
                .password("password")
                .name("name")
                .surname("surname")
                .email("example@email.com")
                .age(30).build();

        usersDAO.addUser(expectedUser);

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            User user = session.get(User.class, username);
            Assertions.assertNotNull(user);
        }

        // when
        boolean deleted = usersDAO.deleteByUsername(username);

        // then
        Assertions.assertTrue(deleted);

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            User user = session.get(User.class, username);
            Assertions.assertNull(user);
        }
    }
}
```

</details>

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

---

## Task 16

> Dodaj metodę `findAll` do listowania użytkowników, oraz testy dla tej metody.

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.dao;

import com.sda.db.HibernateUtils;
import com.sda.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UsersDAO {

    public List<User> findAll() {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.createQuery("SELECT u FROM User u", User.class).getResultList();
        }
    }

    public void addUser(User user) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
        }
    }

    public boolean deleteByUsername(String username) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            User user = session.get(User.class, username);
            if (user != null) {
                session.remove(user);
            }
            transaction.commit();
            return user != null;
        }
    }
}
```

```java
package com.sda.dao;

import com.sda.db.HibernateUtils;
import com.sda.model.User;
import org.hibernate.Session;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class UsersDAOTest {

    private final UsersDAO usersDAO = new UsersDAO();

    @Test
    void testAddUser() {
        // given
        String expectedUsername = "user1";
        User expectedUser = getUser(expectedUsername);

        // when
        usersDAO.addUser(expectedUser);

        // then
        User actualUser;

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            actualUser = session.get(User.class, expectedUsername);
        }

        Assertions.assertNotNull(actualUser);
        Assertions.assertEquals(expectedUser, actualUser);
        Assertions.assertEquals(expectedUser.getAge(), actualUser.getAge());
        Assertions.assertEquals(expectedUser.getEmail(), actualUser.getEmail());
        Assertions.assertEquals(expectedUser.getName(), actualUser.getName());
        Assertions.assertEquals(expectedUser.getPassword(), actualUser.getPassword());
        Assertions.assertEquals(expectedUser.getSurname(), actualUser.getSurname());
    }

    @Test
    void testDeleteByUsernameUserNotExist() {
        // given
        String nonExistingUsername = "NON EXISTING USER";

        // when
        boolean deleted = usersDAO.deleteByUsername(nonExistingUsername);

        // then
        Assertions.assertFalse(deleted);
    }

    @Test
    void testDeleteByUsernameUserExist() {
        // given
        String username = "username";
        User expectedUser = getUser(username);

        usersDAO.addUser(expectedUser);

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            User user = session.get(User.class, username);
            Assertions.assertNotNull(user);
        }

        // when
        boolean deleted = usersDAO.deleteByUsername(username);

        // then
        Assertions.assertTrue(deleted);

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            User user = session.get(User.class, username);
            Assertions.assertNull(user);
        }
    }


    @Test
    void testFindAll() {
        // given
        final List<User> expectedList = List.of(
                getUser("user1"),
                getUser("user2"),
                getUser("user3")
        );

        expectedList.forEach(usersDAO::addUser);

        // when
        List<User> usersList = usersDAO.findAll();


        // then
        Assertions.assertNotNull(usersList);
        Assertions.assertEquals(expectedList.size(), usersList.size());
        Assertions.assertIterableEquals(expectedList, usersList);
    }


    private User getUser(String username) {
        return User.builder()
                .username(username)
                .password("password")
                .name("name")
                .surname("surname")
                .email("example@email.com")
                .age(30).build();
    }
}
```

</details>

---

## Task 17

> Dodaj metodę `findByUsername` do wyciągania użytkowników po ich nazwie. <br>
> Napisz testy dla tej metody.

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.dao;

import com.sda.db.HibernateUtils;
import com.sda.exception.NotFoundException;
import com.sda.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UsersDAO {

    public User findByUsername(String username) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.get(User.class, username);
        }
    }

    public List<User> findAll() {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.createQuery("SELECT u FROM User u", User.class).getResultList();
        }
    }

    public void addUser(User user) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
        }
    }

    public boolean deleteByUsername(String username) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            User user = session.get(User.class, username);
            if (user != null) {
                session.remove(user);
            }
            transaction.commit();
            return user != null;
        }
    }
}
```

```java
package com.sda.dao;

import com.sda.db.HibernateUtils;
import com.sda.exception.NotFoundException;
import com.sda.model.User;
import org.hibernate.Session;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UsersDAOTest {

    private final UsersDAO usersDAO = new UsersDAO();

    // other tests 

    @Test
    void testFindByUsername() {
        // given
        String username = "userToAdd";
        User expectedUser = getUser(username);
        usersDAO.addUser(expectedUser);

        // when
        User actualUser = usersDAO.findByUsername(username);

        // then
        assertNotNull(actualUser);
        assertEquals(expectedUser, actualUser);
        assertEquals(expectedUser.getAge(), actualUser.getAge());
        assertEquals(expectedUser.getEmail(), actualUser.getEmail());
        assertEquals(expectedUser.getName(), actualUser.getName());
        assertEquals(expectedUser.getPassword(), actualUser.getPassword());
        assertEquals(expectedUser.getSurname(), actualUser.getSurname());
    }

    private User getUser(String username) {
        return User.builder()
                .username(username)
                .password("password")
                .name("name")
                .surname("surname")
                .email("example@email.com")
                .age(30).build();
    }
}
```

</details>

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

---

## Task 18

> Dodaj metodę `update` do modyfikowania danych użytkownika o podanym `username`.<br>
> Napisz testy dla tej metody.

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.dao;

import com.sda.db.HibernateUtils;
import com.sda.exception.InvalidUpdateException;
import com.sda.exception.NotFoundException;
import com.sda.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UsersDAO {

    public User update(User user) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            User updatedUser = session.merge(user);
            transaction.commit();
            return updatedUser;
        }
    }

    public User findByUsername(String username) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.get(User.class, username);
        }
    }

    public List<User> findAll() {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.createQuery("SELECT u FROM User u", User.class).getResultList();
        }
    }

    public void addUser(User user) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
        }
    }

    public boolean deleteByUsername(String username) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            User user = session.get(User.class, username);
            if (user != null) {
                session.remove(user);
            }
            transaction.commit();
            return user != null;
        }
    }

}
```

```java
package com.sda.dao;

import com.sda.db.HibernateUtils;
import com.sda.exception.InvalidUpdateException;
import com.sda.exception.NotFoundException;
import com.sda.model.User;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersDAOTest {

    private final UsersDAO usersDAO = new UsersDAO();

    // other tests

    @Test
    void testUpdate() {
        // given
        String username = "user1";
        User user = getUser(username);

        usersDAO.addUser(user);

        User expectedUser = getUser(username);
        expectedUser.setName("UpdatedName");
        expectedUser.setAge(100);


        // when
        User actualUser = usersDAO.update(expectedUser);

        // then
        assertNotNull(actualUser);
        assertEquals(expectedUser, actualUser);
        assertEquals(expectedUser.getAge(), actualUser.getAge());
        assertEquals(expectedUser.getEmail(), actualUser.getEmail());
        assertEquals(expectedUser.getName(), actualUser.getName());
        assertEquals(expectedUser.getPassword(), actualUser.getPassword());
        assertEquals(expectedUser.getSurname(), actualUser.getSurname());
    }

    private User getUser(String username) {
        return User.builder()
                .username(username)
                .password("password")
                .name("name")
                .surname("surname")
                .email("example@email.com")
                .age(30).build();
    }
}
```

</details>

---

## Task 19

> Dodaj metodę `exist` sprawdzającą, czy użytkownika o podanym `username` istnieje.<br>
> Napisz testy dla tej metody.

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.dao;

import com.sda.db.HibernateUtils;
import com.sda.exception.InvalidUpdateException;
import com.sda.exception.NotFoundException;
import com.sda.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UsersDAO {

    public boolean exist(String username) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {

            String queryString = "SELECT count(u) FROM User u WHERE u.username = :username";
            return session.createQuery(queryString, Long.class)
                    .setParameter("username", username)
                    .uniqueResult() > 0;
        }
    }

    public User update(User user) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            User updatedUser = session.merge(user);
            transaction.commit();
            return updatedUser;
        }
    }

    public User findByUsername(String username) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.get(User.class, username);
        }
    }

    public List<User> findAll() {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.createQuery("SELECT u FROM User u", User.class).getResultList();
        }
    }

    public void addUser(User user) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
        }
    }

    public boolean deleteByUsername(String username) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            User user = session.get(User.class, username);
            if (user != null) {
                session.remove(user);
            }
            transaction.commit();
            return user != null;
        }
    }

}
```

```java
package com.sda.dao;

import com.sda.db.HibernateUtils;
import com.sda.exception.InvalidUpdateException;
import com.sda.exception.NotFoundException;
import com.sda.model.User;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersDAOTest {

    private final UsersDAO usersDAO = new UsersDAO();

    // other tests

    @Test
    void testExistNonExistingUsername() {
        // given
        String nonExistingUsername = "NON EXISTING USER";

        // when
        boolean exist = usersDAO.exist(nonExistingUsername);

        // then
        assertFalse(exist);
    }

    @Test
    void testExistExistingUsername() {
        // given
        String username = "user1";
        User user = getUser(username);

        usersDAO.addUser(user);


        // when
        boolean exist = usersDAO.exist(username);

        // then
        assertTrue(exist);
    }

    private User getUser(String username) {
        return User.builder()
                .username(username)
                .password("password")
                .name("name")
                .surname("surname")
                .email("example@email.com")
                .age(30).build();
    }
}
```

</details>

---

## Task 20

> Utwórz pakiet `dto` a w nim klasę `UserDTO`. <br>
> Klasa ta powinna być `Record'em` i posiadać pola `username`, `name`, `surname`, `age`, `email`.

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.dto;

import lombok.Builder;

public record UserDTO(String username,
                      String name,
                      String surname,
                      int age,
                      String email) {


    @Builder
    public UserDTO {
    }

}
```

</details>

---

## Task 21

> Utwórz pakiet `mapper` a w nim klasę `UserMapper`. <br>
> Dodaj metode `public UserDTO map(User User)`. <br>

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.mapper;

import com.sda.dto.UserDTO;
import com.sda.model.User;

public class UserMapper {


    public UserDTO map(User User) {
        return UserDTO.builder()
                .name(User.getName())
                .surname(User.getSurname())
                .username(User.getUsername())
                .age(User.getAge())
                .email(User.getEmail())
                .build();
    }
}

```

</details>

---

## <div style="color: #ec5757"> Pre-Work </div>

> Utwórz pakiet `service` a w nim klasę `UserService`. <br>
> Dodaj prywatne finalne pola `userDAO` typu `UserDAO`, `userMapper` typu `UserMapper` oraz konstruktor.<br>
> `Commit => Push => PR => Merge` do `master`

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

---

## Task 22

> Do klasy `UserService` dodaj metode `public List<UserDTO> findAll()` która zwraca wszystkich użytkowników jako `UserDTO`. <br>
> Metoda powinna wykorzystywać metode `findAll` z `UserDAO` a także metode `map` z `UserMapper`.

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.service;

import com.sda.dao.UsersDAO;
import com.sda.dto.UserDTO;
import com.sda.mapper.UserMapper;
import com.sda.model.User;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserService {

    private final UsersDAO usersDAO;
    private final UserMapper userMapper;

    public List<UserDTO> findAll() {
        return usersDAO.findAll().stream()
                .map(userMapper::map)
                .toList();
    }
}
```

</details>

---

## Task 23

> Utwórz pakiet `exception` a w nim klasę `NotFoundException` rozszerzającą `RuntimeException` (unchecked exception) <br>
> Nadpisz konstruktor przyjmujący argument `String message` z klasy nadrzędnej.

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }
}
```

</details>

> Dodaj metode `public UserDTO findByUsername(String username)` do wyszukiwania użytkowników po nazwie. <br>
> Jeżeli użytkownik o podany `username` nie istnieje metoda powinna rzucić `NotFoundException` z adekwatnym komunikatem. <br>
> Wykorzystaj metode `findByUsername` z `UserDAO` a także metode `map` z `UserMapper`.

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.service;

import com.sda.dao.UsersDAO;
import com.sda.exception.NotFoundException;
import com.sda.model.User;
import com.sda.dto.UserDTO;
import com.sda.mapper.UserMapper;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserService {

    private final UsersDAO usersDAO;
    private final UserMapper userMapper;

    public List<UserDTO> findAll() {
        return usersDAO.findAll().stream()
                .map(userMapper::map)
                .toList();
    }

    public UserDTO findByUsername(String username) {
        User user = usersDAO.findByUsername(username);
        if (user == null) {
            throw new NotFoundException("User with given username does not exists!");
        }
        return userMapper.map(user);
    }
}
```

</details>

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

---

## Task 24

> Dodaj metode `public void deleteByUsername(String username)` do usuwania użytkowników po nazwie. <br>
> Jeżeli użytkownik o podany `username` nie istnieje metoda powinna rzucić `NotFoundException` z adekwatnym komunikatem. <br>
> Wykorzystaj metode `deleteByUsername` z `UserDAO`.

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.service;

import com.sda.dao.UsersDAO;
import com.sda.exception.NotFoundException;
import com.sda.model.User;
import com.sda.dto.UserDTO;
import com.sda.mapper.UserMapper;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserService {

    private final UsersDAO usersDAO;
    private final UserMapper userMapper;

    public List<UserDTO> findAll() {
        return usersDAO.findAll().stream()
                .map(userMapper::map)
                .toList();
    }

    public UserDTO findByUsername(String username) {
        User user = usersDAO.findByUsername(username);
        if (user == null) {
            throw new NotFoundException("User with given username does not exists!");
        }
        return userMapper.map(user);
    }

    public void deleteByUsername(String username) {
        boolean deleted = usersDAO.deleteByUsername(username);

        if (!deleted) {
            throw new NotFoundException("User with given username does not exists!");
        }
    }
}
```

</details>

---

## Task 25

> W pakiet `exception` utwórz klasę `UsernameConflictException` rozszerzającą `RuntimeException` (unchecked exception) <br>
> Nadpisz konstruktor przyjmujący argument `String message` z klasy nadrzędnej.

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.exception;

public class UsernameConflictException extends RuntimeException {

    public UsernameConflictException(String message) {
        super(message);
    }
}
```

</details>

> Dodaj metode `public void create(User user)` do tworzenia użytkowników. <br>
> Jeżeli użytkownik o podany `username` już istnieje metoda powinna rzucić `UsernameConflictException` z adekwatnym komunikatem. <br>
> Wykorzystaj metody `addUser` oraz `exist` z `UserDAO`.

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.service;

import com.sda.dao.UsersDAO;
import com.sda.exception.NotFoundException;
import com.sda.exception.UsernameConflictException;
import com.sda.model.User;
import com.sda.dto.UserDTO;
import com.sda.mapper.UserMapper;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserService {

    private final UsersDAO usersDAO;
    private final UserMapper userMapper;

    public List<UserDTO> findAll() {
        return usersDAO.findAll().stream()
                .map(userMapper::map)
                .toList();
    }

    public UserDTO findByUsername(String username) {
        User user = usersDAO.findByUsername(username);
        if (user == null) {
            throw new NotFoundException("User with given username does not exists!");
        }
        return userMapper.map(user);
    }

    public void deleteByUsername(String username) {
        boolean deleted = usersDAO.deleteByUsername(username);

        if (!deleted) {
            throw new NotFoundException("User with given username does not exists!");
        }
    }

    public void create(User user) {
        boolean exist = usersDAO.exist(user.getUsername());

        if (exist) {
            throw new UsernameConflictException("User with given username already exists!");
        }
        usersDAO.addUser(user);
    }
}
```

</details>

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

---

## Task 26

> Dodaj metode `public UserDTO update(User user, String username)` do aktualizowania danych użytkownika. <br>
> Przyjmujemy, że `username` jest niemodyfikowalny. "User" username oraz "String" username muszą być takie same,
> w innym wypadku metoda powinna rzucać `UsernameConflictException` ze stosownym komunikatem.<br>
> Jeżeli użytkownik nie istnieje w bazie metoda powinna rzucać `NotFoundException` ze stosownym komunikatem.<br>
> Wykorzystaj metody `exist` i `update` z `UserDAO` a także metode `map` z `UserMapper`.

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.service;

import com.sda.dao.UsersDAO;
import com.sda.exception.NotFoundException;
import com.sda.exception.UsernameConflictException;
import com.sda.model.User;
import com.sda.dto.UserDTO;
import com.sda.mapper.UserMapper;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserService {

    private final UsersDAO usersDAO;
    private final UserMapper userMapper;

    public List<UserDTO> findAll() {
        return usersDAO.findAll().stream()
                .map(userMapper::map)
                .toList();
    }

    public UserDTO findByUsername(String username) {
        User user = usersDAO.findByUsername(username);
        if (user == null) {
            throw new NotFoundException("User with given username does not exists!");
        }
        return userMapper.map(user);
    }

    public void deleteByUsername(String username) {
        boolean deleted = usersDAO.deleteByUsername(username);

        if (!deleted) {
            throw new NotFoundException("User with given username does not exists!");
        }
    }

    public void create(User user) {
        boolean exist = usersDAO.exist(user.getUsername());

        if (exist) {
            throw new UsernameConflictException("User with given username already exists!");
        }
        usersDAO.addUser(user);
    }

    public UserDTO update(User user, String username) {

        if (!user.getUsername().equals(username)) {
            throw new UsernameConflictException("Conflict - Usernames does not match!");
        }

        boolean exist = usersDAO.exist(user.getUsername());
        if (!exist) {
            throw new NotFoundException("User with given username does not exists!");
        }
        User updatedUser = usersDAO.update(user);
        return userMapper.map(updatedUser);
    }
}
```

</details>

---

## Task 27

> Dodaj testy dla wszystkich metod z `UserService`

---

## <div style="color: #ec5757"> Pre-Work </div>

> Utwórz pakiet `controller` a w nim klasę `UserController`.<br>
> Dodaj prywatne finalne pole `userService` typu `UserService` oraz konstruktor.<br>
> `Commit => Push => PR => Merge` do `master`

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

---

## Task 28

> Dodaj i zaimplementuj metodę `public void findAll()` w klasie `UserController`.<br>
> Metoda ma drukować w konsoli `Users list: ` a następnie w nowej linii listę wszystkich użytkowników.<br>
> Jeśli lista jest pusta metoda powinna wydrukować `Users list empty!`.


<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.controller;

import com.sda.dto.UserDTO;
import com.sda.model.User;
import com.sda.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    public void findAll() {

        List<UserDTO> users = userService.findAll();

        if (users.isEmpty()) {
            System.out.println("Users list empty!");
        } else {
            System.out.println("Users list: ");
            users.forEach(System.out::println);
        }
    }

}
```

</details>

---

## Task 29

> Dodaj i zaimplementuj metodę `public void findByUsername(String username)` w klasie `UserController`.<br>
> Metoda ma drukować w konsoli `"User found: " + user`.<br>
> Obsłuż potencjalne wyjątki rzucane z metody `userService.findByUsername()` w sekcji `catch` zaloguj informacje o wystąpieniu błędu.

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.controller;

import com.sda.dto.UserDTO;
import com.sda.exception.NotFoundException;
import com.sda.model.User;
import com.sda.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    public void findAll() {

        List<UserDTO> users = userService.findAll();

        if (users.isEmpty()) {
            System.out.println("Users list empty!");
        } else {
            System.out.println("Users list: ");
            users.forEach(System.out::println);
        }
    }

    public void findByUsername(String username) {
        try {
            UserDTO user = userService.findByUsername(username);
            System.out.println("User found: " + user);
        } catch (NotFoundException ex) {
            log.error("NotFoundException: {}", ex.getMessage());
        }
    }
}
```

</details>

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

---

## Task 30

> Zaimplementuj metodę `public void deleteByUsername(String username)`.<br>
> Metoda ma drukować w konsoli `User with username '<username>' deleted!`.<br>
> Obsłuż potencjalne wyjątki i zaloguj informacje o wystąpieniu błędu.


<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.controller;

import com.sda.dto.UserDTO;
import com.sda.exception.NotFoundException;
import com.sda.model.User;
import com.sda.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    public void findAll() {

        List<User> users = userService.findAll();

        if (users.isEmpty()) {
            System.out.println("Users list empty!");
        } else {
            System.out.println("Users list: ");
            users.forEach(System.out::println);
        }
    }

    public void findByUsername(String username) {
        try {
            User user = userService.findByUsername(username);
            System.out.println("User found: " + user);
        } catch (NotFoundException ex) {
            log.error("NotFoundException: {}", ex.getMessage());
        }
    }

    public void deleteByUsername(String username) {
        try {
            userService.deleteByUsername(username);
            System.out.printf("User with username '%s' deleted.%n", username);
        } catch (NotFoundException ex) {
            log.error("NotFoundException: {}", ex.getMessage());
        }
    }
}

```

</details>

---

## Task 31

> Zaimplementuj metodę `public void create(User user)`.<br>
> Metoda ma drukować w konsoli `User with username '<username>' created!`.<br>
> Obsłuż potencjalne wyjątki i zaloguj informacje o wystąpieniu błędu.


<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.controller;

import com.sda.dto.UserDTO;
import com.sda.exception.NotFoundException;
import com.sda.exception.UsernameConflictException;
import com.sda.model.User;
import com.sda.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    public void findAll() {

        List<User> users = userService.findAll();

        if (users.isEmpty()) {
            System.out.println("Users list empty!");
        } else {
            System.out.println("Users list: ");
            users.forEach(System.out::println);
        }
    }

    public void findByUsername(String username) {
        try {
            User user = userService.findByUsername(username);
            System.out.println("User found: " + user);
        } catch (NotFoundException ex) {
            log.error("NotFoundException: {}", ex.getMessage());
        }
    }

    public void deleteByUsername(String username) {
        try {
            userService.deleteByUsername(username);
            System.out.printf("User with username '%s' deleted.%n", username);
        } catch (NotFoundException ex) {
            log.error("NotFoundException: {}", ex.getMessage());
        }
    }

    public void create(User user) {
        try {
            userService.create(user);
            System.out.printf("User with username '%s' created!%n", user.getUsername());
        } catch (UsernameConflictException ex) {
            log.error("UsernameConflictException: {}", ex.getMessage());
        }
    }
}
```

</details>

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

---

## Task 32

> Zaimplementuj metodę `public void update(User user, String username)`.<br>
> Metoda ma drukować w konsoli `User with username '<username>' updated!`,
> a następnie `"User after update: " + updateUser`.<br>
> Obsłuż potencjalne wyjątki i zaloguj informacje o wystąpieniu błędu.


<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.controller;

import com.sda.dto.UserDTO;
import com.sda.exception.NotFoundException;
import com.sda.exception.UsernameConflictException;
import com.sda.model.User;
import com.sda.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    public void findAll() {

        List<User> users = userService.findAll();

        if (users.isEmpty()) {
            System.out.println("Users list empty!");
        } else {
            System.out.println("Users list: ");
            users.forEach(System.out::println);
        }
    }

    public void findByUsername(String username) {
        try {
            User user = userService.findByUsername(username);
            System.out.println("User found: " + user);
        } catch (NotFoundException ex) {
            log.error("NotFoundException: {}", ex.getMessage());
        }
    }

    public void deleteByUsername(String username) {
        try {
            userService.deleteByUsername(username);
            System.out.printf("User with username '%s' deleted.%n", username);
        } catch (NotFoundException ex) {
            log.error("NotFoundException: {}", ex.getMessage());
        }
    }

    public void create(User user) {
        try {
            userService.create(user);
            System.out.printf("User with username '%s' created!%n", user.getUsername());
        } catch (UsernameConflictException ex) {
            log.error("UsernameConflictException: {}", ex.getMessage());
        }
    }

    public void update(User user, String username) {
        try {
            UserDTO updateUser = userService.update(user, username);
            System.out.printf("User with username '%s' updated!%n", user.getUsername());
            System.out.printf("User after update: %s%n", updateUser);
        } catch (UsernameConflictException ex) {
            log.error("UsernameConflictException: {}", ex.getMessage());
        } catch (NotFoundException ex) {
            log.error("NotFoundException: {}", ex.getMessage());
        }
    }

}
```

</details>

---

## Task 33

> Do pakietu `controller` dodaj klasę `InputController`.<br>
> Utwórz finalne pole `scanner` typu `Scanner` oraz konstruktor.<br>
> Dodaj metodę `public String getString(String text)` którą wydrukuje dany text, a następnie poprosi o input. <br>
> Dodaj metody dla pozyskiwania specyficznych danych (wszystkie powinny wykorzystać `getString`):
> - `public String getUsername()`.
> - `public String getName()`.<br>
> - `public String getSurname()`.<br>
> - `public int getAge()`.<br>
> - `public String getEmail()`.<br>
> - `public String getPassword()`.<br>


<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.controller;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class InputController {

    private final Scanner scanner;

    public String getUsername() {
        return getString("Username: ");
    }

    public String getName() {
        return getString("Name: ");
    }

    public String getSurname() {
        return getString("Surname: ");
    }

    public int getAge() {
        return Integer.parseInt(getString("Age: "));
    }

    public String getEmail() {
        return getString("Email: ");
    }

    public String getPassword() {
        return getString("Password: ");
    }

    public String getString(String text) {
        System.out.println(text);
        return scanner.nextLine();
    }
}
```

</details>

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

---

## Task 34

> W klasie Main dodaj statyczne i finalne pola: <br>
> - `Scanner scanner`
> - `UsersDAO usersDAO`
> - `UserMapper userMapper`
> - `UserService userService`
> - `UserController userController`
> - `InputController inputController`


> W metodzie `main` stwórz pętle `do while`.<br>
> W pętli drukuj odstępne opcje i odpytuj użytkownika o input do momentu aż wprowadzi `6` ==> `Exit`
> ```
> """
> Options:
> 1 - List users
> 2 - Find user
> 3 - Create user
> 4 - Delete user
> 5 - Update users
> 6 - Exit
> """
> ```
> Dodaj `swich expression` i w którym zdefiniujesz odpowiednie reakcje na wybrana opcje.


<details>
<summary>Rozwiązanie</summary>

```java
package com.sda;

import com.sda.controller.InputController;
import com.sda.controller.UserController;
import com.sda.dao.UsersDAO;
import com.sda.mapper.UserMapper;
import com.sda.model.User;
import com.sda.service.UserService;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static UsersDAO usersDAO = new UsersDAO();
    private final static UserMapper userMapper = new UserMapper();
    private final static UserService userService = new UserService(usersDAO, userMapper);
    private final static UserController userController = new UserController(userService);
    private final static InputController inputController = new InputController(scanner);

    public static void main(String[] args) {

        String option;
        do {

            System.out.println("""
                    Options:
                     1 - List users
                     2 - Find user
                     3 - Create user
                     4 - Delete user
                     5 - Update users
                     6 - Exit
                    """);

            option = scanner.nextLine();
            switch (option) {
                case "1" -> userController.findAll();
                case "2" -> findUser();
                case "3" -> createUser();
                case "4" -> deleteUser();
                case "5" -> updateUser();
                case "6" -> System.out.println("Exit!");
            }
        } while (!"6".equals(option));

        scanner.close();
    }

    private static void createUser() {

        User user = User.builder()
                .username(inputController.getUsername())
                .name(inputController.getName())
                .surname(inputController.getSurname())
                .age(inputController.getAge())
                .email(inputController.getEmail())
                .password(inputController.getPassword())
                .build();

        userController.create(user);
    }

    private static void findUser() {
        String username = inputController.getUsername();
        userController.findByUsername(username);
    }

    private static void deleteUser() {
        String username = inputController.getUsername();
        userController.deleteByUsername(username);
    }

    private static void updateUser() {
        String username = inputController.getUsername();
        System.out.println("Update user info: ");
        User user = User.builder()
                .username(inputController.getUsername())
                .name(inputController.getName())
                .surname(inputController.getSurname())
                .age(inputController.getAge())
                .email(inputController.getEmail())
                .password(inputController.getPassword())
                .build();

        userController.update(user, username);
    }
}
```

</details>

---

## Task 35

> W pakiecie `model` dodaj encje (klasę) `Address` posiadającą pola `id`, `city`, `street`, `postCode`. <br>
> Zdefiniuj relacje `OneToMany` `User` - `Address`.

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String street;
    private String postCode;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Address address = (Address) o;
        return id != null && Objects.equals(id, address.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
```

```java
package com.sda.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Users")
public class User {

    @Id
    private String username;

    private String password;
    private String name;
    private String surname;
    private int age;
    private String email;

    @ToString.Exclude
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<Address> addresses;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return username != null && Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
```
</details>

---

## Task 36

> W pakiecie `model` dodaj encje (klasę) `SocialMediaLink` posiadającą pola `id`, `name`, `url` <br>
> Zdefiniuj relacje `OneToMany` `User` - `SocialMediaLink`.

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SocialMediaLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String url;


    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SocialMediaLink that = (SocialMediaLink) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
```

```java
package com.sda.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Users")
public class User {

    @Id
    private String username;

    private String password;
    private String name;
    private String surname;
    private int age;
    private String email;

    @ToString.Exclude
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<SocialMediaLink> socialMediaLinks;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return username != null && Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
```
</details>

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

---

## Task 37

> W pakiecie `dao` dodaj klasę `AddressDAO` i zaimplementuj **CRUD** z następującymi metodami: 
> - `public boolean deleteById(Long id)`
> - `public void create(Address address)`
> - `public Address update(Address address)`
> - `public List<Address> findAllByUsername(String username)`

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.dao;

import com.sda.db.HibernateUtils;
import com.sda.model.Address;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AddressDAO {

    public void create(Address address) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(address);
            transaction.commit();
        }
    }

    public Address update(Address address) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Address updatedAddress = session.merge(address);
            transaction.commit();
            return updatedAddress;
        }
    }

    public List<Address> findAllByUsername(String username) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String query = "SELECT a FROM Address a WHERE a.user.username = :username";
            return session.createQuery(query, Address.class)
                    .setParameter("username", username)
                    .getResultList();
        }
    }

    public boolean deleteById(Long id) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Address address = session.get(Address.class, id);
            if (address != null) {
                session.remove(address);
            }
            transaction.commit();
            return address != null;
        }
    }
}
```

</details>

---

## Task 38

> W pakiecie `dao` dodaj klasę `SocialMediaLinkDAO` i zaimplementuj **CRUD** z następującymi metodami: 
> - `public boolean deleteById(Long id)`
> - `public void create(Address address)`
> - `public Address update(Address address)`
> - `public List<Address> findAllByUsername(String username)`

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.dao;

import com.sda.db.HibernateUtils;

import com.sda.model.SocialMediaLink;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SocialMediaLinkDAO {

    public void create(SocialMediaLink socialMediaLink) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(socialMediaLink);
            transaction.commit();
        }
    }

    public SocialMediaLink update(SocialMediaLink socialMediaLink) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            SocialMediaLink updatedSocialMediaLink = session.merge(socialMediaLink);
            transaction.commit();
            return updatedSocialMediaLink;
        }
    }

    public List<SocialMediaLink> findAllByUsername(String username) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String query = "SELECT link FROM SocialMediaLink link WHERE link.user.username = :username";
            return session.createQuery(query, SocialMediaLink.class)
                    .setParameter("username", username)
                    .getResultList();
        }
    }

    public boolean deleteById(Long id) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            SocialMediaLink socialMediaLink = session.get(SocialMediaLink.class, id);
            if (socialMediaLink != null) {
                session.remove(socialMediaLink);
            }
            transaction.commit();
            return socialMediaLink != null;
        }
    }
}

```

</details>

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

---

## Task 39

> W pakiecie `service` dodaj klasę `AddressService` z finalnymi polami `UsersDAO usersDAO`, `AddressDAO addressDAO`.
> Zaimplementuj następujące metody:
> - `public void deleteById(Long id)`
> - `public void create(Address address)`
> - `public List<Address> findAllByUsername(String username)`
> - `public Address update(Address address, String username)` 

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.service;

import com.sda.dao.AddressDAO;
import com.sda.dao.UsersDAO;
import com.sda.exception.NotFoundException;
import com.sda.exception.UsernameConflictException;
import com.sda.model.Address;
import com.sda.model.User;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class AddressService {

    private final UsersDAO usersDAO;
    private final AddressDAO addressDAO;

    public List<Address> findAllByUsername(String username) {
        return addressDAO.findAllByUsername(username);
    }

    public void create(Address address) {
        checkIfUserExist(address.getUser());
        addressDAO.create(address);
    }

    public void deleteById(Long id) {
        boolean deleted = addressDAO.deleteById(id);

        if (!deleted) {
            throw new NotFoundException("Address with given id does not exists!");
        }
    }

    public Address update(Address address, String username) {
        final User user = address.getUser();

        if (!user.getUsername().equals(username)) {
            throw new UsernameConflictException("Conflict - Usernames does not match!");
        }
        checkIfUserExist(user);
        return addressDAO.update(address);
    }

    private void checkIfUserExist(User user) {
        if (!usersDAO.exist(user.getUsername())) {
            throw new NotFoundException("User with given username does not exists!");
        }
    }

}

```
</details>

---

## Task 40

> W pakiecie `service` dodaj klasę `SocialMediaLinkService` z finalnymi polami `UsersDAO usersDAO`, `AddressDAO addressDAO`.
> Zaimplementuj następujące metody:
> - `public void deleteById(Long id)`
> - `public void create(Address address)`
> - `public List<Address> findAllByUsername(String username)`
> - `public Address update(Address address, String username)`

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.service;

import com.sda.dao.SocialMediaLinkDAO;
import com.sda.dao.UsersDAO;
import com.sda.exception.NotFoundException;
import com.sda.exception.UsernameConflictException;
import com.sda.model.SocialMediaLink;
import com.sda.model.User;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class SocialMediaLinkService {

    private final UsersDAO usersDAO;
    private final SocialMediaLinkDAO socialMediaLinkDAO;

    public List<SocialMediaLink> findAllByUsername(String username) {
        return socialMediaLinkDAO.findAllByUsername(username);
    }

    public void create(SocialMediaLink socialMediaLink) {
        checkIfUserExist(socialMediaLink.getUser());
        socialMediaLinkDAO.create(socialMediaLink);
    }

    public void deleteById(Long id) {
        boolean deleted = socialMediaLinkDAO.deleteById(id);

        if (!deleted) {
            throw new NotFoundException("SocialMediaLink with given id does not exists!");
        }
    }

    public SocialMediaLink update(SocialMediaLink socialMediaLink, String username) {
        final User user = socialMediaLink.getUser();

        if (!user.getUsername().equals(username)) {
            throw new UsernameConflictException("Conflict - Usernames does not match!");
        }
        checkIfUserExist(user);
        return socialMediaLinkDAO.update(socialMediaLink);
    }

    private void checkIfUserExist(User user) {
        if (!usersDAO.exist(user.getUsername())) {
            throw new NotFoundException("User with given username does not exists!");
        }
    }

}
```
</details>

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

---

## Task 41

> W pakiecie `controller` dodaj klasę `AddressController` z polem `AddressService addressService`.<br>
> Zaimplementuj poniższe metody, obsłuż potencjalne wyjątki. Zaloguj informacje o wystąpieniu błędu.

> **[1]** - `public void create(Address address)`<br>
> Metoda ma drukować w konsoli `"Address for username '%s' created!%n", username`

> **[2]** - `public void deleteById(Long id)`<br>
> Metoda ma drukować w konsoli `"Address with id '%d' deleted!%n", id`

> **[3]** - `public List<Address> findAllByUsername(String username)`<br>
> Metoda ma drukować w konsoli `Addresses list:` a następnie w nowej linii listę wszystkich adresów.<br>
> Jeśli lista jest pusta metoda powinna wydrukować `Addresses list empty!`.

> **[4]** - `public Address update(Address address, String username)`<br>
> Metoda ma drukować w konsoli `"Address updated!"`, a następnie `"Address after update: " + updateAddress`

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.controller;

import com.sda.exception.NotFoundException;
import com.sda.exception.UsernameConflictException;
import com.sda.model.Address;
import com.sda.service.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    public void findAllByUsername(String username) {
        List<Address> addresses = addressService.findAllByUsername(username);

        if (addresses.isEmpty()) {
            System.out.println("Addresses list empty!");
        } else {
            System.out.println("Addresses list: ");
            addresses.forEach(System.out::println);
        }
    }

    public void create(Address address) {
        String username = address.getUser().getUsername();
        try {
            addressService.create(address);
            System.out.printf("Address for username '%s' created!%n", username);
        } catch (NotFoundException ex) {
            log.error("NotFoundException: {}", ex.getMessage());
        }
    }

    public void deleteById(Long id) {
        try {
            addressService.deleteById(id);
            System.out.printf("Address with id '%d' deleted!%n", id);
        } catch (NotFoundException ex) {
            log.error("NotFoundException: {}", ex.getMessage());
        }
    }

    public void update(Address address, String username) {

        try {
            Address updateAddress = addressService.update(address, username);
            System.out.println("Address updated!");
            System.out.printf("Address after update: %s%n", updateAddress);
        } catch (UsernameConflictException ex) {
            log.error("UsernameConflictException: {}", ex.getMessage());
        } catch (NotFoundException ex) {
            log.error("NotFoundException: {}", ex.getMessage());
        }
    }
}
```
</details>

---

## Task 42

> W pakiecie `controller` dodaj klasę `SocialMediaLinkController` z polem `SocialMediaLinkService socialMediaLinkService`.
> Zaimplementuj poniższe metody, obsłuż potencjalne wyjątki. Zaloguj informacje o wystąpieniu błędu.

> **[1]** - `public void create(SocialMediaLink address)`<br>
> Metoda ma drukować w konsoli `"SocialMediaLink for username '%s' created!%n", username`

> **[2]** - `public void deleteById(Long id)`<br>
> Metoda ma drukować w konsoli `"SocialMediaLink with id '%d' deleted!%n", id`

> **[3]** - `public List<SocialMediaLink> findAllByUsername(String username)`<br>
> Metoda ma drukować w konsoli `SocialMediaLink list:` a następnie w nowej linii listę wszystkich linków.<br>
> Jeśli lista jest pusta metoda powinna wydrukować `SocialMediaLink list empty!`.

> **[4]** - `public SocialMediaLink update(SocialMediaLink socialMediaLink, String username)`<br>
> Metoda ma drukować w konsoli `"SocialMediaLink updated!"`, a następnie `"SocialMediaLink after update: " + updateAddress`

<details>
<summary>Rozwiązanie</summary>

```java
package com.sda.controller;

import com.sda.exception.NotFoundException;
import com.sda.exception.UsernameConflictException;
import com.sda.model.SocialMediaLink;
import com.sda.service.SocialMediaLinkService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class SocialMediaLinkController {

    private final SocialMediaLinkService socialMediaLinkService;

    public void findAllByUsername(String username) {
        List<SocialMediaLink> socialMediaLink = socialMediaLinkService.findAllByUsername(username);

        if (socialMediaLink.isEmpty()) {
            System.out.println("SocialMediaLinks list empty!");
        } else {
            System.out.println("SocialMediaLinks list: ");
            socialMediaLink.forEach(System.out::println);
        }
    }

    public void create(SocialMediaLink address) {
        String username = address.getUser().getUsername();
        try {
            socialMediaLinkService.create(address);
            System.out.printf("SocialMediaLink for username '%s' created!%n", username);
        } catch (NotFoundException ex) {
            log.error("NotFoundException: {}", ex.getMessage());
        }
    }

    public void deleteById(Long id) {
        try {
            socialMediaLinkService.deleteById(id);
            System.out.printf("SocialMediaLink with id '%d' deleted!%n", id);
        } catch (NotFoundException ex) {
            log.error("NotFoundException: {}", ex.getMessage());
        }
    }

    public void update(SocialMediaLink address, String username) {

        try {
            SocialMediaLink updateSocialMediaLink = socialMediaLinkService.update(address, username);
            System.out.println("SocialMediaLink updated!");
            System.out.printf("SocialMediaLink after update: %s%n", updateSocialMediaLink);
        } catch (UsernameConflictException ex) {
            log.error("UsernameConflictException: {}", ex.getMessage());
        } catch (NotFoundException ex) {
            log.error("NotFoundException: {}", ex.getMessage());
        }
    }
}
```
</details>

---

## <div style="color: #ec5757">Pull Requests (PRs) Check</div>

---