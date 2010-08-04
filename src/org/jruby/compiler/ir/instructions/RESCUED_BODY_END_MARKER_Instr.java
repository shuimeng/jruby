package org.jruby.compiler.ir.instructions;

import java.util.Map;
import java.util.List;

import org.jruby.compiler.ir.Operation;
import org.jruby.compiler.ir.operands.Operand;
import org.jruby.compiler.ir.representations.InlinerInfo;

public class RESCUED_BODY_END_MARKER_Instr extends IR_Instr
{
    private static Operand[] _empty = new Operand[] {};

    public RESCUED_BODY_END_MARKER_Instr() {
        super(Operation.RESCUE_BODY_END);
    }

    public Operand[] getOperands() { return _empty; }

    public void simplifyOperands(Map<Operand, Operand> valueMap) { }

    public IR_Instr cloneForInlining(InlinerInfo ii) { return this; }
}
