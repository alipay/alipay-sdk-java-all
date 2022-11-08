package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.enterprisepay.group.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-04 14:21:44
 */
public class AlipayFundEnterprisepayGroupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1398862699974267563L;

	/** 
	 * 企业签约账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/** 
	 * 内部群组号
	 */
	@ApiField("fund_group_id")
	private String fundGroupId;

	/** 
	 * 该群所对应的出资主体账号
	 */
	@ApiField("fund_identity")
	private String fundIdentity;

	/** 
	 * 群组名称
	 */
	@ApiField("group_name")
	private String groupName;

	/** 
	 * 外部群组号
	 */
	@ApiField("out_group_id")
	private String outGroupId;

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountId( ) {
		return this.accountId;
	}

	public void setFundGroupId(String fundGroupId) {
		this.fundGroupId = fundGroupId;
	}
	public String getFundGroupId( ) {
		return this.fundGroupId;
	}

	public void setFundIdentity(String fundIdentity) {
		this.fundIdentity = fundIdentity;
	}
	public String getFundIdentity( ) {
		return this.fundIdentity;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupName( ) {
		return this.groupName;
	}

	public void setOutGroupId(String outGroupId) {
		this.outGroupId = outGroupId;
	}
	public String getOutGroupId( ) {
		return this.outGroupId;
	}

}
