package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.bankaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-03 11:37:44
 */
public class AlipayCommerceLifeserviceBankaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5718943212635455689L;

	/** 
	 * 开设账户的银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/** 
	 * 仅当 status 为 FAIL 时该字段有值。其他状态下该字段为空或不返回。
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 商户的签约名称或营业执照名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 蚂蚁统一会员ID (Partner ID)
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 开户状态
	 */
	@ApiField("status")
	private String status;

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankName( ) {
		return this.bankName;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
