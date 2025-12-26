package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单分期金额
 *
 * @author auto create
 * @since 1.0, 2024-09-10 14:37:18
 */
public class BillTermAmountVO extends AlipayObject {

	private static final long serialVersionUID = 8347693427811418964L;

	/**
	 * 利息，元
	 */
	@ApiField("fee")
	private String fee;

	/**
	 * 本金，元
	 */
	@ApiField("prin")
	private String prin;

	public String getFee() {
		return this.fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getPrin() {
		return this.prin;
	}
	public void setPrin(String prin) {
		this.prin = prin;
	}

}
