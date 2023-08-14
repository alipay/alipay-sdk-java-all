package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.instcard.open.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:32:14
 */
public class AlipayFundInstcardOpenSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 8538278151939347688L;

	/** 
	 * 开户姓名
	 */
	@ApiField("account_name")
	private String accountName;

	/** 
	 * 账户号
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 账号状态
	 */
	@ApiField("account_status")
	private String accountStatus;

	/** 
	 * 开户机构号
	 */
	@ApiField("inst_id")
	private String instId;

	/** 
	 * 开户机构名称
	 */
	@ApiField("inst_name")
	private String instName;

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountName( ) {
		return this.accountName;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getAccountStatus( ) {
		return this.accountStatus;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstId( ) {
		return this.instId;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}
	public String getInstName( ) {
		return this.instName;
	}

}
