package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 强引用
 *
 * @author auto create
 * @since 1.0, 2025-03-07 18:47:25
 */
public class RainyComplexTypesTheEighth extends AlipayObject {

	private static final long serialVersionUID = 5758864643299823281L;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("case_string")
	private String caseString;

	/**
	 * 测试数据
	 */
	@ApiField("demo_case")
	private String demoCase;

	public String getCaseString() {
		return this.caseString;
	}
	public void setCaseString(String caseString) {
		this.caseString = caseString;
	}

	public String getDemoCase() {
		return this.demoCase;
	}
	public void setDemoCase(String demoCase) {
		this.demoCase = demoCase;
	}

}
