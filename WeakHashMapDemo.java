import java.util.WeakHashMap;

public class WeakHashMapDemo{
    static WeakHashMap<String,Image> map=new WeakHashMap<>();
    public static void main(String[] args) {
        loadCaching();
        System.out.println(map);
        System.gc();
        simulateWorking();
        System.out.println(map);
    }

    static public void loadCaching(){
        String k1=new String("img1");
        String k2=new String("img2");
        map.put(k1, new Image("Image 1"));
        map.put(k2, new Image("Image 2"));
    }

    public static void simulateWorking(){
        try{
            System.out.println("Simulating Application Running...");
            Thread.sleep(5000);
        }
        catch(Exception e){
        }
    }
}

class Image{
    String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}