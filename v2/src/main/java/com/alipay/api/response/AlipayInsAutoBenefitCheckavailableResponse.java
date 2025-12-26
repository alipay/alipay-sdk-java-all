package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FrequencyRuleDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.benefit.checkavailable response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-30 14:41:41
 */
public class AlipayInsAutoBenefitCheckavailableResponse extends AlipayResponse {

	private static final long serialVersionUID = 8438571815195996664L;

	/** 
	 * 是否可以使用，0-否，1-是
	 */
	@ApiField("available")
	private String available;

	/** 
	 * 频次规则详情，为空表示没有频次规则限制
	 */
	@ApiField("frequency_rule_detail")
	private FrequencyRuleDetail frequencyRuleDetail;

	/** 
	 * available =0时有值，无使用资格的原因。no_qualification-没有资格，over_frequency-频次超限
	 */
	@ApiField("reason")
	private String reason;

	public void setAvailable(String available) {
		this.available = available;
	}
	public String getAvailable( ) {
		return this.available;
	}

	public void setFrequencyRuleDetail(FrequencyRuleDetail frequencyRuleDetail) {
		this.frequencyRuleDetail = frequencyRuleDetail;
	}
	public FrequencyRuleDetail getFrequencyRuleDetail( ) {
		return this.frequencyRuleDetail;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

}
