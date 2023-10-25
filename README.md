ArrayList может содержать дубликаты

ArrayList такой товарищ, что он создаётся по умолчанию с capacity 10, и если мы добавляем 11 элемент, то создаётся новый массив, с capacity 20

Сегодня узнал что можно указать capacity при создании ArrayList'a ArrayList<String> arraylist = new ArrayList<>(20);
20 - capacity

Так же можно создать ArrayList с элементами другого ArrayList'a, при чём это будут не ссылки, а полноценные значения
ArrayList<String> arraylis1 = new Arraylist<>(arrayList);