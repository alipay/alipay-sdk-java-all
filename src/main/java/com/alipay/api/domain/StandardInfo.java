package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 使用规则列表
 *
 * @author auto create
 * @since 1.0, 2022-08-29 20:53:27
 */
public class StandardInfo extends AlipayObject {

	private static final long serialVersionUID = 2862513957215661116L;

	/**
	 * 消费模式，不填为默认模式，枚举值：COUPON_ONLY（仅支持点券）
COUPON_AND_CAP（支持点券+余额）
DEFAULT（默认模式）
点券：消费时找员工的点券，没有或者用完了不可付；
点券+余额：消费时找员工的点券，没有找员工的余额，没有或者用完了不可付。
默认：有给员工设置员工余额以员工余额为准，用完为止。否则只受规则里的限额和企业账户资金上限管控；
	 */
	@ApiField("consume_mode")
	private String consumeMode;

	/**
	 * 开票规则id
	 */
	@ApiField("open_rule_id")
	private String openRuleId;

	/**
	 * 外部使用规则id，制度内使用规则该字段不允许重复
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 支付策略 当笔消费金额大于规则可用余额时，用于控制支付策略，该字段缺省时采取因公账户和个人账户组合支付策略， 枚举值：PERSONAL（全部个人账户支付）, COMBINATION（因公账户和个人账户组合支付）
	 */
	@ApiField("payment_policy")
	private String paymentPolicy;

	/**
	 * 使用规则条件列表
	 */
	@ApiListField("standard_condition_info_list")
	@ApiField("standard_condition_info")
	private List<StandardConditionInfo> standardConditionInfoList;

	/**
	 * 规则名称
	 */
	@ApiField("standard_name")
	private String standardName;

	public String getConsumeMode() {
		return this.consumeMode;
	}
	public void setConsumeMode(String consumeMode) {
		this.consumeMode = consumeMode;
	}

	public String getOpenRuleId() {
		return this.openRuleId;
	}
	public void setOpenRuleId(String openRuleId) {
		this.openRuleId = openRuleId;
	}

	public String getOuterSourceId() {
		return this.outerSourceId;
	}
	public void setOuterSourceId(String outerSourceId) {
		this.outerSourceId = outerSourceId;
	}

	public String getPaymentPolicy() {
		return this.paymentPolicy;
	}
	public void setPaymentPolicy(String paymentPolicy) {
		this.paymentPolicy = paymentPolicy;
	}

	public List<StandardConditionInfo> getStandardConditionInfoList() {
		return this.standardConditionInfoList;
	}
	public void setStandardConditionInfoList(List<StandardConditionInfo> standardConditionInfoList) {
		this.standardConditionInfoList = standardConditionInfoList;
	}

	public String getStandardName() {
		return this.standardName;
	}
	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}

}
