import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main<T> {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Заур");
        arrayList.add("Иван");
        arrayList.add("Мария");

        ArrayList<String > arrayList1 = new ArrayList<>(arrayList);
        System.out.println(arrayList1);
    }
}
