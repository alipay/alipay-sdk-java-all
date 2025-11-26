package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻车主名片顺风车主评价信息
 *
 * @author auto create
 * @since 1.0, 2025-10-21 20:37:42
 */
public class ZmCarOwnerEvaluateInfo extends AlipayObject {

	private static final long serialVersionUID = 7282592214273715728L;

	/**
	 * 芝麻车主名片顺风车主的投诉率，用小数表示，原则上精确到小数点后四位
	 */
	@ApiField("investment_rate")
	private String investmentRate;

	/**
	 * 芝麻车主名片顺风车主的准时率，用小数表示，原则上精确到小数点后四位
	 */
	@ApiField("on_time_rate")
	private String onTimeRate;

	/**
	 * 芝麻车主名片顺风车主的好评率，用小数表示，原则上精确到小数点后四位
	 */
	@ApiField("positive_feedback_rate")
	private String positiveFeedbackRate;

	public String getInvestmentRate() {
		return this.investmentRate;
	}
	public void setInvestmentRate(String investmentRate) {
		this.investmentRate = investmentRate;
	}

	public String getOnTimeRate() {
		return this.onTimeRate;
	}
	public void setOnTimeRate(String onTimeRate) {
		this.onTimeRate = onTimeRate;
	}

	public String getPositiveFeedbackRate() {
		return this.positiveFeedbackRate;
	}
	public void setPositiveFeedbackRate(String positiveFeedbackRate) {
		this.positiveFeedbackRate = positiveFeedbackRate;
	}

}
