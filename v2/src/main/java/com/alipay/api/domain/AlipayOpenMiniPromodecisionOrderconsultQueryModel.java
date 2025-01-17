package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品营销活动订单咨询
 *
 * @author auto create
 * @since 1.0, 2024-07-03 14:36:00
 */
public class AlipayOpenMiniPromodecisionOrderconsultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3344816997832847713L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单页咨询信息
	 */
	@ApiField("order_detail_info")
	private OrderDetailInfo orderDetailInfo;

	/**
	 * 外部优惠信息
	 */
	@ApiField("out_promo_info")
	private OutPromoInfo outPromoInfo;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public OrderDetailInfo getOrderDetailInfo() {
		return this.orderDetailInfo;
	}
	public void setOrderDetailInfo(OrderDetailInfo orderDetailInfo) {
		this.orderDetailInfo = orderDetailInfo;
	}

	public OutPromoInfo getOutPromoInfo() {
		return this.outPromoInfo;
	}
	public void setOutPromoInfo(OutPromoInfo outPromoInfo) {
		this.outPromoInfo = outPromoInfo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
