import java.util.ArrayList;
import java.util.List;

public class PersonBook {
    private List<Person> personList = new ArrayList<>();

    public List<Person> findPersonsByExperience(int experience){
        return personList.stream().filter(person -> person.getExperience() == experience).toList();
    }

    public List<Person> findPersonsByPhone(long phone){
        return personList.stream().filter(person -> person.getPhone() == phone).toList();
    }

    public Person findPersonByNumber(int number){
        return personList.stream().filter(person -> person.getNumber() == number).findFirst().orElse(null);
    }

    public void addPerson(Person person){
        personList.add(person);
    }

    public List<Person> getPersonList(){
        return personList;
    }
}
