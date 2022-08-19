package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * manjiang测试复杂结构
 *
 * @author auto create
 * @since 1.0, 2022-08-16 19:25:03
 */
public class ManjiangTestComplexOneData extends AlipayObject {

	private static final long serialVersionUID = 6128628583389947532L;

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
