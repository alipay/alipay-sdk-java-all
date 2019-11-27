package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户申请单查询
 *
 * @author auto create
 * @since 1.0, 2018-11-28 15:15:54
 */
public class AntMerchantExpandOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7626239556166745964L;

	/**
	 * 通过ant.merchant.expand.indirect.zmsub.create等接口进件时返回的order_id
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
