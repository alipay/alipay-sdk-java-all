package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝商家账户当前余额查询
 *
 * @author auto create
 * @since 1.0, 2025-08-14 18:13:49
 */
public class AlipayDataBillBalanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7623924769592428582L;

	/**
	 * 目标查询账户（仅支持部分场景，查询自身时候不需要传递当前字段）。
	 */
	@ApiField("bill_user_id")
	private String billUserId;

	public String getBillUserId() {
		return this.billUserId;
	}
	public void setBillUserId(String billUserId) {
		this.billUserId = billUserId;
	}

}
