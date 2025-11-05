package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分销订单查询接口
 *
 * @author auto create
 * @since 1.0, 2025-07-29 09:36:17
 */
public class AlipayCommerceAcommunicationDistributionOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8611786313981317987L;

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
