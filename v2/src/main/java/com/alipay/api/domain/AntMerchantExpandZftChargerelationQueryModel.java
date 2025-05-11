package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 本地接直付通 记账关系查询
 *
 * @author auto create
 * @since 1.0, 2023-12-28 14:54:52
 */
public class AntMerchantExpandZftChargerelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6618155546834351943L;

	/**
	 * 申请单id
	 */
	@ApiField("order_id")
	private String orderId;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
