package app;

class Person {

    private String name;
    private String profession;
    private int age;

    public Person (String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}

public class Main {

    public static void main(String[] args) {

        Person person01 = new Person("John", 30, "Інженер");
        Person person02 = new Person("Mary", 25, "Вчитель");
        Person person03 = new Person("Bob", 35, "Лікар");

        System.out.println("1. Ім'я: " + person01.getName() + ", Вік: " +
                person01.getAge() + ", Професія: " + person01.getProfession()
                + "\nІм'я: " + person02.getName() + ", Вік: " + person02.getAge()
                + ", Професія: " + person02.getProfession() +
                "\nІм'я: " + person03.getName() + ", Вік: " + person03.getAge()
                + ", Професія: " + person03.getProfession());

        Person person04 = new Person("Alice", 28, "Архітектор");

        System.out.println("\n2. Ім'я: " + person04.getName() + ", Вік: " +
                person04.getAge() + ", Професія: " + person04.getProfession());

        person04.setProfession("Дизайнер");

        System.out.println("(Після оновлення професії)" +
                "\nІм'я: " + person04.getName() + ", Вік: " +
                person04.getAge() + ", Професія: " + person04.getProfession());
    }
}