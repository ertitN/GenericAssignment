package genericassignment;

import java.util.Arrays;

public class MyList <T> {

    private T array[];
    private final int DEFAULT_VALUE = 10;
    
    public MyList() {

        array = (T[]) new Object[this.DEFAULT_VALUE];
    }


    public MyList(int capacity) {

        array = (T[]) new Object[capacity];

    }

    public int size() {
        int itemSize = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (array[i] != null) {
                itemSize++;
            }

        }

        System.out.println("Eleman sayısı " + itemSize);
        return itemSize;
    }


    public int getCapacity() {
        return this.array.length;
    }

    public void add(T data) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = data;
                break;
            }
            if (i == array.length - 1) {

                T[] tempArray = this.array;

                this.array = (T[]) new Object[this.getCapacity() * 2];

                for (int j = 0; j < tempArray.length; j++) {
                    this.array[j] = tempArray[j];
                }

            }
        }

    }


    public T get(int index) {

        if (index >= this.array.length || index < 0) {

            return null;
        } else {
            return this.array[index];
        }

    }

    public T[] remove(int index) {

        if (index >= this.array.length || index < 0) {

            System.out.println("Eleman silinemedi geçersiz index değeri.");
            return null;

        } else {
            this.array[index] = null;

            for (int i = index; i < this.array.length; i++) {
                if (i + 1 < this.array.length) {
                    this.array[i] = this.array[i + 1];
                    this.array[i + 1] = null;
                }
            }

            T[] tempArray = this.array;
            this.array = (T[]) new Object[tempArray.length - 1];
            this.array = Arrays.copyOfRange(tempArray, 0, tempArray.length - 1);

            return this.array;

        }
    }


    public void printArray() {
        System.out.print("[");
        for (int i = 0;i < array.length;i++) {
            if (this.array[i]!=null) {
                System.out.print(this.array[i]+"");
            }
            if(i+1 < array.length && array[i+1]!=null){
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println("");
    }


    public void set(int index, T data) {
        if (index >= this.array.length || index < 0) {
            System.out.println("Geçersiz index.");
        } else {
            this.array[index] = data;

        }


    }

    public int indexOf(T data){

        for(int i = 0;i<this.array.length; i++){

            if(data == this.array[i]){

                return i;
            }

        }
        return -1;

    }

    public boolean isEmpty(){

        for(int i = 0;i < this.array.length;i++){

            if(this.array[i]!=null){
                return true;
            }
        }

        return false;

    }

    public int lastIndexOf(T data){

        for(int i = array.length-1;i>= 0;i--){
            if(this.array[i] == data){
                return i;
            }
        }

        return -1;


    }


    public void clear(){
        this.array = (T[]) new Object[this.getCapacity()];

    }


    public MyList <T> subList(int start,int finish){
        MyList<T> subList = new MyList<> ((finish-start)+1);


        for(int i = start;i<=finish;i++){
            subList.add(this.array[i]);
        }

        return subList;




    }

    public boolean contains(T data){

        for(T i: this.array){
            if(i==data){
                return true;
            }

        }

        return false;

    }

    public T[] toArray(){

        Object[] arr = this.array;

        return (T[]) arr;

    }

}
