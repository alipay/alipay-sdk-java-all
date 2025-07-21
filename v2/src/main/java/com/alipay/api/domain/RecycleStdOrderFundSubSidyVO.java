package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家营销资金
 *
 * @author auto create
 * @since 1.0, 2025-07-21 14:39:58
 */
public class RecycleStdOrderFundSubSidyVO extends AlipayObject {

	private static final long serialVersionUID = 2763262223576962217L;

	/**
	 * 营销资金
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 范围：WAIT_PAY待贷款、SUCCESS打款完成、FAILD打款失败
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * 百分比单位数值0-100
	 */
	@ApiField("percent")
	private String percent;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getPercent() {
		return this.percent;
	}
	public void setPercent(String percent) {
		this.percent = percent;
	}

}
