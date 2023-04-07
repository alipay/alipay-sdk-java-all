package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易组件查询订单接口
 *
 * @author auto create
 * @since 1.0, 2023-04-06 17:26:51
 */
public class AlipayOpenMiniOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5536911892139323445L;

	/**
	 * 用户open_id，和uid二选一
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 小程序交易组件交易号,和商家自定义交易号二选一
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商家自定义交易号，和小程序交易组件交易号二选一
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 用户user_id，和open_id二选一
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
