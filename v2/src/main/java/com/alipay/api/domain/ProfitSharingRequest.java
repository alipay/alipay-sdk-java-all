package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账信息
 *
 * @author auto create
 * @since 1.0, 2024-04-22 15:26:15
 */
public class ProfitSharingRequest extends AlipayObject {

	private static final long serialVersionUID = 1375353934848779621L;

	/**
	 * 参与分账的目标支付宝账号 2088**********34
	 */
	@ApiField("alloc_account")
	private String allocAccount;

	/**
	 * 分账到目标支付宝账号的金额，单位元
	 */
	@ApiField("alloc_amount")
	private String allocAmount;

	public String getAllocAccount() {
		return this.allocAccount;
	}
	public void setAllocAccount(String allocAccount) {
		this.allocAccount = allocAccount;
	}

	public String getAllocAmount() {
		return this.allocAmount;
	}
	public void setAllocAmount(String allocAmount) {
		this.allocAmount = allocAmount;
	}

}
