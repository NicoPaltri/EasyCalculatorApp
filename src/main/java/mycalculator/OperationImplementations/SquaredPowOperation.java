package mycalculator.OperationImplementations;

import mycalculator.OneOperandOperation;
import mycalculator.Operand;

public class SquaredPowOperation extends OneOperandOperation {
    public SquaredPowOperation(Operand operand1, Operand operand2) {
        super(operand1, operand2);
    }

    protected double executeCalc() {
        return super.getOperand1().getValue() * super.getOperand1().getValue();
    }
}
