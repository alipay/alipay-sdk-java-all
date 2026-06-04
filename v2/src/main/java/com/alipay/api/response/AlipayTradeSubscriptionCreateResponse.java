package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.subscription.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-03 14:47:50
 */
public class AlipayTradeSubscriptionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4361244734994455123L;

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
	 * 创建订阅时生成的支付请求单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 支付金额，单位分
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/** 
	 * 订阅创建生成的优惠信息
	 */
	@ApiField("promotion_info")
	private String promotionInfo;

	/** 
	 * 签约链接有效期截止时间，格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("schema_effective_end")
	private String schemaEffectiveEnd;

	/** 
	 * 订阅id，本次订阅操作生成的唯一标识
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	/** 
	 * 试用期结束时间，格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("trial_end")
	private String trialEnd;

	/** 
	 * 试用期开始时间，格式 yyyy-MM-dd HH:mm:ss
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

	public void setSchemaEffectiveEnd(String schemaEffectiveEnd) {
		this.schemaEffectiveEnd = schemaEffectiveEnd;
	}
	public String getSchemaEffectiveEnd( ) {
		return this.schemaEffectiveEnd;
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
