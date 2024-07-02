package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包营销规则对象
 *
 * @author auto create
 * @since 1.0, 2024-03-29 19:08:22
 */
public class WalletMarketingRule extends AlipayObject {

	private static final long serialVersionUID = 5441565546563112588L;

	/**
	 * 营销类型
	 */
	@ApiField("ma_type")
	private String maType;

	/**
	 * 营销值
	 */
	@ApiField("ma_value")
	private String maValue;

	/**
	 * 退营销金额，单位：元
	 */
	@ApiField("refund_marketing_amount")
	private String refundMarketingAmount;

	public String getMaType() {
		return this.maType;
	}
	public void setMaType(String maType) {
		this.maType = maType;
	}

	public String getMaValue() {
		return this.maValue;
	}
	public void setMaValue(String maValue) {
		this.maValue = maValue;
	}

	public String getRefundMarketingAmount() {
		return this.refundMarketingAmount;
	}
	public void setRefundMarketingAmount(String refundMarketingAmount) {
		this.refundMarketingAmount = refundMarketingAmount;
	}

}
