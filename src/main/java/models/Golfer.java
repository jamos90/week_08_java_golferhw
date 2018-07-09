package models;

import org.hibernate.annotations.CollectionId;

import javax.persistence.*;

@Entity
@Table (name="golfers")

public class Golfer {
    private String firstName;
    private String lastName;
    private int age;
    private  int handicap;
    private int id;

    public Golfer(String firstName, String lastName, int age, int  handicap){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.handicap = handicap;
    }

    public Golfer(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    public int getId(){
        return this.id;
    }

    @Column(name ="first_name")
    public String getFirstName() {
        return this.firstName;
    }

    @Column(name ="last_name")
    public String getLastName() {
        return this.lastName;
    }

    @Column(name = "age")
    public int getAge() {
        return this.age;
    }
    @Column(name= "handicap")
    public int getHandicap() {
        return this.handicap;
    }

    public String setFirstName(String newFirstName){
        return this.firstName = newFirstName;
    }

    public String setLastName(String newLastName){
        return this.lastName = newLastName;
    }

    public int setAge(int newAge){
        return this.age = newAge;
    }

    public int setHandicap(int newHandicap){
        return this.handicap = newHandicap;
    }

    public int setId(int newId){
        return this.id = newId;
    }

}
