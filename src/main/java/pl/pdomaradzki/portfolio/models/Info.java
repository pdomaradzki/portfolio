package pl.pdomaradzki.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by jaizm on 16/06/2017.
 */

@Entity
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String skills;
    private String about1;
    private String about2;

    public Info() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getAbout1() {
        return about1;
    }

    public void setAbout1(String about1) {
        this.about1 = about1;
    }

    public String getAbout2() {
        return about2;
    }

    public void setAbout2(String about2) {
        this.about2 = about2;
    }
}
