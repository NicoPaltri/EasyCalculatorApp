package mycalculator.OperationImplementations;

import mycalculator.Operand;
import mycalculator.TwoOperandOperation;

public class DivisionOperation extends TwoOperandOperation {
    public DivisionOperation(Operand operand1, Operand operand2) {
        super(operand1, operand2);
    }

    protected double executeCalc() throws IllegalArgumentException {
        if (super.getOperand2().getValue() == 0) {
            throw new IllegalArgumentException("Il divisore è 0");
        }

        return super.getOperand1().getValue() / super.getOperand2().getValue();
    }
}
