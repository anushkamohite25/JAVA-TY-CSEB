class Student{
    int id;
    String name;
    int marks;
    Student(){
        id=1262241339;
        name="ANUSHKA MOHITE";
        marks=90;
    }
    Student(int id, String name){
        this.id=id;
        this.name=name;
        this.marks=90;
    }
    Student(int id, String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    void display(){
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
    public static void main(String[] args){
        System.out.println("Default Constructor:");
        Student s1=new Student();
        s1.display();
        System.out.println(" ");
        System.out.println("Parameterized Constructor:");
        Student s2=new Student(30, "Anushka Mohite");
        s2.display();
    }
}
