package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * manjiang测试复杂结构
 *
 * @author auto create
 * @since 1.0, 2023-08-07 14:06:01
 */
public class ManjiangTestComplexOneData extends AlipayObject {

	private static final long serialVersionUID = 1785155181596538389L;

	/**
	 * 1
	 */
	@ApiField("sss")
	private String sss;

	/**
	 * 1
	 */
	@ApiField("ssssd")
	private Long ssssd;

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

	public Long getSsssd() {
		return this.ssssd;
	}
	public void setSsssd(Long ssssd) {
		this.ssssd = ssssd;
	}

	public String getTestLevelOne() {
		return this.testLevelOne;
	}
	public void setTestLevelOne(String testLevelOne) {
		this.testLevelOne = testLevelOne;
	}

}
