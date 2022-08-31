package lessons;

public class Student {

    public static void main(String[] args) {
        Pupils person3 = new Pupils();
        person3.name = "Vova";
        person3.lastname = "Sidorov";
        person3.age = 10;
        System.out.println("Меня зовут " + person3.name + " моя фамилия " + person3.lastname + "," + " мне " + person3.age);
        System.out.println("********************************************");
        Person person4 = new Person();
        person4.name = "Masha";
        person4.lastname = "Semenova";
        person4.age = 14;
        System.out.println("Меня зовут " + person3.name + " моя фамилия " + person4.lastname + "," + " мне " + person4.age);
        System.out.println("********************************************");
    }
}
    class Pupils{
        String name;
        String lastname;
        int age;
}
