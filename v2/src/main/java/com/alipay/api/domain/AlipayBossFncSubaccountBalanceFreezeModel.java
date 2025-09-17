package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财资子户余额冻结
 *
 * @author auto create
 * @since 1.0, 2020-08-31 19:43:06
 */
public class AlipayBossFncSubaccountBalanceFreezeModel extends AlipayObject {

	private static final long serialVersionUID = 2862647821328661359L;

	/**
	 * 子户余额冻结请求
	 */
	@ApiField("sub_account_balance_freeze_order")
	private SubAccountBalanceFreezeOrder subAccountBalanceFreezeOrder;

	public SubAccountBalanceFreezeOrder getSubAccountBalanceFreezeOrder() {
		return this.subAccountBalanceFreezeOrder;
	}
	public void setSubAccountBalanceFreezeOrder(SubAccountBalanceFreezeOrder subAccountBalanceFreezeOrder) {
		this.subAccountBalanceFreezeOrder = subAccountBalanceFreezeOrder;
	}

}
