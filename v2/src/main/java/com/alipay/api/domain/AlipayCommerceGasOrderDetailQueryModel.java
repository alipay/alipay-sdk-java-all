package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加油订单信息查询
 *
 * @author auto create
 * @since 1.0, 2024-04-18 16:21:25
 */
public class AlipayCommerceGasOrderDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4152921572437524572L;

	/**
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

}
