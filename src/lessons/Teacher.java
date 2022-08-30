package lessons;

public class Teacher {

    public static void main(String[] args) {

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

        int age = 35;

        String firstName = "Maria";
        String midleName = "Ivanovna";
        String lastName = "Petrovna";
        String subject = "Literanure";

        System.out.println(
                "First name: " + firstName +", \n"+
                        "Midle name: " + midleName +", \n" +
                        "Last name: " + lastName +", \n" +
                        "Age: " + age + " years old, \n" +
                        "Subgect: " + subject + "."
        );
    }
}
