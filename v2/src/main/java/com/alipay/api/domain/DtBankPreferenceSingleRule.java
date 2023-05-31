package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定额立减规则
 *
 * @author auto create
 * @since 1.0, 2023-05-23 17:24:57
 */
public class DtBankPreferenceSingleRule extends AlipayObject {

	private static final long serialVersionUID = 5756885569344242548L;

	/**
	 * 定额立减金额，单位分
	 */
	@ApiField("amount")
	private Long amount;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

}
