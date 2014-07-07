package org.evosuite.symbolic.vm;

import org.evosuite.symbolic.expr.bv.IntegerValue;

/**
 * 
 * @author galeotti
 *
 */
public final class Bv64Operand implements DoubleWordOperand, IntegerOperand {
	private final IntegerValue integerExpr;

	public Bv64Operand(IntegerValue integerExpr) {
		this.integerExpr = integerExpr;
	}

	@Override
	public IntegerValue getIntegerExpression() {
		return integerExpr;
	}
	
	@Override
	public String toString() {
		return integerExpr.toString();
	}
}