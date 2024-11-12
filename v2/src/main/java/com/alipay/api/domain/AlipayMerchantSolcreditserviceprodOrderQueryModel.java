package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单详情查询
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:46
 */
public class AlipayMerchantSolcreditserviceprodOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7655442577137196678L;

	/**
	 * 系统生成订单唯一编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 商家下单时自定义编号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
