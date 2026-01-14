package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etcenterprise.invoicetitle.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-19 14:03:05
 */
public class AlipayCommerceTransportEtcenterpriseInvoicetitleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5382998213462575736L;

	/** 
	 * 购方单位地址
	 */
	@ApiField("buyer_addr")
	private String buyerAddr;

	/** 
	 * 购方开户行
	 */
	@ApiField("buyer_bank")
	private String buyerBank;

	/** 
	 * 购方银行账号
	 */
	@ApiField("buyer_bank_account")
	private String buyerBankAccount;

	/** 
	 * 单位名称或者姓名
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/** 
	 * 抬头税号
	 */
	@ApiField("buyer_tax_num")
	private String buyerTaxNum;

	/** 
	 * 购方电话
	 */
	@ApiField("buyer_tel")
	private String buyerTel;

	/** 
	 * 发票抬头类型
	 */
	@ApiField("title_type")
	private String titleType;

	public void setBuyerAddr(String buyerAddr) {
		this.buyerAddr = buyerAddr;
	}
	public String getBuyerAddr( ) {
		return this.buyerAddr;
	}

	public void setBuyerBank(String buyerBank) {
		this.buyerBank = buyerBank;
	}
	public String getBuyerBank( ) {
		return this.buyerBank;
	}

	public void setBuyerBankAccount(String buyerBankAccount) {
		this.buyerBankAccount = buyerBankAccount;
	}
	public String getBuyerBankAccount( ) {
		return this.buyerBankAccount;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyerName( ) {
		return this.buyerName;
	}

	public void setBuyerTaxNum(String buyerTaxNum) {
		this.buyerTaxNum = buyerTaxNum;
	}
	public String getBuyerTaxNum( ) {
		return this.buyerTaxNum;
	}

	public void setBuyerTel(String buyerTel) {
		this.buyerTel = buyerTel;
	}
	public String getBuyerTel( ) {
		return this.buyerTel;
	}

	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}
	public String getTitleType( ) {
		return this.titleType;
	}

}
