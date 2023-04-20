import java.time.LocalDate;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        return 0;
    }

    public Person(String name, Sex gender, String emailAddress) {
        this.name = name;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public String printPerson() {
        System.out.println(toString());
        return toString();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}