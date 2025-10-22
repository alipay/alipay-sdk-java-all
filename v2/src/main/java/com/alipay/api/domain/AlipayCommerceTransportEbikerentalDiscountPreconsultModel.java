package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 两轮租赁订单优惠预咨询
 *
 * @author auto create
 * @since 1.0, 2024-12-16 09:55:56
 */
public class AlipayCommerceTransportEbikerentalDiscountPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 2787927936251339798L;

	/**
	 * 业务请求时间
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单金额,单位元
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
