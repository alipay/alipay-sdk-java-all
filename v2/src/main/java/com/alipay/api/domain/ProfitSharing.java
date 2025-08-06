package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退分账参数
 *
 * @author auto create
 * @since 1.0, 2024-04-12 14:32:10
 */
public class ProfitSharing extends AlipayObject {

	private static final long serialVersionUID = 3563868561484419169L;

	/**
	 * 参与退分账的目标支付宝账号，长度16位纯数字
	 */
	@ApiField("alloc_account")
	private String allocAccount;

	/**
	 * 退分账金额，单元元
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
