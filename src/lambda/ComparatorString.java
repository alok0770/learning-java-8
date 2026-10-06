package lambda;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    String name ;
    int marks;

    Student(String name , int marks){
        this.name = name;
        this.marks = marks;
    }



    @Override
    public String toString() {
        return "name : " + this.name + " Marks : " + this.marks;
    }
}
public class ComparatorString {

    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();

        student.add(new Student ("Alok" ,100));
        student.add(new Student("Oliver" ,87));
        student.add(new Student("Rahul" ,64));
        student.add(new Student("Vikas" ,55));
        student.add(new Student("Kartos" ,72));

        for(Student s : student){
            System.out.println(s);
        }
        Comparator<Student> topScores = (o1 , o2) -> (o2.marks - o1.marks);
        System.out.println();

        student.sort(topScores);
        System.out.println("After Sorting \n");
        for(Student s : student){
            System.out.println(s);
        }
    }
}
