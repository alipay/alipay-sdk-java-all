package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费项信息
 *
 * @author auto create
 * @since 1.0, 2020-06-17 14:04:38
 */
public class BillPaymentDetail extends AlipayObject {

	private static final long serialVersionUID = 8168334591174319782L;

	/**
	 * 缴费项ID
	 */
	@ApiField("bill_payment_id")
	private String billPaymentId;

	public String getBillPaymentId() {
		return this.billPaymentId;
	}
	public void setBillPaymentId(String billPaymentId) {
		this.billPaymentId = billPaymentId;
	}

}
