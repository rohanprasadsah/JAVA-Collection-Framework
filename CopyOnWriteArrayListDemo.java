import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        // List<String> cowal=new ArrayList<>();
        // cowal.add("Milk");
        // cowal.add("Eggs");
        // cowal.add("Bread");
        // System.out.println("Intial Shopping List : "+cowal);
        // for(String item:cowal){
        //     System.out.println(item);
        //     if(item.equals("Eggs")){
        //         cowal.add("Butter");
        //         System.out.println("Added elemnt Butter while Reading");
        //     }
        // }
        // System.out.println("Updated Shopping List : "+cowal);


        List<String> cowal=new CopyOnWriteArrayList<>();
        cowal.add("Milk");
        cowal.add("Eggs");
        cowal.add("Bread");
        System.out.println("Intial Shopping List : "+cowal);
        for(String item:cowal){
            System.out.println(item);
            if(item.equals("Eggs")){
                cowal.add("Butter");
                System.out.println("Added elemnt Butter while Reading");
            }
        }
        System.out.println("Updated Shopping List : "+cowal);
    }    
}
