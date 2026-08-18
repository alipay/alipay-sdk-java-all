package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻评估行为查询
 *
 * @author auto create
 * @since 1.0, 2026-08-11 14:39:05
 */
public class ZhimaCreditPeEvaluateBehaviorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1764456772468298649L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商家预授权冻结时传入的商家订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 信用服务service_id； 芝麻侧通过商户PID生成的一个信用服务的id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
