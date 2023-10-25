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
//        System.out.println(arrayList1);


        // Методы
        // Add
        ArrayList<String > arrayList2 = new ArrayList<>();
        arrayList2.add("Заур");
        arrayList2.add("Иван");
        arrayList2.add("Мария");
        for (String s : arrayList2){
//            System.out.println(s+ " ");
        }

        //Add с индексами
        ArrayList<String> arrayList3 = new ArrayList<>(5);
        arrayList3.add(0, "Иван");
        arrayList3.add(1, "Коля");
        arrayList3.add(1, "Мария");
        for (String s : arrayList3){
            System.out.println(s+ " ");
        }


        // get
        System.out.println(arrayList2.get(1));


        // set
        arrayList3.set(1, "23");
        System.out.println(arrayList3);

        // remove by object
        arrayList3.remove("23");

        //remove by index
        arrayList3.remove(1);
        System.out.println(arrayList3);


        //addAll
        arrayList3.addAll(arrayList2);
        System.out.println(arrayList3);

        //indexOf
        System.out.println(arrayList3.indexOf("Иван"));


        //lastIndexOf
        System.out.println(arrayList3.lastIndexOf("Иван"));


        //size
        System.out.println(arrayList3.size());

        // isEmpty
        System.out.println(arrayList3.isEmpty());

        // contains
        System.out.println(arrayList3.contains("Мария"));

        //clear
        arrayList3.clear();
        System.out.println(arrayList3);

        System.out.println(arrayList3.isEmpty());


    }
}
