package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代金券价值信息
 *
 * @author auto create
 * @since 1.0, 2023-11-23 15:48:01
 */
public class CashVoucherValueInfo extends AlipayObject {

	private static final long serialVersionUID = 1436723598494942344L;

	/**
	 * 代金券使用门槛金额。 比如满25元减5元代金券，门槛金额指的就是25元。
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 代金券的价值
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
