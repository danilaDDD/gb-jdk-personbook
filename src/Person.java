public class Person {
    private final int number;
    private long phone;
    private String name;
    private int experience;

    public Person(int number, String name, long phone, int experience) {
        this.number = number;
        this.name = name;
        this.phone = phone;
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return String.format("{number=%s, name=%s, phone=%s, experience=%s}", number, name, phone, experience);
    }
}
