    public class MainControl {

        //Attribute
        private Person person1;
        private Person person2, person3;

        //Konstruktor
        public static void main(String[] args) {
            //halloWelt();
            new MainControl();

        }

        public MainControl() {
            person1 = new Person("Peter", 17);
            person2 = new Person("Sabine", 15);

            person1.halloSagen();
            person2.halloSagen();


            System.out.println(person1);

            System.out.println(person2);
        }
    }
