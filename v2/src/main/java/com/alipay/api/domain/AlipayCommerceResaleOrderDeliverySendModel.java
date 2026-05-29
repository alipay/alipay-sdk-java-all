package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二手售卖订单发货
 *
 * @author auto create
 * @since 1.0, 2026-04-20 17:42:46
 */
public class AlipayCommerceResaleOrderDeliverySendModel extends AlipayObject {

	private static final long serialVersionUID = 4414354179732335959L;

	/**
	 * 物流履约信息
	 */
	@ApiField("delivery_info")
	private ResaleDeliveryVO deliveryInfo;

	/**
	 * 用户2088
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商家外部订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 用户2088
	 */
	@ApiField("user_id")
	private String userId;

	public ResaleDeliveryVO getDeliveryInfo() {
		return this.deliveryInfo;
	}
	public void setDeliveryInfo(ResaleDeliveryVO deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
