package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 司机之家_货源消息通知
 *
 * @author auto create
 * @since 1.0, 2025-07-30 10:00:47
 */
public class AlipayCommerceLogisticsFreightdiverGoodsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1147133322482392598L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单名称
	 */
	@ApiField("order_name")
	private String orderName;

	/**
	 * 订单号(唯一键)
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单时间，标准格式为:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_time")
	private String orderTime;

	/**
	 * 合作方小程序链接
	 */
	@ApiField("order_url")
	private String orderUrl;

	/**
	 * 支付宝用户的司机userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderName() {
		return this.orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderUrl() {
		return this.orderUrl;
	}
	public void setOrderUrl(String orderUrl) {
		this.orderUrl = orderUrl;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
