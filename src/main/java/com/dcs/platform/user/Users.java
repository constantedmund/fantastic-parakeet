package com.dcs.platform.user;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Users {

    @Id
    @SequenceGenerator(
            name="users_sequence",
            sequenceName = "users_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "users_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private int score;
    private boolean hasBadge;


    private LocalDate dob;


    public Users(){}

    public Users(Long id, String name, String email, int score, boolean hasBadge, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.score = score;
        this.hasBadge = hasBadge;
        this.dob = dob;
    }

    public Users(String name, String email, int score, boolean hasBadge, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.score = score;
        this.hasBadge = hasBadge;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isHasBadge() {
        return hasBadge;
    }

    public void setHasBadge(boolean hasBadge) {
        this.hasBadge = hasBadge;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", score=" + score +
                ", hasBadge=" + hasBadge +
                '}';
    }
}
