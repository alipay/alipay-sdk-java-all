package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.user.point.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:35
 */
public class AlipayInsAutoUserPointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5612431235638929969L;

	/** 
	 * 用户当前积分是否可兑换
	 */
	@ApiField("can_exchange")
	private Boolean canExchange;

	/** 
	 * 用户可用于兑换的积分值
攒油活动则表示用户可提取油量，单位为ml，例如可提取500ml
	 */
	@ApiField("can_exchange_amount")
	private Long canExchangeAmount;

	/** 
	 * 用户剩余积分额度，可继续积攒的值
攒油活动则表示用户油桶剩余大小，单位为ml
	 */
	@ApiField("can_save_amount")
	private Long canSaveAmount;

	/** 
	 * 用户有效积分。
攒油活动则表示可以使用的用户有效油量，单位为ml
	 */
	@ApiField("can_use_amount")
	private Long canUseAmount;

	/** 
	 * 是否推荐用户兑换
	 */
	@ApiField("recommend_exchange")
	private Boolean recommendExchange;

	/** 
	 * 用户积分总额度
攒油活动则表示用户油桶总大小，单位为ml，例如3000ml
	 */
	@ApiField("total_limit")
	private Long totalLimit;

	/** 
	 * 用户总共积攒量。
攒油活动则表示积攒油量，单位为ml，例如2000ml
	 */
	@ApiField("total_save_amount")
	private Long totalSaveAmount;

	public void setCanExchange(Boolean canExchange) {
		this.canExchange = canExchange;
	}
	public Boolean getCanExchange( ) {
		return this.canExchange;
	}

	public void setCanExchangeAmount(Long canExchangeAmount) {
		this.canExchangeAmount = canExchangeAmount;
	}
	public Long getCanExchangeAmount( ) {
		return this.canExchangeAmount;
	}

	public void setCanSaveAmount(Long canSaveAmount) {
		this.canSaveAmount = canSaveAmount;
	}
	public Long getCanSaveAmount( ) {
		return this.canSaveAmount;
	}

	public void setCanUseAmount(Long canUseAmount) {
		this.canUseAmount = canUseAmount;
	}
	public Long getCanUseAmount( ) {
		return this.canUseAmount;
	}

	public void setRecommendExchange(Boolean recommendExchange) {
		this.recommendExchange = recommendExchange;
	}
	public Boolean getRecommendExchange( ) {
		return this.recommendExchange;
	}

	public void setTotalLimit(Long totalLimit) {
		this.totalLimit = totalLimit;
	}
	public Long getTotalLimit( ) {
		return this.totalLimit;
	}

	public void setTotalSaveAmount(Long totalSaveAmount) {
		this.totalSaveAmount = totalSaveAmount;
	}
	public Long getTotalSaveAmount( ) {
		return this.totalSaveAmount;
	}

}
