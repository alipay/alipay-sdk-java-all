package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 弱引用
 *
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:54
 */
public class RainysComplexRefSeventh extends AlipayObject {

	private static final long serialVersionUID = 2486884354734323658L;

	/**
	 * 测试数据ADD
	 */
	@ApiField("case_1")
	private String case1;

	/**
	 * 测试
	 */
	@ApiField("case_2")
	private Boolean case2;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("demo_case")
	private String demoCase;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	public String getCase1() {
		return this.case1;
	}
	public void setCase1(String case1) {
		this.case1 = case1;
	}

	public Boolean getCase2() {
		return this.case2;
	}
	public void setCase2(Boolean case2) {
		this.case2 = case2;
	}

	public String getDemoCase() {
		return this.demoCase;
	}
	public void setDemoCase(String demoCase) {
		this.demoCase = demoCase;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
