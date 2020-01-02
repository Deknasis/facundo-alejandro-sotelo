package com.finalProject.weatherApi.entity;


import javax.persistence.*;
import java.net.PasswordAuthentication;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "first_name", columnDefinition = "VARCHAR(40)")
    private String firstName;
    @Column(name = "last_name", columnDefinition = "VARCHAR(40)")
    private String lastName;
    @Column(name = "nickname", columnDefinition = "VARCHAR(25)")
    private String nickName;
    @Column(name = "user_age", columnDefinition = "VARCHAR(3)")
    private String age;
    @Column(name = "user_pass", columnDefinition = "VARCHAR(16)")
    private String password;

    public User(){}

    public User(String firstName, String lastName, String nickName, String age, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.age = age;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
