import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonBook {
    private List<Person> personList = new ArrayList<>();

    public List<Person> findPersonsByExperience(int experience){
        return personList.stream().filter(person -> person.getExperience() == experience).toList();
    }

    public List<Long> findPhonesByName(String name){
        return personList.stream()
                .filter(person -> person.getName().equals(name))
                .map(Person::getPhone)
                .toList();
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
