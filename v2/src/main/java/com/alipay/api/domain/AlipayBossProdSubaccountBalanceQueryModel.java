package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子户余额信息查询
 *
 * @author auto create
 * @since 1.0, 2020-08-31 19:43:14
 */
public class AlipayBossProdSubaccountBalanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7571298784464289112L;

	/**
	 * 子户余额查询请求
	 */
	@ApiField("sub_account_balance_query_order")
	private SubAccountBalanceQueryOrder subAccountBalanceQueryOrder;

	public SubAccountBalanceQueryOrder getSubAccountBalanceQueryOrder() {
		return this.subAccountBalanceQueryOrder;
	}
	public void setSubAccountBalanceQueryOrder(SubAccountBalanceQueryOrder subAccountBalanceQueryOrder) {
		this.subAccountBalanceQueryOrder = subAccountBalanceQueryOrder;
	}

}
