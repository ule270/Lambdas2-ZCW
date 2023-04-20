import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestLocal {
    @Test
    public void testPersonChecker(){
        ArrayList<Person> people = new ArrayList<>();
        Person p = new Person("George", Person.Sex.MALE, "booyah@weh0tmail.com");
        people.add(new Person("Abby", Person.Sex.FEMALE, "girlsrule@weh0tmail.com"));
        people.add(new Person("Jenna", Person.Sex.FEMALE, "rockstar@weh0tmail.com"));
        people.add(p);

        String expected = p.printPerson() + "\n";
        String actual = PersonService.printPersons(people, new PersonChecker());
        Assert.assertEquals(expected, actual);

    }
}
