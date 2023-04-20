public class PersonChecker implements CheckPerson{
    @Override
    public boolean test(Person p) {
        return p.gender == Person.Sex.MALE;
    }
}
