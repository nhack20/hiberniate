package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "user_data", schema = "todolist", catalog = "jusandatabase")
public class UserDataEntity {
    @Basic
    @Column(name = "email", nullable = false, length = -1)
    private String email;
    @Basic
    @Column(name = "userpassword", nullable = false, length = -1)
    private String userpassword;
    @Basic
    @Column(name = "username", nullable = false, length = -1)
    private String username;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}