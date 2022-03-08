package by.itland.itjava.Artyr000.lesson15;

public class MyClassGeneric<T> {
    T a;
    T b;

    public MyClassGeneric(T a, T b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "MyClassGeneric{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
