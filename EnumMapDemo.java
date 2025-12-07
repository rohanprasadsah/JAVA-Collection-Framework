import java.util.EnumMap;

public class EnumMapDemo {
    public static void main(String[] args) {
        EnumMap<Day,String> map=new EnumMap<>(Day.class);
        map.put(Day.Saturday, "Day 6");
        map.put(Day.Sunday, "Day 7");
        map.put(Day.Thursday, "Day 4");
        map.put(Day.Tuesday, "Day 2");
        map.put(Day.Monday, "Day 1");
        map.put(Day.Friday, "Day 5");
        map.put(Day.Wednesday, "Day 3");
        System.out.println(map);
        System.out.println(map.get(Day.Saturday));
    }
}

enum Day{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}