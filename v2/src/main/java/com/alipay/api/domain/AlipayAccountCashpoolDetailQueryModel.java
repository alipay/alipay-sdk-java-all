package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金池详情查询
 *
 * @author auto create
 * @since 1.0, 2020-07-06 11:21:20
 */
public class AlipayAccountCashpoolDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5167944519421374258L;

	/**
	 * 资金池唯一标识
	 */
	@ApiField("cash_pool_id")
	private String cashPoolId;

	public String getCashPoolId() {
		return this.cashPoolId;
	}
	public void setCashPoolId(String cashPoolId) {
		this.cashPoolId = cashPoolId;
	}

}
