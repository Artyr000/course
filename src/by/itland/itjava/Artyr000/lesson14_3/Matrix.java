package by.itland.itjava.Artyr000.lesson14_3;

public class Matrix extends Var {
    private  double[][] matr;

    public Matrix(double[][] matr) {
        this.matr = matr;
    }

    public Matrix(Matrix matr) {
        this.matr = matr.matr;
    }

    public Matrix(String matrix) {


        String[] split = matrix.trim().split("(},\\s*\\{)");
        int countRow = split.length;
        int countCol = split[0].split("\\s*,\\s*").length;
        double[][] arr = new double[countRow][countCol];

        for (int i = 0; i < countRow; i++) {
            split[i] = split[i].replaceAll("[{}]", "");
            String[] splitRow = split[i].split("\\s*,\\s*");
            for (int j = 0; j < splitRow.length; j++) {
                arr[i][j] = Double.parseDouble(splitRow[j]);
            }
        }
        this.matr = arr;

    }


    @Override
    public Var add(Var other) {
        if (other instanceof Matrix){
            Matrix operand2 = (Matrix) other;
            if (this.matr.length == operand2.matr.length){
                if (this.matr[0].length == operand2.matr[0].length){
                    double[][] arr = new double[this.matr.length][this.matr[0].length];
                    for (int i = 0; i<arr.length; i++){
                        for (int j = 0; j<arr.length; j++){
                            arr[i][j] = this.matr[i][j] + operand2.matr[i][j];
                        }
                    }
                    return new Matrix(arr);
                }
            }
        }
        else if(other instanceof Vector){
            return super.add(other);
        }
        else if (other instanceof Scalar){
            Scalar operand2 = (Scalar) other;
            double[][] arr = new double[this.matr.length][this.matr[0].length];
            for (int i = 0; i< arr.length; i++){
                for (int j = 0; j< arr.length; j++){
                    arr[i][j] = this.matr[i][j] + operand2.getValue();
                }
            }
            return new Matrix(arr);
        }
        return super.add(other);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Matrix){
            Matrix operand2 = (Matrix) other;
            if (this.matr.length == operand2.matr.length){
                if (this.matr[0].length == operand2.matr[0].length){
                    double[][] arr = new double[this.matr.length][this.matr[0].length];
                    for (int i = 0; i<arr.length; i++){
                        for (int j = 0; j<arr.length; j++){
                            arr[i][j] = this.matr[i][j] - operand2.matr[i][j];
                        }
                    }
                    return new Matrix(arr);
                }
            }
        }
        else if(other instanceof Vector){
            return super.sub(other);
        }
        else if (other instanceof Scalar){
            Scalar operand2 = (Scalar) other;
            double[][] arr = new double[this.matr.length][this.matr[0].length];
            for (int i = 0; i< arr.length; i++){
                for (int j = 0; j< arr.length; j++){
                    arr[i][j] = this.matr[i][j] - operand2.getValue();
                }
            }
            return new Matrix(arr);
        }
        return super.sub(other);
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Matrix){
            Matrix operand2 = (Matrix) other;
                if (this.matr[0].length == operand2.matr.length){
                    double[][] arr = new double[this.matr.length][operand2.matr[0].length];
                    for (int i = 0; i<this.matr.length; i++){
                        for (int j = 0; j<operand2.matr[0].length; j++){
                            for (int k = 0; k < arr.length; k++){
                                arr[i][j] += this.matr[i][k] * operand2.matr[k][j];
                            }

                        }
                    }
                    return new Matrix(arr);
                }
            }

        else if(other instanceof Vector){

            return super.mul(other);
        }
        else if (other instanceof Scalar){
            Scalar operand2 = (Scalar) other;
            double[][] arr = new double[this.matr.length][this.matr[0].length];
            for (int i = 0; i< arr.length; i++){
                for (int j = 0; j< arr.length; j++){
                    arr[i][j] = this.matr[i][j] * operand2.getValue();
                }
            }
            return new Matrix(arr);
        }
        return super.mul(other);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{{");
        for (int i = 0; i < matr.length; i++) {
            String del = "";
            for (int j = 0; j < matr[i].length; j++) {
                stringBuilder.append(del).append(matr[i][j]);
                del = ", ";
            }
            if(i != matr.length - 1){
                stringBuilder.append("}, {");
            }
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}