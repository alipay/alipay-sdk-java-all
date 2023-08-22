package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付信息
 *
 * @author auto create
 * @since 1.0, 2023-06-30 15:04:16
 */
public class PaymentInfoWithId extends AlipayObject {

	private static final long serialVersionUID = 8187629417298221639L;

	/**
	 * 支付单id
	 */
	@ApiListField("payment_ids")
	@ApiField("string")
	private List<String> paymentIds;

	/**
	 * 支付资金类型
	 */
	@ApiField("type")
	private String type;

	public List<String> getPaymentIds() {
		return this.paymentIds;
	}
	public void setPaymentIds(List<String> paymentIds) {
		this.paymentIds = paymentIds;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
