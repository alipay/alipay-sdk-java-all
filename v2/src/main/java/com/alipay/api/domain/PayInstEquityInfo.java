package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付机构权益信息
 *
 * @author auto create
 * @since 1.0, 2024-05-10 14:22:45
 */
public class PayInstEquityInfo extends AlipayObject {

	private static final long serialVersionUID = 6879597482764675214L;

	/**
	 * 权益可用开始时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2024-05-08T13:29:35.120+08:00表示，北京时间2024年5月8日 13点29分35秒。
	 */
	@ApiField("available_begin_time")
	private String availableBeginTime;

	/**
	 * 权益可用结束时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2024-05-08T13:29:35.120+08:00表示，北京时间2024年5月8日 13点29分35秒。
	 */
	@ApiField("available_end_time")
	private String availableEndTime;

	/**
	 * 权益所属的摩斯营销活动ID
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 权益金额，单位：分
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 发放成功后生成的发放凭证号
	 */
	@ApiField("send_order_id")
	private String sendOrderId;

	/**
	 * 权益状态： SENDED：可用 USED：已实扣
	 */
	@ApiField("status")
	private String status;

	/**
	 * 权益使用门槛金额，单位：分
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 微信支付系统生成的订单号
	 */
	@ApiField("transaction_id")
	private String transactionId;

	/**
	 * 用户ID信息，该字段拼接方式：appID#openID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAvailableBeginTime() {
		return this.availableBeginTime;
	}
	public void setAvailableBeginTime(String availableBeginTime) {
		this.availableBeginTime = availableBeginTime;
	}

	public String getAvailableEndTime() {
		return this.availableEndTime;
	}
	public void setAvailableEndTime(String availableEndTime) {
		this.availableEndTime = availableEndTime;
	}

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getSendOrderId() {
		return this.sendOrderId;
	}
	public void setSendOrderId(String sendOrderId) {
		this.sendOrderId = sendOrderId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
