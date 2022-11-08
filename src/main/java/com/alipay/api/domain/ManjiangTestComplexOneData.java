package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * manjiang测试复杂结构
 *
 * @author auto create
 * @since 1.0, 2022-09-17 21:46:45
 */
public class ManjiangTestComplexOneData extends AlipayObject {

	private static final long serialVersionUID = 7772944286599915661L;

	/**
	 * 4
	 */
	@ApiField("test_level_one")
	private String testLevelOne;

	public String getTestLevelOne() {
		return this.testLevelOne;
	}
	public void setTestLevelOne(String testLevelOne) {
		this.testLevelOne = testLevelOne;
	}

}
