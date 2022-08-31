package lessons;

public class Teacher {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Maria";
        person1.lastname = "Pentovna";
        person1.age = 35;
        person1.subgect = "Literanure";
        System.out.println("Меня зовут "+person1.name + " моя фамилия "+person1.lastname +","+ " мне "+ person1.age +" и я преподаю "+person1.subgect);
        Person person2 = new Person();
        person2.name = "Ivan";
        person2.lastname = "Serebryakov";
        person2.age = 55;
        person2.subgect = "Math";
        System.out.println("Меня зовут "+person2.name + " моя фамилия "+person2.lastname +","+ " мне "+ person2.age +" и я преподаю "+person2.subgect);
    }
}
    class Person{
    String name;
    String lastname;
    String subgect;
    int age;
}
//        System.out.println("First name: Maria, " +
//                "Midle name: Ivanovna, " +
//                "Last name: Petrovna");

//        System.out.println("First name: Maria");
//        System.out.println("Midle name: Ivanovna");
//        System.out.println("Last name: Petrovna");

//        System.out.println(
//                "First name: Maria, \n"+
//                "Midle name: Ivanovna, \n" +
//                "Last name: Petrovna \n" +
//                "Age: 35 years old \n" +
//                "Subgect: Literanure"
//        );

//        int age = 35;
//
//        String firstName = "Maria";
//        String midleName = "Ivanovna";
//        String lastName = "Petrovna";
//        String subject = "Literanure";
//
//        System.out.println(
//                "First name: " + firstName +", \n"+
//                        "Midle name: " + midleName +", \n" +
//                        "Last name: " + lastName +", \n" +
//                        "Age: " + age + " years old, \n" +
//                        "Subgect: " + subject + "."
//        );
