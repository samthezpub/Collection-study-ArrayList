import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main<T> {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Заур");
        arrayList.add("Иван");
        arrayList.add("Мария");

        ArrayList<String> arrayList1 = new ArrayList<>(arrayList);
//        System.out.println(arrayList1);


        // Методы
        // Add
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Заур");
        arrayList2.add("Иван");
        arrayList2.add("Мария");
        for (String s : arrayList2) {
//            System.out.println(s+ " ");
        }

        //Add с индексами
        ArrayList<String> arrayList3 = new ArrayList<>(5);
        arrayList3.add(0, "Иван");
        arrayList3.add(1, "Коля");
        arrayList3.add(1, "Мария");
        for (String s : arrayList3) {
            System.out.println(s + " ");
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


        // Arrays.asList
        String[] strings = {"23", "30", "Выф", "аф"};
        List<String> stringsList = Arrays.asList(strings);
        System.out.println(stringsList);
        // stringsList зависит от strings полностью. Если мы изменим что-то в массиве strings это отразится и на stringsList
        strings[0] = new String("НЕ ЭТО ЗНАЧЕНИЕ");
        System.out.println(stringsList);

        // removeAll
        ArrayList<String> existArrayList = new ArrayList<>();
        existArrayList.add("А");
        existArrayList.add("Б");
        existArrayList.add("В");
        existArrayList.add("Г");
        System.out.println(existArrayList);

        ArrayList<String> deleteArray = new ArrayList<>();
        deleteArray.add("Б");
        deleteArray.add("В");

        existArrayList.removeAll(deleteArray);
        System.out.println(existArrayList);

        // retainAll оставит только те элементы которые в передаваемой коллекции
        ArrayList<String> existArrayList1 = new ArrayList<>();
        existArrayList1.add("А");
        existArrayList1.add("Б");
        existArrayList1.add("В");
        existArrayList1.add("Г");
        System.out.println(existArrayList1);

        ArrayList<String> retainArray = new ArrayList<>();
        retainArray.add("Б");
        retainArray.add("В");

        existArrayList1.retainAll(retainArray);
        System.out.println(existArrayList1);

        // containsAll проверяет содержит ли Arraylist все элементы в передаваемой коллекции
        ArrayList<String> existArrayList2 = new ArrayList<>();
        existArrayList2.add("А");
        existArrayList2.add("Б");
        existArrayList2.add("В");
        existArrayList2.add("Г");
        System.out.println(existArrayList2);

        ArrayList<String> containsArray = new ArrayList<>();
        containsArray.add("Б");
        containsArray.add("В");


        System.out.println(existArrayList2.containsAll(containsArray));


        // subList режет массив по индексу, возвращает List, этот List связан с ArrayList'ом, по этому любая операция зеркалится
        ArrayList<String> existArray4 = new ArrayList<>();
        existArray4.add("А");
        existArray4.add("Б");
        existArray4.add("В");
        existArray4.add("Г");
        System.out.println(existArray4);

        // 1 индекс "включён", а второй надо по формуле желаемый индекс до + 1
        List<String > newList = existArray4.subList(1,4);
        newList.add("Абама");
        System.out.println(newList);
        System.out.println(existArray4);

        // Если в existArray4 добавить элемент не через List, то выскачет Exception
        existArray4.add("2");
        System.out.println(existArray4);
//        System.out.println(newList);// выскачет


        // toArray можно использовать для того чтобы указать определённый тип и преобразовать в массив
        ArrayList<String> existArray5 = new ArrayList<>();
        existArray5.add("1");
        existArray5.add("2");
        existArray5.add("3");
        existArray5.add("4");
        System.out.println(existArray5);

        String[] strings1 = existArray5.toArray(new String[5]);
        System.out.println(strings1);


        // listOf по сути делает List из предоставленных значений
        // этот лист нельзя изменять... Бросает Exception
        // UnModifiable list
        // Не может содержать null
        List<String> strings2 = List.of("Привет", "Костя", "как", "дела", "?");
        System.out.println(strings2);

        // copyOf копирует список
        // этот лист нельзя изменять... Бросает Exception
        // UnModifiable list
        // Не может содержать null
        List<String > strings3 = List.copyOf(strings2);
        System.out.println(strings3);
    }
}
