public class Person {

    //Atribute
    private String name = "Peter";
    private int age = 15;

    //Referenzen

    // Konstruktor
    public Person(){
        hallosagen();
    }

    //Methoden
    public void hallosagen(){
        System.out.println("Well hello there, are you a ginger?");
        System.out.println("Oh? You are! Then you have been suffering for " + age + " years.") ;
        System.out.println("So go to finish hospital KYS to get cured " + name + ";)");
    }
}