package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二手售卖订单关闭
 *
 * @author auto create
 * @since 1.0, 2026-04-30 14:07:46
 */
public class AlipayCommerceResaleOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 6542795639495843483L;

	/**
	 * 用户2088
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 关闭原因
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/**
	 * 用户2088
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
