public class Main {
    public static void main(String[] args) {
        PersonBook personBook = new PersonBook();

        personBook.addPerson(new Person(1, "ivan", 89113874810L, 3));
        personBook.addPerson(new Person(2, "dima", 89113674818L, 3));
        personBook.addPerson(new Person(3, "peter", 87362347890L, 0));
        personBook.addPerson(new Person(4, "danila", 87362347890L, 1));

        System.out.println(personBook.findPersonByNumber(1));
        System.out.println(personBook.findPhonesByName("ivan"));
        System.out.println(personBook.findPersonsByExperience(3));
        System.out.println(personBook.getPersonList());
    }


}