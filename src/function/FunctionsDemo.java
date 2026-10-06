package function;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class FunctionsDemo {
    public static void main(String[] args) {

        Function<String,Integer>  getLength = x -> x.length();
        Function<String,String>  getSubString = s -> s.substring(0,2);

        System.out.println("Length of 'Alok' : " + getLength.apply("Alok"));
        System.out.println("Word 'Alok' : " + getSubString.apply("Alok"));

        Function<List<Student>, List<Student>> studentWithAlAsPrefix = li -> {

            List<Student> result = new ArrayList<>();
            for(Student s : li){
                if(getSubString.apply(s.getName()).equalsIgnoreCase("Al")){
                    result.add(s);
                }
            }
            return result;
        };

        Student s1 = new Student(101,"Alok");
        Student s2 = new Student(102,"Aman");
        Student s3 = new Student(103,"Rahul");
        Student s4 = new Student(104,"Alex");
        Student s5 = new Student(105,"Oliver");

        List<Student> students = Arrays.asList(s1,s2,s3,s4,s5);
        List<Student> filteredStudents = studentWithAlAsPrefix.apply(students);
        System.out.println(filteredStudents);
    }

    private static class Student{

        private int id ;
        private String name;


        Student (int id , String name){
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
