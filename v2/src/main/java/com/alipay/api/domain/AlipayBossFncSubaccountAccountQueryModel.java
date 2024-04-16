package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财资子户信息查询
 *
 * @author auto create
 * @since 1.0, 2020-08-31 19:43:23
 */
public class AlipayBossFncSubaccountAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7221822283123387139L;

	/**
	 * 子户信息查询请求
	 */
	@ApiField("sub_account_info_query_order")
	private SubAccountInfoQueryOrder subAccountInfoQueryOrder;

	public SubAccountInfoQueryOrder getSubAccountInfoQueryOrder() {
		return this.subAccountInfoQueryOrder;
	}
	public void setSubAccountInfoQueryOrder(SubAccountInfoQueryOrder subAccountInfoQueryOrder) {
		this.subAccountInfoQueryOrder = subAccountInfoQueryOrder;
	}

}
