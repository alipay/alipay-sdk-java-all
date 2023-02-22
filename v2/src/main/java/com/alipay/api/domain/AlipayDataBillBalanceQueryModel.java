package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝商家账户当前余额查询
 *
 * @author auto create
 * @since 1.0, 2023-02-21 16:27:50
 */
public class AlipayDataBillBalanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8862159767749721355L;

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
