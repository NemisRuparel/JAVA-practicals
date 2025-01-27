// Aim:  Write  a  program  in  Java  which  has  a  class  Student  having  two  instance  variables 
// enrollmentNo  and  name.  Create  3  objects  of  Student  class  in  main  method  and  display 
// student’s name
class Student{
    int enrollmentNo;
    String name;
}

class practical6{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        s1.enrollmentNo = 1;
        s1.name = "ABC";
        System.out.println("Name of Student 1 is : "+s1.name);

        Student s2 = new Student();
        s2.enrollmentNo = 2;
        s2.name = "DEF";
        System.out.println("Name of Student 2 is : "+s2.name);
        
        Student s3 = new Student();
        s3.enrollmentNo = 3;
        s3.name = "GHI";
        System.out.println("Name of Student 3 is : "+s2.name);


    }
}