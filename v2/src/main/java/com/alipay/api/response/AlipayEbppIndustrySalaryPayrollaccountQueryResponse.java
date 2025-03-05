package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.salary.payrollaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-06 11:27:26
 */
public class AlipayEbppIndustrySalaryPayrollaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6373761851173544391L;

	/** 
	 * Map<String,String>,JSON BASE64Encode
key=子户用途, 
value=子户外标.
PAY_ROLL@888888123 表示在888888123母户下开通代发子户
	 */
	@ApiField("acct_map")
	private String acctMap;

	/** 
	 * 开户场景
	 */
	@ApiField("acct_type")
	private String acctType;

	/** 
	 * 代发商户的商户号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 代发商户名字
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 响应收付通加签的xml，通过base64Encode编码
	 */
	@ApiField("sign_xml")
	private String signXml;

	public void setAcctMap(String acctMap) {
		this.acctMap = acctMap;
	}
	public String getAcctMap( ) {
		return this.acctMap;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	public String getAcctType( ) {
		return this.acctType;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}
	public String getSignXml( ) {
		return this.signXml;
	}

}
