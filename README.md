ArrayList #collections

В методе add можно дополнительно передавать в аргументы индекс и таким образом устанавливать его

Метод get возвращает элемент такого же типа как и тип ArrayList'a

Метод set заменяет значение по индексу

Метод remove (по индексу или по объекту)
// remove by object
arrayList3.remove("23");

//remove by index
arrayList3.remove(1);

по объекту если не равен через equals(), то не сработает.
Student st5 = new Student("Grisha", 13);
studentlist.add(st5);

Student st6 =new Student("Grisha", 13);
studentlist.remove(st6); // не сработает, потому что занимают разное место в памяти

studentlist.remove(st5); // сработает, потому что именно этот объект находится в списке, одинаковая память

Если мы переопределим внутри класса Student в этой ситуации equals, то тогда
Student st6 =new Student("Grisha", 13);
studentlist.remove(st6); // сработает, потому что equals переопределён и работает по другому


Метод addAll добавляет в текущую коллекцию другую коллекцию.
arrayList3.addAll(arrayList2);
System.out.println(arrayList3);

Метод clear очищает все элементы в массиве, capacity остаётся тот же, потому что память уже выделена и в этом методе она не переопределяется, а size равняется 0
arrayList3.clear();
System.out.println(arrayList3);

Метод indexOf ищет индекс элемента по объекту. Как и в remove использует equals, по этому важно переопределять этот метод внутри класса объекта.
System.out.println(arrayList3.indexOf("Арина"));
Так же если в листе несколько элементов с искомым значением то вернёт только индекс первого!

Метод lastIndexOf как понятно из названия возвращает индекс последнего найденного элемента в списке

System.out.println(arrayList3.lastIndexOf("Арина"));
Если бы у нас в списке было две Арины то вывелся индекс последней

Метод size возвращает размер листа (количество элементов в списке).
System.out.println(arrayList3.size());

Метод isEmpty возвращает true, если лист пуст и false если в нём есть хотя бы один элемент
System.out.println(arrayList3.isEmpty());

Метод contains(Object o) возвращает true, если в листе есть передаваемый объект и false если нет в листе такого объекта
arrayList3.contains("Мария");