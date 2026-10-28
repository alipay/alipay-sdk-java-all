package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.point.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-22 10:27:55
 */
public class AlipayMarketingPointOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1477831989266294855L;

	/** 
	 * 订单发奖状态，发奖成功：SUCCESS，未发奖：NOT_AWARDED
	 */
	@ApiField("award_status")
	private String awardStatus;

	/** 
	 * 积分兑换活动id
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/** 
	 * 订单卡模板id
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/** 
	 * 根兑换订单号
	 */
	@ApiField("exchange_order_id")
	private String exchangeOrderId;

	/** 
	 * 处理中：PROCESSING ； 处理完成 ：COMPLETED
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 订单积分数量，单位：点数
	 */
	@ApiField("point_amount")
	private String pointAmount;

	public void setAwardStatus(String awardStatus) {
		this.awardStatus = awardStatus;
	}
	public String getAwardStatus( ) {
		return this.awardStatus;
	}

	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitId( ) {
		return this.benefitId;
	}

	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}
	public String getCardTemplateId( ) {
		return this.cardTemplateId;
	}

	public void setExchangeOrderId(String exchangeOrderId) {
		this.exchangeOrderId = exchangeOrderId;
	}
	public String getExchangeOrderId( ) {
		return this.exchangeOrderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setPointAmount(String pointAmount) {
		this.pointAmount = pointAmount;
	}
	public String getPointAmount( ) {
		return this.pointAmount;
	}

}
