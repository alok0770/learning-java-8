package lambda;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

    String name ;
    int marks;


    public Student (String name , int marks){

        this.name = name;
        this.marks = marks;

    }

    @Override
    public String toString(){
        return  "Name -> " +  name + " -> Marks : " + marks;
    }
}
public class ComparatorString {

    public static void main(String[] args) {


        List<Student> student = new ArrayList<>();

        student.add(new Student ("Alok" , 100));
        student.add(new Student ("Rahul" , 45));
        student.add(new Student ("Amit" , 87));
        student.add(new Student ("Jimmy" , 91));
        student.add(new Student ("Oliver" , 50));
        student.add(new Student ("Piyush" , 76));
        student.add(new Student ("Aman" , 49));

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
