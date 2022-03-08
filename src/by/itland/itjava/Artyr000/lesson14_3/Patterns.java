package by.itland.itjava.Artyr000.lesson14_3;

public final class Patterns {

    private Patterns(){}

        static final String OPERATION = "[-+*/]";
        static final String SCALAR = "-?(\\s*)?\\d+(\\s*)?(\\.\\d+)?";
        static final String VECTOR = "\\{((-?\\d+(\\.\\d+)?)(,?))+}";
        static final String MATRIX = "\\{(((\\{((-?\\d+(\\.\\d+)?)(,?)(\\s*))+))}(,?))+}";

}
