package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.salary.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-06 16:42:25
 */
public class AlipayEbppIndustrySalaryAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1423919854621953341L;

	/** 
	 * 子户卡号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/** 
	 * 母户户名
	 */
	@ApiField("bank_cert_name")
	private String bankCertName;

	/** 
	 * 开户行名称
	 */
	@ApiField("branch_name")
	private String branchName;

	/** 
	 * 开户行行号
	 */
	@ApiField("branch_no")
	private String branchNo;

	/** 
	 * 代发商户商户号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 外部交易流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 响应收付通加签的xml，通过base64Encode编码
	 */
	@ApiField("sign_xml")
	private String signXml;

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public String getBankCardNo( ) {
		return this.bankCardNo;
	}

	public void setBankCertName(String bankCertName) {
		this.bankCertName = bankCertName;
	}
	public String getBankCertName( ) {
		return this.bankCertName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchName( ) {
		return this.branchName;
	}

	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}
	public String getBranchNo( ) {
		return this.branchNo;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}
	public String getSignXml( ) {
		return this.signXml;
	}

}
