class Student{
    private int rno;
    private String name;
    public static int counter = 0;

   Student(int rollnum, String Stname)
    {
        rno=rollnum;
        name=Stname;
        counter++;
    }
}

class StudentCount{
    public static void main(String args[]){
        Student s1 = new Student(1, "jayant");
        Student s2 = new Student(2, "pavan");
        Student s3 = new Student(3, "Mayur");
        Student s4 = new Student(4, "Sanam");
        Student s5 = new Student(5, "Avinash");

        System.out.println("Total Objects count "+Student.counter);
    }
}
