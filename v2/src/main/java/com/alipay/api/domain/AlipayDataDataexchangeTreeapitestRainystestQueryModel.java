package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tree模型的测试接口1104
 *
 * @author auto create
 * @since 1.0, 2025-11-04 17:27:29
 */
public class AlipayDataDataexchangeTreeapitestRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6141969173714586794L;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("demo")
	private String demo;

	/**
	 * 支付宝用户的userId。 当前字段已废弃(可选参数，废弃原因测试)
	 */
	@ApiField("demo_choice")
	@Deprecated
	private String demoChoice;

	/**
	 * 支付宝用户的userId。 当前字段已废弃(特殊可选参数，废弃原因测试)
	 */
	@ApiField("demo_sp")
	@Deprecated
	private String demoSp;

	public String getDemo() {
		return this.demo;
	}
	public void setDemo(String demo) {
		this.demo = demo;
	}

	public String getDemoChoice() {
		return this.demoChoice;
	}
	public void setDemoChoice(String demoChoice) {
		this.demoChoice = demoChoice;
	}

	public String getDemoSp() {
		return this.demoSp;
	}
	public void setDemoSp(String demoSp) {
		this.demoSp = demoSp;
	}

}
