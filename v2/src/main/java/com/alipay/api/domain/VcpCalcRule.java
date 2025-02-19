package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 折扣计算规则
 *
 * @author auto create
 * @since 1.0, 2022-11-14 19:37:39
 */
public class VcpCalcRule extends AlipayObject {

	private static final long serialVersionUID = 5425616932334316483L;

	/**
	 * 计算条件
	 */
	@ApiField("calc_condition")
	private VcpCalcCondition calcCondition;

	/**
	 * 计算公式
	 */
	@ApiField("calc_formula")
	private VcpCalcFormula calcFormula;

	public VcpCalcCondition getCalcCondition() {
		return this.calcCondition;
	}
	public void setCalcCondition(VcpCalcCondition calcCondition) {
		this.calcCondition = calcCondition;
	}

	public VcpCalcFormula getCalcFormula() {
		return this.calcFormula;
	}
	public void setCalcFormula(VcpCalcFormula calcFormula) {
		this.calcFormula = calcFormula;
	}

}
