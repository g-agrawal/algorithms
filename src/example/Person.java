package example;
import java.util.List;

public class Person {
    final private String name;
    final private int age;
    final private Gender gender;

    Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("AA", 10, Gender.MALE),
                new Person("BB", 20, Gender.FEMALE),
                new Person("CC", 30, Gender.FEMALE),
                new Person("DD", 40, Gender.MALE)
        );
    }
}
