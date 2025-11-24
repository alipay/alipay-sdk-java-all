package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资商通订单对账接口
 *
 * @author auto create
 * @since 1.0, 2025-11-07 14:04:33
 */
public class AlipayCommerceRentOrderBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6529772411978942841L;

	/**
	 * 交易组件订单号
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
