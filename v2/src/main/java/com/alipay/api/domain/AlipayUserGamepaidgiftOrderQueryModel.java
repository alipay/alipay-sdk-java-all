package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小游戏付费礼包交易订单查询
 *
 * @author auto create
 * @since 1.0, 2026-07-22 18:12:51
 */
public class AlipayUserGamepaidgiftOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3584541367582312563L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 游戏平台的唯一订单号，在发货通知的时候传入的platform_order_id
	 */
	@ApiField("platform_order_id")
	private String platformOrderId;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPlatformOrderId() {
		return this.platformOrderId;
	}
	public void setPlatformOrderId(String platformOrderId) {
		this.platformOrderId = platformOrderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
