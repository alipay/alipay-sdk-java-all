package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccountNoInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbankcust.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:53
 */
public class AlipayUserDtbankcustAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2281754277817719458L;

	/** 
	 * 查询到用户支付宝账号信息列表
	 */
	@ApiListField("account_no_info_list")
	@ApiField("account_no_info")
	private List<AccountNoInfo> accountNoInfoList;

	public void setAccountNoInfoList(List<AccountNoInfo> accountNoInfoList) {
		this.accountNoInfoList = accountNoInfoList;
	}
	public List<AccountNoInfo> getAccountNoInfoList( ) {
		return this.accountNoInfoList;
	}

}
