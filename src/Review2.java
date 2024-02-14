import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Mobile{
    Integer price;
    String Model;
    Mobile(int p, String m){
        this.price=p;
        this.Model=m;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "price=" + price +
                ", Model='" + Model + '\'' +
                '}';
    }
}
public class Review2 {
    public static void main(String[] args) {
        Mobile m = new Mobile(10000,"s23");
        Mobile m1 = new Mobile(16000,"J2");
        Mobile m2 = new Mobile(20000,"11");
        ArrayList<Mobile> mob = new ArrayList<>();
        mob.add(m);
        mob.add(m1);
        mob.add(m2);
        List<Mobile> arr = mob.stream().filter(a -> a.price > 15000).collect(Collectors.toList());
        System.out.println(arr);

    }
}