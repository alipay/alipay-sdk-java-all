package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金池删除
 *
 * @author auto create
 * @since 1.0, 2020-07-06 11:20:47
 */
public class AlipayAccountCashpoolDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3731546434634182385L;

	/**
	 * 资金池ID
	 */
	@ApiField("cash_pool_id")
	private String cashPoolId;

	/**
	 * 操作员
	 */
	@ApiField("operator")
	private String operator;

	public String getCashPoolId() {
		return this.cashPoolId;
	}
	public void setCashPoolId(String cashPoolId) {
		this.cashPoolId = cashPoolId;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
