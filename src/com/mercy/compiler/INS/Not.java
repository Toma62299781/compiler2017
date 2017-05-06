package com.mercy.compiler.INS;

import com.mercy.compiler.BackEnd.Translator;
import com.mercy.compiler.INS.Operand.Operand;

/**
 * Created by mercy on 17-5-4.
 */
public class Not extends Instruction {
    private Operand operand;

    public Not(Operand operand) {
        this.operand = operand;
    }

    public Operand operand() {
        return operand;
    }

    @Override
    public void accept(Translator translator) {
        translator.visit(this);
    }

    @Override
    public String toString() {
        return "not " + operand;
    }
}