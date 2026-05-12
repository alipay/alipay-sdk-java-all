package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OPENID与UID排序测试01
 *
 * @author auto create
 * @since 1.0, 2026-03-06 14:29:37
 */
public class AlipaySecurityDataOpenidtestcaseRainytestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8694953387334485124L;

	/**
	 * demo
	 */
	@ApiField("demo")
	private String demo;

	/**
	 * 金额
	 */
	@ApiField("demo_price")
	private String demoPrice;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * OPENid 相关的映射类型
	 */
	@ApiField("openid_complex")
	private RainyComplexTypesTheThird openidComplex;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getDemo() {
		return this.demo;
	}
	public void setDemo(String demo) {
		this.demo = demo;
	}

	public String getDemoPrice() {
		return this.demoPrice;
	}
	public void setDemoPrice(String demoPrice) {
		this.demoPrice = demoPrice;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public RainyComplexTypesTheThird getOpenidComplex() {
		return this.openidComplex;
	}
	public void setOpenidComplex(RainyComplexTypesTheThird openidComplex) {
		this.openidComplex = openidComplex;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
