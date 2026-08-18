package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁采购订单是否可以不当面激活校验
 *
 * @author auto create
 * @since 1.0, 2026-08-03 16:12:48
 */
public class AlipayCommerceRentProcurementInactiveCheckModel extends AlipayObject {

	private static final long serialVersionUID = 5241343554379951429L;

	/**
	 * 买家ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家ID
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 关联租赁单商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 关联租赁单交易组件订单号
	 */
	@ApiField("rent_order_id")
	private String rentOrderId;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getRentOrderId() {
		return this.rentOrderId;
	}
	public void setRentOrderId(String rentOrderId) {
		this.rentOrderId = rentOrderId;
	}

}
