import java.util.ArrayList;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student("Shyam",4.8));
        al.add(new Student("Ram",9.8));
        al.add(new Student("Krishn",1.8));

        System.out.println(al);
        al.sort(null);
        System.out.println(al);
    }
}

class Student implements Comparable<Student>{
    String name;
    Double cgpa;
    public Student(String name, Double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", cgpa=" + cgpa + "]";
    }
    @Override
    public int compareTo(Student o) {
        return Double.compare(o.cgpa, this.cgpa);
    }
}
