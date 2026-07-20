package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tree模型openApi测试接口_260127
 *
 * @author auto create
 * @since 1.0, 2026-05-25 10:42:13
 */
public class AlipayDataDataexchangeTreetestapiRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2478428715989641617L;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("demo")
	private String demo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("demo_0521")
	private String demo0521;

	/**
	 * 支付宝用户的测试。
	 */
	@ApiField("demo_0525")
	private String demo0525;

	public String getDemo() {
		return this.demo;
	}
	public void setDemo(String demo) {
		this.demo = demo;
	}

	public String getDemo0521() {
		return this.demo0521;
	}
	public void setDemo0521(String demo0521) {
		this.demo0521 = demo0521;
	}

	public String getDemo0525() {
		return this.demo0525;
	}
	public void setDemo0525(String demo0525) {
		this.demo0525 = demo0525;
	}

}
