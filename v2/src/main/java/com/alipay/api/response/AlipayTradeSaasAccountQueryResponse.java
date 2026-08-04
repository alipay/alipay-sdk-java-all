package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SaasAccountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-03 11:57:50
 */
public class AlipayTradeSaasAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8557382786881237327L;

	/** 
	 * null
	 */
	@ApiListField("account_list")
	@ApiField("saas_account_info")
	private List<SaasAccountInfo> accountList;

	/** 
	 * 实际命中的SaaS客户ID。
	 */
	@ApiField("customer_id")
	private String customerId;

	public void setAccountList(List<SaasAccountInfo> accountList) {
		this.accountList = accountList;
	}
	public List<SaasAccountInfo> getAccountList( ) {
		return this.accountList;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerId( ) {
		return this.customerId;
	}

}
