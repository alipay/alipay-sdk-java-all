package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.cloudfund.subaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-25 10:39:55
 */
public class MybankCreditSupplychainCloudfundSubaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7255465231691668599L;

	/** 
	 * 云资金账户号，也是账户外标
	 */
	@ApiField("account_ext_no")
	private String accountExtNo;

	/** 
	 * 云资金账户的状态
	 */
	@ApiField("account_status")
	private String accountStatus;

	/** 
	 * 账户余额
	 */
	@ApiField("available_balance")
	private String availableBalance;

	/** 
	 * 云资金账户的名字， 创建时生成
	 */
	@ApiField("cert_name")
	private String certName;

	/** 
	 * isv的网商会员role
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	public void setAccountExtNo(String accountExtNo) {
		this.accountExtNo = accountExtNo;
	}
	public String getAccountExtNo( ) {
		return this.accountExtNo;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getAccountStatus( ) {
		return this.accountStatus;
	}

	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getAvailableBalance( ) {
		return this.availableBalance;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getCertName( ) {
		return this.certName;
	}

	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}
	public String getIpRoleId( ) {
		return this.ipRoleId;
	}

}
