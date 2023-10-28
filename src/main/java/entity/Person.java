package entity;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons")
@Entity
@IdClass(PersonId.class)
public class Person {
    @EmbeddedId
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;
    @Column(name = "phone_number")
    private int phoneNumber;
    @Column(name = "city_of_living")
    private String cityOfLiving;
}