package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询免费额度
 *
 * @author auto create
 * @since 1.0, 2019-05-05 00:02:48
 */
public class AlipayFundTransFreeamountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4777957122123829242L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
