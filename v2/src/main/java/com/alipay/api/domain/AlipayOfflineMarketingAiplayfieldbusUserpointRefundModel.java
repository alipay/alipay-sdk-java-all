package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集卡lm下单退卡
 *
 * @author auto create
 * @since 1.0, 2025-07-02 15:04:49
 */
public class AlipayOfflineMarketingAiplayfieldbusUserpointRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8113447346312265777L;

	/**
	 * 客户业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 扣卡请求id
	 */
	@ApiField("deducted_request_id")
	private String deductedRequestId;

	/**
	 * lm订单id
	 */
	@ApiField("lm_order_id")
	private String lmOrderId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getDeductedRequestId() {
		return this.deductedRequestId;
	}
	public void setDeductedRequestId(String deductedRequestId) {
		this.deductedRequestId = deductedRequestId;
	}

	public String getLmOrderId() {
		return this.lmOrderId;
	}
	public void setLmOrderId(String lmOrderId) {
		this.lmOrderId = lmOrderId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
