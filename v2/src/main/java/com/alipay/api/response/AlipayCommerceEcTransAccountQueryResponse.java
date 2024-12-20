package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FundAccountApiDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.trans.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-28 11:31:11
 */
public class AlipayCommerceEcTransAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3897752685657694211L;

	/** 
	 * 资金专户列表
	 */
	@ApiListField("account_list")
	@ApiField("fund_account_api_d_t_o")
	private List<FundAccountApiDTO> accountList;

	public void setAccountList(List<FundAccountApiDTO> accountList) {
		this.accountList = accountList;
	}
	public List<FundAccountApiDTO> getAccountList( ) {
		return this.accountList;
	}

}
