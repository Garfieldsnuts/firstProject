public class Person {

    //Attribute
    private String name;
    private int age;

    //Referenzen

    //Konstruktor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    //Methoden
    public void halloSagen(){
        System.out.println("Well hello there, are you a ginger?");
        System.out.println("Oh? You are! Then you have been suffering for " + age + " years.") ;
        System.out.println("So go to finish hospital KYS to get cured " + name + ";)");
    }
}