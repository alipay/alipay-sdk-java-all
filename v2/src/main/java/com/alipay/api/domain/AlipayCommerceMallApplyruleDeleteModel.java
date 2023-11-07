package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈商场付业务多门店适用业务规则删除
 *
 * @author auto create
 * @since 1.0, 2023-08-15 11:20:17
 */
public class AlipayCommerceMallApplyruleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3253786413612822341L;

	/**
	 * 商圈商场付多门店业务规则id，调用创建接口返回的值
	 */
	@ApiField("biz_rule_id")
	private String bizRuleId;

	/**
	 * 商圈mallid，由支付宝侧业务提供
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 指定值，由支付宝侧业务提供
	 */
	@ApiField("rule_scene")
	private String ruleScene;

	public String getBizRuleId() {
		return this.bizRuleId;
	}
	public void setBizRuleId(String bizRuleId) {
		this.bizRuleId = bizRuleId;
	}

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getRuleScene() {
		return this.ruleScene;
	}
	public void setRuleScene(String ruleScene) {
		this.ruleScene = ruleScene;
	}

}
