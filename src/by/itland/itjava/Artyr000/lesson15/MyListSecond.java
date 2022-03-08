package by.itland.itjava.Artyr000.lesson15;

public class MyListSecond<T> {
    private T[] array;
    private int capacity = 10;
    private int current = 0;

    public MyListSecond() {
        this.array = (T[]) new Object[capacity];
    }

    public boolean add(T element) {
        if (current == capacity) {
            capacity = (int) (capacity * 1.5);
            T[] newArr = (T[]) new Object[capacity + 1];
            for (int i = 0; i < array.length; i++) {
                newArr[i] = array[i];
            }
            array = newArr;
        }
            array[current++] = element;
            capacity++;
            return true;
        }
        public T get ( int index){
            return array[index];
        }
        public void remove ( int index){
            T[] newArr = (T[]) new Object[capacity - 1];
            for (int i = 0; i < index; i++) {
                newArr[i] = array[i];
            }
            for (int i = index; i < newArr.length; i++) {
                newArr[i] = array[i + 1];
            }
            array = newArr;
            capacity--;


        }
            @Override
            public String toString () {
                StringBuilder sb = new StringBuilder("[");
                String del = "";
                for (int i = 0; i < array.length; i++) {
                    if (array[i] != null) {
                        sb.append(del).append(array[i]);
                        del = ", ";
                }
            }
            return sb.append("]").toString();
    }}
