package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.instcard.open.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:55
 */
public class AlipayFundInstcardOpenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3115564863636615139L;

	/** 
	 * 账户名
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
	 * 机构号
	 */
	@ApiField("inst_id")
	private String instId;

	/** 
	 * 开户机构名
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
