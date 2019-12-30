package chapter12;

import java.util.Map;

public class GradeBook {

    public static void main(String[] args){

        Map<String, Integer> studentGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeupGrades = TestResults.getMakeUpGrades();

        for(var student: studentGrades.keySet()){
            if(studentGrades.get(student) < makeupGrades.get(student)){
                studentGrades.put(student, makeupGrades.get(student));
            }
        }

        System.out.println("Final Grades:");
        studentGrades.forEach(
                (student, grade) -> System.out.println(student + ": " + grade)
        );

    }
}
