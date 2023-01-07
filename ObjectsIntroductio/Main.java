package ObjectsIntroductio;
public class Main {

    public static void main(String[] args) {
        System.out.println("first git oops");
        Student student1 = new Student("ram", 49, "CSE");
        Student student2 = new Student("raju", 26, "CIVIL");
        Student student3 = new Student(54);
        Student student4 = new Student();
        student4.greeting();
        Student sample5 = new Student();
        //as we are coding in gitCodeSpace we have to intialize the samepl5 in order to initiate in the Studet(Student otherObjectReference)
        Student constructorOverloadingeExample= new Student(sample5);
        System.out.println(sample5.department);

    }

}

class Student {
    String name;
    int rollno;
    String department;
    
   //calling constructor from another constructor
    // Student(){
    //     this ("call Constructor",23,"from another constructor");
    // }

    Student(String nam, int rno, String dep) {
        this.name = nam;
        this.rollno = rno;
        this.department = dep;
    }

    // this can be the construction overloading.
    // as multiple times we defined the constructor passing different variables.
    // objects can call anyone of the constructor depending upon the usege of class
    // items
    Student(int rno) {
        this.rollno = rno;
    }

    // Student() {

    //     this.name = name;
    //     // this will be replaced by the object .
    //     // inorder to use the class items this will help the object to insantiate
    //     // through the this keyword
    //     // this.name="guna";

    // }

    void greeting() {
        System.out.println("hi my name is " + this.name);
    }

    Student (Student otherObjectReference){
        this.name=otherObjectReference.name;
        this.department=otherObjectReference.department;
        this.rollno=otherObjectReference.rollno;
    }

//this is a sample constructor overloading in the when Student(Student otherObjectReference) is initialized.
    Student(){
        this.name="Constructor overloading";
        this.department="this constructor is being called in the place of Student(Student other)";
        this.rollno=32;
    }

}