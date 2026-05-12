package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.subscription.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-12 01:17:48
 */
public class AlipayTradeSubscriptionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4162794554563336896L;

	/** 
	 * 长链，适用于跳转拉起支付宝端
	 */
	@ApiField("alipay_jump_schema")
	private String alipayJumpSchema;

	/** 
	 * 短链，适用于生成二维码
	 */
	@ApiField("alipay_schema")
	private String alipaySchema;

	/** 
	 * 订阅支付单ID
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 支付金额，单位分
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/** 
	 * 订阅优惠信息
	 */
	@ApiField("promotion_info")
	private String promotionInfo;

	/** 
	 * 订阅id
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	/** 
	 * 格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("trial_end")
	private String trialEnd;

	/** 
	 * 格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("trial_start")
	private String trialStart;

	public void setAlipayJumpSchema(String alipayJumpSchema) {
		this.alipayJumpSchema = alipayJumpSchema;
	}
	public String getAlipayJumpSchema( ) {
		return this.alipayJumpSchema;
	}

	public void setAlipaySchema(String alipaySchema) {
		this.alipaySchema = alipaySchema;
	}
	public String getAlipaySchema( ) {
		return this.alipaySchema;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}
	public Long getPayAmount( ) {
		return this.payAmount;
	}

	public void setPromotionInfo(String promotionInfo) {
		this.promotionInfo = promotionInfo;
	}
	public String getPromotionInfo( ) {
		return this.promotionInfo;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getSubscriptionId( ) {
		return this.subscriptionId;
	}

	public void setTrialEnd(String trialEnd) {
		this.trialEnd = trialEnd;
	}
	public String getTrialEnd( ) {
		return this.trialEnd;
	}

	public void setTrialStart(String trialStart) {
		this.trialStart = trialStart;
	}
	public String getTrialStart( ) {
		return this.trialStart;
	}

}
