package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型同步线下测试
 *
 * @author auto create
 * @since 1.0, 2024-12-19 16:42:21
 */
public class KoubeiMemberDataOnlinetestRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2571928654761771671L;

	/**
	 * 基础参数
	 */
	@ApiField("demo_case")
	private String demoCase;

	/**
	 * 基础参数
	 */
	@ApiField("demo_cs")
	private String demoCs;

	/**
	 * 基础参数
	 */
	@ApiField("demo_cs_2")
	private String demoCs2;

	public String getDemoCase() {
		return this.demoCase;
	}
	public void setDemoCase(String demoCase) {
		this.demoCase = demoCase;
	}

	public String getDemoCs() {
		return this.demoCs;
	}
	public void setDemoCs(String demoCs) {
		this.demoCs = demoCs;
	}

	public String getDemoCs2() {
		return this.demoCs2;
	}
	public void setDemoCs2(String demoCs2) {
		this.demoCs2 = demoCs2;
	}

}
