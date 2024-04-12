package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.mbpcard.purchase.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-25 17:56:49
 */
public class AlipayFundMbpcardPurchaseSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 3798287293234396513L;

	/** 
	 * 加密算法名称
	 */
	@ApiField("encrypt_algorithm_name")
	private String encryptAlgorithmName;

	/** 
	 * 购卡人专属打款账号名称，非线上购卡场景使用
	 */
	@ApiField("fund_account_name")
	private String fundAccountName;

	/** 
	 * 购卡人专属打款账号，非线上购卡场景使用
	 */
	@ApiField("fund_account_no")
	private String fundAccountNo;

	/** 
	 * 预付卡购卡人编号
	 */
	@ApiField("purchase_id")
	private String purchaseId;

	/** 
	 * 公钥别名
	 */
	@ApiField("rsa_public_key_alias")
	private String rsaPublicKeyAlias;

	public void setEncryptAlgorithmName(String encryptAlgorithmName) {
		this.encryptAlgorithmName = encryptAlgorithmName;
	}
	public String getEncryptAlgorithmName( ) {
		return this.encryptAlgorithmName;
	}

	public void setFundAccountName(String fundAccountName) {
		this.fundAccountName = fundAccountName;
	}
	public String getFundAccountName( ) {
		return this.fundAccountName;
	}

	public void setFundAccountNo(String fundAccountNo) {
		this.fundAccountNo = fundAccountNo;
	}
	public String getFundAccountNo( ) {
		return this.fundAccountNo;
	}

	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getPurchaseId( ) {
		return this.purchaseId;
	}

	public void setRsaPublicKeyAlias(String rsaPublicKeyAlias) {
		this.rsaPublicKeyAlias = rsaPublicKeyAlias;
	}
	public String getRsaPublicKeyAlias( ) {
		return this.rsaPublicKeyAlias;
	}

}
