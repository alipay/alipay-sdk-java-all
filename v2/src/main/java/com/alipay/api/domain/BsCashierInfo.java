package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收银信息
 *
 * @author auto create
 * @since 1.0, 2025-03-25 12:45:37
 */
public class BsCashierInfo extends AlipayObject {

	private static final long serialVersionUID = 4743268124212473551L;

	/**
	 * 门店的收银类型
	 */
	@ApiField("cashier_type")
	private String cashierType;

	public String getCashierType() {
		return this.cashierType;
	}
	public void setCashierType(String cashierType) {
		this.cashierType = cashierType;
	}

}
