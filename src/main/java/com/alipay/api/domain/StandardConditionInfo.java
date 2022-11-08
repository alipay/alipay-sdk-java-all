package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 使用规则条件列表
 *
 * @author auto create
 * @since 1.0, 2022-10-17 19:10:26
 */
public class StandardConditionInfo extends AlipayObject {

	private static final long serialVersionUID = 8182226838252534793L;

	/**
	 * 条件类型
QUOTA_TOTAL(有效期总额度),
QUOTA_DAY(日额度),
QUOTA_WEEK(周额度),
QUOTA_SEASON(季额度),
QUOTA_MONTH(月额度),
QUOTA_YEAR(年额度),
QUOTA_ONCE(单笔额度)，
ALARM_CLOCK_TIME(闹钟时间),
CARD_TYPE(卡类型),
COMBINED_PERIOD_QUOTA(多时间段额度),
PERIOD_TIME(多时间段),
PERIOD_QUOTA(时间段额度),
MCC(商户类型),
DISTRICT(消费区域限制),
MERCHANT(商户),
ISSUE_CITY(发放城市),
AREA(坐标围栏),
TAKE_AWAY_CATEGORY(外卖类目),
MEAL_MERCHANT(可选商户限制)，
SHIPPING_ADDRESS(收餐地址)，
BOOK_SWITCH(是否开启预订)，
MARKED_WORDS(提示单文案)，
SUPPLIER_CHANNEL(供应商渠道)，
ELM_MERCHANT(饿了么商户),
MULT_ISSUE_CITY(多发放城市)
	 */
	@ApiField("rule_factor")
	private String ruleFactor;

	/**
	 * 费控条件ID
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 费控条件名称 约束：敏感词校验
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 费控条件操作符 枚举值： LT("<","小于") LE("<=","小于等于") EQ("=","等于") NE("!=","不等于") GE(">=","大于等于") GT(">","大于")
	 */
	@ApiField("rule_operator")
	private String ruleOperator;

	/**
	 * 费控条件值 约束： 1）金额值以（元）为单位的数值，可以精确到小数点后两位。如费控维度：日额度（QUOTA_DAY）、周额度（QUOTA_WEEK）、月额度（QUOTA_MONTH）、季额度（QUOTA_SEASON）、年额度（QUOTA_YEAR）、有效期总额度（QUOTA_TOTAL）、单次额度（QUOTA_ONCE）对应的条件值； 2）时间段（ALARM_CLOCK_TIME）条件值按如下格式传入： 格式1：星期几格式（custom），节点支持monday/tuesday/wednesday/thursday/friday/saturday/sunday格式如下： { "custom": { "monday": [ ["12:00", "13:30"], ["12:00", "13:30"] ], "sunday": [ ["12:00", "13:30"] ] } } 格式2：工作日/节假日模式（regular），节点支持workday/holiday两种，格式如下： { "regular": { "workday": [ ["20:59", "22:01"] ], "holiday": [ ["20:59", "22:01"] ] } } 格式3：不限 { "all": true } 三种格式仅能选其一； 3）费控维度商户（MEAL_MERCHANT）和商户类型（MCC）条件值 MEAL_MERCHANT分为商户ID和门店ID两级，一个商户ID可对应多个门店ID； MCC分为一级MCC和二级MCC两级，一个一级MCC可对应多个二级MCC； 两者的格式均为： { "一级ID1": ["二级ID1", "二级ID2"]， "一级ID2": ["二级ID3", "二级ID4"]， } 特别：若二级ID不限，可以设置为-1 4）区域（DISTRICT）和地铁卡类型（CARD_TYPE）条件值 格式均为数组： ["ID1", "ID2"]
	 */
	@ApiField("rule_value")
	private String ruleValue;

	public String getRuleFactor() {
		return this.ruleFactor;
	}
	public void setRuleFactor(String ruleFactor) {
		this.ruleFactor = ruleFactor;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleOperator() {
		return this.ruleOperator;
	}
	public void setRuleOperator(String ruleOperator) {
		this.ruleOperator = ruleOperator;
	}

	public String getRuleValue() {
		return this.ruleValue;
	}
	public void setRuleValue(String ruleValue) {
		this.ruleValue = ruleValue;
	}

}
