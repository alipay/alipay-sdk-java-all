package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.mbpcard.card.bind response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:13
 */
public class AlipayFundMbpcardCardBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 2253462492326838613L;

	/** 
	 * 绑卡结果
	 */
	@ApiField("bind_result")
	private Boolean bindResult;

	/** 
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 卡面额；单位元，精确到分
	 */
	@ApiField("origin_amount")
	private String originAmount;

	/** 
	 * 卡片有效期-截止，yyyy-MM-dd
	 */
	@ApiField("valid_end_date")
	private String validEndDate;

	/** 
	 * 卡片有效期-起始，yyyy-MM-dd
	 */
	@ApiField("valid_start_date")
	private String validStartDate;

	public void setBindResult(Boolean bindResult) {
		this.bindResult = bindResult;
	}
	public Boolean getBindResult( ) {
		return this.bindResult;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo( ) {
		return this.cardNo;
	}

	public void setOriginAmount(String originAmount) {
		this.originAmount = originAmount;
	}
	public String getOriginAmount( ) {
		return this.originAmount;
	}

	public void setValidEndDate(String validEndDate) {
		this.validEndDate = validEndDate;
	}
	public String getValidEndDate( ) {
		return this.validEndDate;
	}

	public void setValidStartDate(String validStartDate) {
		this.validStartDate = validStartDate;
	}
	public String getValidStartDate( ) {
		return this.validStartDate;
	}

}
