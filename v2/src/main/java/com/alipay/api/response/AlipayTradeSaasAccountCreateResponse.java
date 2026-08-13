package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-03 11:57:50
 */
public class AlipayTradeSaasAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1682918725575195837L;

	/** 
	 * SaaS客户ID。后续账户查询和交易请求可使用该字段标识客户。
	 */
	@ApiField("customer_id")
	private String customerId;

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
