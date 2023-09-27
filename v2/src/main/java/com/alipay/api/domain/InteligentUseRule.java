package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能营销活动使用规则信息
 *
 * @author auto create
 * @since 1.0, 2018-01-22 17:04:20
 */
public class InteligentUseRule extends AlipayObject {

	private static final long serialVersionUID = 8318723484487846434L;

	/**
	 * 券的不可用时间
	 */
	@ApiField("inteligent_forbidden_time")
	private InteligentForbiddenTime inteligentForbiddenTime;

	/**
	 * 券可用时间段
	 */
	@ApiListField("inteligent_use_times")
	@ApiField("inteligent_use_time")
	private List<InteligentUseTime> inteligentUseTimes;

	/**
	 * 优惠券的使用支付渠道限制规
则，
不受支付渠道限制
:USE_NO_LIMIT;
仅限口碑储值卡支付时可用
:USE_ON_CURRENT_PAY_C
HANNEL;
口碑储值卡支付时不可用
:NOT_ALLOWED_USE;
【备注】支付渠道限制不允许修改
	 */
	@ApiField("limit_rule")
	private String limitRule;

	/**
	 * 券核销的最低消费门槛，单位元
	 */
	@ApiField("min_consume")
	private String minConsume;

	/**
	 * 核券门槛-最低消费金额-推荐约束；
提供推荐方案参数可调区间范围, 为空则认为不可调
	 */
	@ApiField("min_consume_condition")
	private InteligentDataCondition minConsumeCondition;

	/**
	 * 券买单跳转链接
	 */
	@ApiField("pay_redirect_url")
	private String payRedirectUrl;

	/**
	 * 券适用门店列表
仅品牌商发起的招商活动可为空
直发奖类型活动必须与活动适用门店一致
最多支持10w家门店
	 */
	@ApiListField("suit_shops")
	@ApiField("string")
	private List<String> suitShops;

	public InteligentForbiddenTime getInteligentForbiddenTime() {
		return this.inteligentForbiddenTime;
	}
	public void setInteligentForbiddenTime(InteligentForbiddenTime inteligentForbiddenTime) {
		this.inteligentForbiddenTime = inteligentForbiddenTime;
	}

	public List<InteligentUseTime> getInteligentUseTimes() {
		return this.inteligentUseTimes;
	}
	public void setInteligentUseTimes(List<InteligentUseTime> inteligentUseTimes) {
		this.inteligentUseTimes = inteligentUseTimes;
	}

	public String getLimitRule() {
		return this.limitRule;
	}
	public void setLimitRule(String limitRule) {
		this.limitRule = limitRule;
	}

	public String getMinConsume() {
		return this.minConsume;
	}
	public void setMinConsume(String minConsume) {
		this.minConsume = minConsume;
	}

	public InteligentDataCondition getMinConsumeCondition() {
		return this.minConsumeCondition;
	}
	public void setMinConsumeCondition(InteligentDataCondition minConsumeCondition) {
		this.minConsumeCondition = minConsumeCondition;
	}

	public String getPayRedirectUrl() {
		return this.payRedirectUrl;
	}
	public void setPayRedirectUrl(String payRedirectUrl) {
		this.payRedirectUrl = payRedirectUrl;
	}

	public List<String> getSuitShops() {
		return this.suitShops;
	}
	public void setSuitShops(List<String> suitShops) {
		this.suitShops = suitShops;
	}

}
