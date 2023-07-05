public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антон")
                .build();
        System.out.println(son.toString());
        son.happyBirthday();
        System.out.println(son.getAge());
        System.out.println(son.hasAge());
        System.out.println("У " + mom.toString() + " есть сын, " + son.toString());
        try {
            // Не хватает обязательных полей NAME и SURNAME
            new PersonBuilder().build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}