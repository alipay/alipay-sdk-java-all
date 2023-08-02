package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * manjiang测试复杂结构
 *
 * @author auto create
 * @since 1.0, 2023-07-31 17:17:44
 */
public class ManjiangTestComplexOneData extends AlipayObject {

	private static final long serialVersionUID = 3678153156543791328L;

	/**
	 * 1
	 */
	@ApiField("sss")
	private String sss;

	/**
	 * 4
	 */
	@ApiField("test_level_one")
	private String testLevelOne;

	public String getSss() {
		return this.sss;
	}
	public void setSss(String sss) {
		this.sss = sss;
	}

	public String getTestLevelOne() {
		return this.testLevelOne;
	}
	public void setTestLevelOne(String testLevelOne) {
		this.testLevelOne = testLevelOne;
	}

}
