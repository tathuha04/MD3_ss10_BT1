import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(1,10);
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());
        System.out.println(arrayList.clone());
        System.out.println(arrayList.indexOf(2));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.remove(4));
        System.out.println(arrayList.contains(2));


        Collection<?> objects = arrayList;
        System.out.println(arrayList.removeAll(objects));
        System.out.println(arrayList);

    }
}