package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分销订单查询接口
 *
 * @author auto create
 * @since 1.0, 2024-11-08 13:46:51
 */
public class AlipayCommerceAcommunicationDistributionOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5115821778391277796L;

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
