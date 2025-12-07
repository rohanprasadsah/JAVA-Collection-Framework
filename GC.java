import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
        WeakReference<Phone> wr=new WeakReference<Phone>(new Phone("iPhone","17 pro max"));
        System.out.println(wr.get());
        System.gc();
        try{
            Thread.sleep(10000);
        }
        catch(Exception e){

        }
        System.out.println(wr.get());
    }
}

class Phone{
    String name;
    String model;
    public Phone(String name, String model) {
        this.name = name;
        this.model = model;
    }
    @Override
    public String toString() {
        return "Phone [name=" + name + ", model=" + model + "]";
    }
}