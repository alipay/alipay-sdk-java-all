package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁服务信息
 *
 * @author auto create
 * @since 1.0, 2023-05-23 18:13:31
 */
public class RentServiceInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2495533138417279378L;

	/**
	 * 借贷专户ID
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 账户余额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	public String getAccountBookId() {
		return this.accountBookId;
	}
	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

}
