public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age >= 0) {
            this.age = age;
            return this;
        } else {
            throw new IllegalArgumentException("Возраст не соответсвует действительности! :" + age);
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        // проверка на незаполненость полей NAME и SURNAME
        if (this.name == null) {
            throw new IllegalArgumentException("Заполните обязательные поле NAME!");
        } else if (this.surname == null) {
            throw new IllegalArgumentException("Заполните обязательные поле SURNAME!");
        } else {
            return new Person(this);
        }
    }
}