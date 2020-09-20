class Student{
    private int rno;
    private String name;

    void set(int rollnum, String Stname)
    {
        rno=rollnum;
        name=Stname;
    }

    void show()
    {
        System.out.println(rno+"    "+name);
    }
}

class StudentDemo{
    public static void main(String args[]){
        Student s = new Student();
        s.set(39, "Jayant Khot");
        s.show();
    }
}