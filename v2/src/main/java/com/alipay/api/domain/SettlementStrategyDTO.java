package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * voyager标准的结算策略模型
 *
 * @author auto create
 * @since 1.0, 2026-06-25 11:09:53
 */
public class SettlementStrategyDTO extends AlipayObject {

	private static final long serialVersionUID = 7524344366848739786L;

	/**
	 * 结算币种
	 */
	@ApiField("settlement_currency")
	private String settlementCurrency;

	public String getSettlementCurrency() {
		return this.settlementCurrency;
	}
	public void setSettlementCurrency(String settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}

}
