package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包营销规则对象
 *
 * @author auto create
 * @since 1.0, 2025-07-11 19:23:09
 */
public class WalletMarketingRule extends AlipayObject {

	private static final long serialVersionUID = 5638338891527474191L;

	/**
	 * 营销类型
	 */
	@ApiField("ma_type")
	private String maType;

	/**
	 * 营销值，单位：%
	 */
	@ApiField("ma_value")
	private String maValue;

	/**
	 * 指定退款账户
	 */
	@ApiField("refund_marketing_account_no")
	private String refundMarketingAccountNo;

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

	public String getRefundMarketingAccountNo() {
		return this.refundMarketingAccountNo;
	}
	public void setRefundMarketingAccountNo(String refundMarketingAccountNo) {
		this.refundMarketingAccountNo = refundMarketingAccountNo;
	}

	public String getRefundMarketingAmount() {
		return this.refundMarketingAmount;
	}
	public void setRefundMarketingAmount(String refundMarketingAmount) {
		this.refundMarketingAmount = refundMarketingAmount;
	}

}
