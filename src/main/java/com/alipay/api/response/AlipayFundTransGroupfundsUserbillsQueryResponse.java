package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupFundUserBill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.groupfunds.userbills.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:56
 */
public class AlipayFundTransGroupfundsUserbillsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4328726364117692782L;

	/** 
	 * 当前用户涉及的流水模型列表，仅返回实际存在的流水数据
	 */
	@ApiField("user_bills")
	private GroupFundUserBill userBills;

	public void setUserBills(GroupFundUserBill userBills) {
		this.userBills = userBills;
	}
	public GroupFundUserBill getUserBills( ) {
		return this.userBills;
	}

}
