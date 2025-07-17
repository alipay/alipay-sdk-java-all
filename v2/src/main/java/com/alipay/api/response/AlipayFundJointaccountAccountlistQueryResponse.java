package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccountBaselDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.accountlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-01 09:52:30
 */
public class AlipayFundJointaccountAccountlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5645592876442842123L;

	/** 
	 * 账户基础信息
	 */
	@ApiListField("account_list")
	@ApiField("account_basel_d_t_o")
	private List<AccountBaselDTO> accountList;

	public void setAccountList(List<AccountBaselDTO> accountList) {
		this.accountList = accountList;
	}
	public List<AccountBaselDTO> getAccountList( ) {
		return this.accountList;
	}

}
