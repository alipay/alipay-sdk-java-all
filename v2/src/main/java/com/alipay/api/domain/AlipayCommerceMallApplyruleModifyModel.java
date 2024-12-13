package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈商场付业务多门店适用业务规则编辑
 *
 * @author auto create
 * @since 1.0, 2024-11-12 13:40:09
 */
public class AlipayCommerceMallApplyruleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1444453462919188451L;

	/**
	 * 商圈门店规则id，规则创建接口执行成功之后返回该值
	 */
	@ApiField("biz_rule_id")
	private String bizRuleId;

	/**
	 * 商圈mallid，由支付宝侧业务提供
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 规则过期时间
	 */
	@ApiField("rule_expire_time")
	private RuleExpireTime ruleExpireTime;

	/**
	 * 规则参数
	 */
	@ApiField("rule_limit_params")
	private RuleLimitModifyParams ruleLimitParams;

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

	public RuleExpireTime getRuleExpireTime() {
		return this.ruleExpireTime;
	}
	public void setRuleExpireTime(RuleExpireTime ruleExpireTime) {
		this.ruleExpireTime = ruleExpireTime;
	}

	public RuleLimitModifyParams getRuleLimitParams() {
		return this.ruleLimitParams;
	}
	public void setRuleLimitParams(RuleLimitModifyParams ruleLimitParams) {
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
