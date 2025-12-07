import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> cld=new ConcurrentLinkedDeque<>();
        cld.addFirst("A1");
        cld.addLast("A2");
        cld.addFirst("A3");
        System.out.println(cld);

        System.out.println(cld.removeFirst());;
        System.out.println(cld.removeLast());;
        System.out.println(cld);
    }
}
