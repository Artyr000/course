package by.itland.itjava.Artyr000.lesson15;

public class Runner {

    public static void main(String[] args) {
        MyListSecond<Integer> myListSecondInteger = new MyListSecond<>();
        myListSecondInteger.add(2);
        myListSecondInteger.add(3);
        myListSecondInteger.add(1);

        System.out.println(myListSecondInteger);
        System.out.println(myListSecondInteger.get(2));
        myListSecondInteger.remove(3);
        System.out.println(myListSecondInteger);
    }
}
