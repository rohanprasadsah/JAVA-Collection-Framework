import java.util.HashMap;
import java.util.Objects;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Person, String> map=new HashMap<>();

        Person p1=new Person("Sachin",1);
        Person p2=new Person("Dhoni",2);
        Person p3=new Person("Sachin",1);

        map.put(p1, "God");// hashcode1 --> index1
        map.put(p2, "Cool");// hashcode2 --> index2
        map.put(p3, "GOAT");// hashcode1 --> index1 --> equals --> replace


        System.out.println(map.size());
        System.out.println(map.get(p1));
        System.out.println(map.get(p3));
        System.out.println(map);
    }
}

class Person{
    String name;
    int id;
    public Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null) return false;
        if(getClass()!=obj.getClass()) return false;
        Person p=(Person) obj;
        return id==p.getId() && Objects.equals(name, p.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "id : "+id+", name : "+name;
    }
    
}