package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业支付信息
 *
 * @author auto create
 * @since 1.0, 2024-09-26 18:30:35
 */
public class IndustryPaymentInfoWithId extends AlipayObject {

	private static final long serialVersionUID = 3183852635696383879L;

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
