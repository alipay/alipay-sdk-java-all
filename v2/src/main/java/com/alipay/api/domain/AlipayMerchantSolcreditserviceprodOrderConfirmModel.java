package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单开始
 *
 * @author auto create
 * @since 1.0, 2024-11-14 19:50:18
 */
public class AlipayMerchantSolcreditserviceprodOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 7859289588556917254L;

	/**
	 * 系统生成订单唯一编号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
