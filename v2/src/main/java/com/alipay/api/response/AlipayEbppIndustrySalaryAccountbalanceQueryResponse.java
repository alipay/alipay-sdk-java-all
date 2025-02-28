package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.salary.accountbalance.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-06 13:52:24
 */
public class AlipayEbppIndustrySalaryAccountbalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3514638771886621935L;

	/** 
	 * 余额(单位为分)
	 */
	@ApiField("amount")
	private Long amount;

	/** 
	 * 子户卡号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/** 
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 响应的加签xml,通过base64编码
	 */
	@ApiField("sign_xml")
	private String signXml;

	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Long getAmount( ) {
		return this.amount;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public String getBankCardNo( ) {
		return this.bankCardNo;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}
	public String getSignXml( ) {
		return this.signXml;
	}

}
