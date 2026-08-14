package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-27 10:42:52
 */
public class PlatformRegisterOrderList extends AlipayObject {

	private static final long serialVersionUID = 5366817584761261367L;

	/**
	 * 订单详情跳转链接
	 */
	@ApiField("order_detail_url")
	private String orderDetailUrl;

	/**
	 * 挂号订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单支付状态
	 */
	@ApiField("order_pay_status")
	private String orderPayStatus;

	/**
	 * 订单业务参数
	 */
	@ApiField("order_prop")
	private String orderProp;

	/**
	 * 挂号日期
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * 挂号订单状态
	 */
	@ApiField("status")
	private String status;

	public String getOrderDetailUrl() {
		return this.orderDetailUrl;
	}
	public void setOrderDetailUrl(String orderDetailUrl) {
		this.orderDetailUrl = orderDetailUrl;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderPayStatus() {
		return this.orderPayStatus;
	}
	public void setOrderPayStatus(String orderPayStatus) {
		this.orderPayStatus = orderPayStatus;
	}

	public String getOrderProp() {
		return this.orderProp;
	}
	public void setOrderProp(String orderProp) {
		this.orderProp = orderProp;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
