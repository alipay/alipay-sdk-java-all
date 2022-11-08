package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金结算明细汇总对象
 *
 * @author auto create
 * @since 1.0, 2022-08-29 18:05:33
 */
public class BizFundSettleSummary extends AlipayObject {

	private static final long serialVersionUID = 5313476883936944682L;

	/**
	 * 整单手续费
	 */
	@ApiField("charge")
	private String charge;

	public String getCharge() {
		return this.charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}

}
