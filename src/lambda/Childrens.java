package lambda;

public class Childrens {

    public static void main(String[] args) {

        Children child1 = new Children () {

            String user = "Name : Alok ";

            @Override
            public String getname(){
                return this.user;
            }
        };

        Children child2 = () -> "Marks : 100 ";

        System.out.println(child1.getname());
        System.out.println(child2.getname());

    }
}