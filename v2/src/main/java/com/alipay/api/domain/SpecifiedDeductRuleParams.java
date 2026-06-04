package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约环节指定代扣规则，自动续购场景引入
 *
 * @author auto create
 * @since 1.0, 2026-05-11 20:31:48
 */
public class SpecifiedDeductRuleParams extends AlipayObject {

	private static final long serialVersionUID = 5437148527686214746L;

	/**
	 * 签约时指定代扣金额，单位元，传入后后续代扣环节的金额必须等于该金额
	 */
	@ApiField("specified_pay_amount")
	private String specifiedPayAmount;

	/**
	 * 扣款条件额度数值，用于自动充场景下低于该额度时触发扣款，商户侧管控
	 */
	@ApiField("specified_pay_trigger_amount")
	private String specifiedPayTriggerAmount;

	/**
	 * 元/积分/游戏币
	 */
	@ApiField("specified_pay_trigger_unit")
	private String specifiedPayTriggerUnit;

	public String getSpecifiedPayAmount() {
		return this.specifiedPayAmount;
	}
	public void setSpecifiedPayAmount(String specifiedPayAmount) {
		this.specifiedPayAmount = specifiedPayAmount;
	}

	public String getSpecifiedPayTriggerAmount() {
		return this.specifiedPayTriggerAmount;
	}
	public void setSpecifiedPayTriggerAmount(String specifiedPayTriggerAmount) {
		this.specifiedPayTriggerAmount = specifiedPayTriggerAmount;
	}

	public String getSpecifiedPayTriggerUnit() {
		return this.specifiedPayTriggerUnit;
	}
	public void setSpecifiedPayTriggerUnit(String specifiedPayTriggerUnit) {
		this.specifiedPayTriggerUnit = specifiedPayTriggerUnit;
	}

}
