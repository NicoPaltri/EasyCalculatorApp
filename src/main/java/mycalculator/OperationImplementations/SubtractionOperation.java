package mycalculator.OperationImplementations;

import mycalculator.Operand;
import mycalculator.TwoOperandOperation;

public class SubtractionOperation extends TwoOperandOperation {
    public SubtractionOperation(Operand operand1, Operand operand2) {
        super(operand1, operand2);
    }

    protected double executeCalc() {
        return super.getOperand1().getValue() - super.getOperand2().getValue();
    }
}
