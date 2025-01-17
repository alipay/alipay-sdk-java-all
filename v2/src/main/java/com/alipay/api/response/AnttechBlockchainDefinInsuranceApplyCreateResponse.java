package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.insurance.apply.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-04 13:36:15
 */
public class AnttechBlockchainDefinInsuranceApplyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2441718918677951991L;

	/** 
	 * 保额
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 投保单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 保险止期
	 */
	@ApiField("insure_end_date")
	private String insureEndDate;

	/** 
	 * 保险起期
	 */
	@ApiField("insure_start_date")
	private String insureStartDate;

	/** 
	 * 个性化参数
	 */
	@ApiField("parm")
	private String parm;

	/** 
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/** 
	 * 电子保单链接
	 */
	@ApiField("policy_url")
	private String policyUrl;

	/** 
	 * 保费
	 */
	@ApiField("premium")
	private String premium;

	/** 
	 * 请求交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

	public void setInsureEndDate(String insureEndDate) {
		this.insureEndDate = insureEndDate;
	}
	public String getInsureEndDate( ) {
		return this.insureEndDate;
	}

	public void setInsureStartDate(String insureStartDate) {
		this.insureStartDate = insureStartDate;
	}
	public String getInsureStartDate( ) {
		return this.insureStartDate;
	}

	public void setParm(String parm) {
		this.parm = parm;
	}
	public String getParm( ) {
		return this.parm;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

	public void setPolicyUrl(String policyUrl) {
		this.policyUrl = policyUrl;
	}
	public String getPolicyUrl( ) {
		return this.policyUrl;
	}

	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getPremium( ) {
		return this.premium;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
