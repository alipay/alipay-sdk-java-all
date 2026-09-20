package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 21:17:52
 */
public class AlipayTradeSaasAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1864278482565664393L;

	/** 
	 * SaaS客户ID。后续账户查询和交易请求可使用该字段标识客户。
	 */
	@ApiField("customer_id")
	private String customerId;

	/** 
	 * 企业登记号，用于标识企业主体并与企业名称进行一致性校验。境内企业通常填写统一社会信用代码。
	 */
	@ApiField("enterprise_registration_no")
	private String enterpriseRegistrationNo;

	/** 
	 * 机构账户名称。
	 */
	@ApiField("inst_account_name")
	private String instAccountName;

	/** 
	 * 机构账户号。
	 */
	@ApiField("inst_account_no")
	private String instAccountNo;

	/** 
	 * 开户机构名称。
	 */
	@ApiField("inst_name")
	private String instName;

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerId( ) {
		return this.customerId;
	}

	public void setEnterpriseRegistrationNo(String enterpriseRegistrationNo) {
		this.enterpriseRegistrationNo = enterpriseRegistrationNo;
	}
	public String getEnterpriseRegistrationNo( ) {
		return this.enterpriseRegistrationNo;
	}

	public void setInstAccountName(String instAccountName) {
		this.instAccountName = instAccountName;
	}
	public String getInstAccountName( ) {
		return this.instAccountName;
	}

	public void setInstAccountNo(String instAccountNo) {
		this.instAccountNo = instAccountNo;
	}
	public String getInstAccountNo( ) {
		return this.instAccountNo;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}
	public String getInstName( ) {
		return this.instName;
	}

}
