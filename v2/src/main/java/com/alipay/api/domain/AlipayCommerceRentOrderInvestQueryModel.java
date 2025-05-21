package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 面向资方的订单查询服务
 *
 * @author auto create
 * @since 1.0, 2025-04-28 17:30:56
 */
public class AlipayCommerceRentOrderInvestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7261187864485753278L;

	/**
	 * 2088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权;
其它场景下获取用户ID请参考：网页授权获取用户信息;
其中buyer_id与buyer_open_id不能同时为空
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 交易组件的业务订单Id
	 */
	@ApiField("order_id")
	private String orderId;

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

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
