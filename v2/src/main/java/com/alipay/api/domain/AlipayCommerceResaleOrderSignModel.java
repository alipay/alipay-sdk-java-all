package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二手售卖签约接口
 *
 * @author auto create
 * @since 1.0, 2026-04-22 11:52:45
 */
public class AlipayCommerceResaleOrderSignModel extends AlipayObject {

	private static final long serialVersionUID = 1899579837614869326L;

	/**
	 * 签约成功后的回调地址，例如私域订单详情页
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 签约类型
	 */
	@ApiField("sign_pay_type")
	private String signPayType;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
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

	public String getSignPayType() {
		return this.signPayType;
	}
	public void setSignPayType(String signPayType) {
		this.signPayType = signPayType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
