package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈商场付业务多门店适用业务规则创建
 *
 * @author auto create
 * @since 1.0, 2023-08-15 11:14:27
 */
public class AlipayCommerceMallApplyruleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1829823691885417347L;

	/**
	 * 商圈mallid，由支付宝侧业务提供
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 规则过期时间内容
	 */
	@ApiField("rule_expire_time")
	private RuleExpireTime ruleExpireTime;

	/**
	 * 规则参数
	 */
	@ApiField("rule_limit_params")
	private RuleLimitCreateParams ruleLimitParams;

	/**
	 * 业务规则名称，便于商户进行区分
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 固定值，由支付宝侧业务提供
	 */
	@ApiField("rule_scene")
	private String ruleScene;

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public RuleExpireTime getRuleExpireTime() {
		return this.ruleExpireTime;
	}
	public void setRuleExpireTime(RuleExpireTime ruleExpireTime) {
		this.ruleExpireTime = ruleExpireTime;
	}

	public RuleLimitCreateParams getRuleLimitParams() {
		return this.ruleLimitParams;
	}
	public void setRuleLimitParams(RuleLimitCreateParams ruleLimitParams) {
		this.ruleLimitParams = ruleLimitParams;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleScene() {
		return this.ruleScene;
	}
	public void setRuleScene(String ruleScene) {
		this.ruleScene = ruleScene;
	}

}
