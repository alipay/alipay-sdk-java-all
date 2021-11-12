package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单金额明细
 *
 * @author auto create
 * @since 1.0, 2019-04-02 13:41:02
 */
public class CustScpBillAmtVO extends AlipayObject {

	private static final long serialVersionUID = 1437733227884292218L;

	/**
	 * 费用
	 */
	@ApiField("fee")
	private String fee;

	/**
	 * 本金
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
