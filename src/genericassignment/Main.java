package genericassignment;

import genericassignment.MyList;

public class Main {
    public static void main(String[] args) {

      MyList<Integer> list = new MyList<>();

        System.out.println(list.isEmpty() ? "Liste dolu" : "Liste boş");
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(20);
      list.add(50);
      list.add(60);
      list.add(70);
      System.out.println(list.isEmpty() ? "Liste dolu" : "Liste boş");


      System.out.println(list.isEmpty() ? "Liste dolu" : "Liste boş");




        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + list.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + list.indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + list.lastIndexOf(20));

      // Liste veri türünde alt bir liste oluşturdu
        MyList<Integer> mySubList = list.subList(0,4);
         mySubList.printArray();


      // Değerim listedeki olup olmadığını sorguladı
      System.out.println("Listemde 20 değeri : " + list.contains(20));
      System.out.println("Listemde 120 değeri : " + list.contains(120));
      System.out.println("Listemde 1 değeri : " + list.contains(1));

      // Listeyi Object[] dizisi olarak geri verir.
      Object[] dizi = list.toArray();
      System.out.println("Object dizisinin ilk elemanı: "+dizi[0]);

      // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
      list.clear();

      list.printArray();








































    }
}
