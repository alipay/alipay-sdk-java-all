package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型接口测试34_OB切换验证
 *
 * @author auto create
 * @since 1.0, 2025-07-10 17:47:30
 */
public class AlipayDataDataexchangeSchemaapithirtyfouthRainstestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3164117919658924888L;

	/**
	 * 测试数据无需关注
	 */
	@ApiField("demo")
	private String demo;

	/**
	 * 测试数据，需关注
	 */
	@ApiField("demo_case")
	private String demoCase;

	/**
	 * 测试数据无需关注
	 */
	@ApiField("open_id")
	private String openId;

	public String getDemo() {
		return this.demo;
	}
	public void setDemo(String demo) {
		this.demo = demo;
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
