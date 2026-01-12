package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 匿名复杂类型
 *
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:18
 */
public class RainysComplexRefFirst extends AlipayObject {

	private static final long serialVersionUID = 2499242337949425664L;

	/**
	 * 子参数
	 */
	@ApiField("case_string")
	private String caseString;

	public String getCaseString() {
		return this.caseString;
	}
	public void setCaseString(String caseString) {
		this.caseString = caseString;
	}

}
