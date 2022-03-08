package by.itland.itjava.Artyr000.lesson14_3;

public class Runner {
    public static void main(String[] args) {
        Var scalar = new Scalar("5");
        Var scalar2 = new Scalar("5");
        Var vector = new Vector("{1, 2, 3}");
        Var vector2 = new Vector("{1, 2, 3}");
        Var matrix = new Matrix("{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}");
        Var matrix2 = new Matrix((Matrix) matrix);

        System.out.println(scalar.add(scalar2));
        System.out.println(scalar.sub(scalar2));
        System.out.println(scalar.mul(scalar2));
        System.out.println(scalar.div(scalar2));


        System.out.println(scalar.add(vector2));
        System.out.println(scalar.sub(vector2));
        System.out.println(scalar.mul(vector2));
        System.out.println(scalar.div(vector2));


        System.out.println(vector.add(vector2));
        System.out.println(vector.sub(vector2));
        System.out.println(vector.mul(vector2));
        System.out.println(vector.div(vector2));


        System.out.println(vector.add(scalar2));
        System.out.println(vector.sub(scalar2));
        System.out.println(vector.mul(scalar2));
        System.out.println(vector.div(scalar2));

        System.out.println("Операции с матрицами");
        System.out.println(matrix.add(matrix2));
        System.out.println(matrix.sub(matrix2));
        System.out.println(matrix.mul(matrix2));
        System.out.println(matrix.div(matrix2));

        System.out.println(matrix.add(scalar));
        System.out.println(matrix.sub(scalar));
        System.out.println(matrix.mul(scalar));
        System.out.println(matrix.div(scalar));

        System.out.println(matrix.add(vector));
        System.out.println(matrix.sub(vector));
        System.out.println(matrix.mul(vector));
        System.out.println(matrix.div(vector));
    }
}
