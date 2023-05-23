package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易组件查询订单接口
 *
 * @author auto create
 * @since 1.0, 2023-04-20 15:12:00
 */
public class AlipayOpenMiniOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7118669728845311383L;

	/**
	 * 用户open_id，和uid二选一
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号,和商家自定义交易号二选一
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商家自定义订单号，和小程序交易组件交易号二选一
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 用户user_id
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
