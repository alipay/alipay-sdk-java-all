package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.unionbank.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:52
 */
public class AlipayEbppProdmodeUnionbankQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1554923154347724821L;

	/** 
	 * 银联编号
	 */
	@ApiField("bank_code")
	private String bankCode;

	/** 
	 * 联行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/** 
	 * 支行名称
	 */
	@ApiField("branch_name")
	private String branchName;

	/** 
	 * 市区信息
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 省名称
	 */
	@ApiField("prov")
	private String prov;

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankCode( ) {
		return this.bankCode;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankName( ) {
		return this.bankName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchName( ) {
		return this.branchName;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity( ) {
		return this.city;
	}

	public void setProv(String prov) {
		this.prov = prov;
	}
	public String getProv( ) {
		return this.prov;
	}

}
