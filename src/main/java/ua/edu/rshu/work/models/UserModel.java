package ua.edu.rshu.work.models;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class UserModel {

    @Id
    @GeneratedValue
    @Column(unique = true, name = "id")
    private int id;

    @NotNull
    @Column(unique = true, name = "login")
    private String login;

    @NotNull
    @Column(unique = true, name = "email")
    private String email;

    @Column(unique = false, name = "name")
    private String name;

    @Column(unique = false, name = "lastname")
    private String lastname;

    @NotNull
    @Column(unique = false, name = "password")
    private String password;

        /* Setters and getters */

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
