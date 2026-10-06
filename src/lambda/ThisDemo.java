package lambda;

public class ThisDemo {

    String name = "Outer class";

    public void testThis() {


        //Anonymous class
        Display d1 = new Display() {

            String name = "AIC inner class ";

            @Override
            public void display() {
                System.out.println("AIC 'this.name ' -> " + this.name);
            }
        };

        // Lambda Expression
        Display d2 = () -> System.out.println("Lambda 'this.name' -> " + this.name);

        d1.display();
        d2.display();
    }

    static void main(String[] args) {
        ThisDemo demo = new ThisDemo();
        demo.testThis();
    }

}

