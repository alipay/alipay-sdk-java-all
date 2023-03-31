package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.remit.beneficialinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 22:04:31
 */
public class AlipayOverseasRemitBeneficialinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4184791234662871661L;

	/** 
	 * 收端用户的收款卡号
	 */
	@ApiField("bank_account")
	private String bankAccount;

	/** 
	 * 银行机构英文名字
	 */
	@ApiField("bank_english_name")
	private String bankEnglishName;

	/** 
	 * 银行的机构Id
	 */
	@ApiField("bank_inst_id")
	private String bankInstId;

	/** 
	 * 银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/** 
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/** 
	 * 是否有同步返回结果
	 */
	@ApiField("has_sync_result")
	private Boolean hasSyncResult;

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getBankAccount( ) {
		return this.bankAccount;
	}

	public void setBankEnglishName(String bankEnglishName) {
		this.bankEnglishName = bankEnglishName;
	}
	public String getBankEnglishName( ) {
		return this.bankEnglishName;
	}

	public void setBankInstId(String bankInstId) {
		this.bankInstId = bankInstId;
	}
	public String getBankInstId( ) {
		return this.bankInstId;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankName( ) {
		return this.bankName;
	}

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}
	public String getExtendInfo( ) {
		return this.extendInfo;
	}

	public void setHasSyncResult(Boolean hasSyncResult) {
		this.hasSyncResult = hasSyncResult;
	}
	public Boolean getHasSyncResult( ) {
		return this.hasSyncResult;
	}

}
