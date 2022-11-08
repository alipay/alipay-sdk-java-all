package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付子额度
 *
 * @author auto create
 * @since 1.0, 2022-04-18 15:41:33
 */
public class CreditpaySubquota extends AlipayObject {

	private static final long serialVersionUID = 8818281715892156197L;

	/**
	 * 可用额度,单位分
	 */
	@ApiField("available_amt")
	private String availableAmt;

	/**
	 * 信用支付子额度类型
	 */
	@ApiField("quota_type")
	private String quotaType;

	/**
	 * 总额度,单位分
	 */
	@ApiField("total_amt")
	private String totalAmt;

	public String getAvailableAmt() {
		return this.availableAmt;
	}
	public void setAvailableAmt(String availableAmt) {
		this.availableAmt = availableAmt;
	}

	public String getQuotaType() {
		return this.quotaType;
	}
	public void setQuotaType(String quotaType) {
		this.quotaType = quotaType;
	}

	public String getTotalAmt() {
		return this.totalAmt;
	}
	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}

}
