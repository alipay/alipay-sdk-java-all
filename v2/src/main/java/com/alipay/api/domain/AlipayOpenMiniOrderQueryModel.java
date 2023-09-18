package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易组件查询订单接口
 *
 * @author auto create
 * @since 1.0, 2023-09-12 16:31:51
 */
public class AlipayOpenMiniOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6697465284817649889L;

	/**
	 * 买家open_id，和uid二选一
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号；order_id和out_order_id二选一
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户订单号，创建订单请求由商户传入；order_id和out_order_id二选一
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 买家支付宝用户ID；open_id和user_id二选一
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
