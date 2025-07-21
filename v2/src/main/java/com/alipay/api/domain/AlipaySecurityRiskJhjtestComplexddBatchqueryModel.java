package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试复杂类型a
 *
 * @author auto create
 * @since 1.0, 2024-06-06 10:34:56
 */
public class AlipaySecurityRiskJhjtestComplexddBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5229786975416673567L;

	/**
	 * 修改文档
	 */
	@ApiField("comple_a")
	private JhjTestNew compleA;

	/**
	 * 修改文档
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
