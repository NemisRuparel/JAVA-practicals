import java.util.*;
public class practical30 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Mohan");
        students.put(103, "Jayesh");
        students.put(104, "Ramesh");
        students.put(105, "Jay");

        int enrolmentNo = 103; 
        if (students.containsKey(enrolmentNo)) {
            System.out.println("Student with enrolment no " + enrolmentNo + " is " + students.get(enrolmentNo));
        } else {
            System.out.println("Enrolment number not found.");
        }

        System.out.println("\nAll students in HashMap:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Enrolment No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
