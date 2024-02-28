package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试复杂类型a
 *
 * @author auto create
 * @since 1.0, 2024-01-18 15:26:31
 */
public class AlipaySecurityRiskJhjtestComplexddBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2491718313383516778L;

	/**
	 * 1111
	 */
	@ApiField("comple_a")
	private JhjTestNew compleA;

	/**
	 * 11
	 */
	@ApiField("regress")
	private String regress;

	public JhjTestNew getCompleA() {
		return this.compleA;
	}
	public void setCompleA(JhjTestNew compleA) {
		this.compleA = compleA;
	}

	public String getRegress() {
		return this.regress;
	}
	public void setRegress(String regress) {
		this.regress = regress;
	}

}
