package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * manjiang测试复杂结构
 *
 * @author auto create
 * @since 1.0, 2022-07-05 11:57:42
 */
public class ManjiangTestComplexOneData extends AlipayObject {

	private static final long serialVersionUID = 3819557557165892349L;

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
