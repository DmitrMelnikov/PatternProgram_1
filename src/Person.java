import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.age = personBuilder.age;
        this.address = personBuilder.address;
    }

    public boolean hasAge() {
        if (this.age >= 0 && this.age < 120) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAddress() {
        if (this.address.isEmpty()) {
            this.address = "РОССИЯ";
            return false;
        } else {
            return true;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        if (this.age == 0) {
            return OptionalInt.of(this.age);
        } else {
            return OptionalInt.of(this.age);
        }
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge() == true) {
            this.age += 1;
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder son = new PersonBuilder();
        son.setAddress(this.address);
        son.setSurname(this.surname);
        return son;
    }

    @Override
    public String toString() {
        return " " + this.name + " " + this.surname + " возраст: " + this.age + " из " + this.address;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
