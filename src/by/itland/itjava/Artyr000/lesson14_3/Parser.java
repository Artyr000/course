package by.itland.itjava.Artyr000.lesson14_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public Var calculate(String text){
        String[] operands = text.trim().split(Patterns.OPERATION);
        Var leftOperand = Var.createVar(operands[0]);
        Var rightOperand = Var.createVar(operands[1]);

        Pattern pattern = Pattern.compile(Patterns.OPERATION);
        Matcher mather = pattern.matcher(text);
        if(mather.find()){
            String operation = mather.group();
            switch (operation){
                case "+": return leftOperand.add(rightOperand);
                case "-": return leftOperand.sub(rightOperand);
                case "*": return leftOperand.mul(rightOperand);
                case "/": return leftOperand.div(rightOperand);
            }
        }
        return null;
    }
}
