package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果对象
 *
 * @author auto create
 * @since 1.0, 2026-06-23 14:27:58
 */
public class SaleForceAmountConvertResponse extends AlipayObject {

	private static final long serialVersionUID = 5895256845655767612L;

	/**
	 * 最小货币单位整数
	 */
	@ApiField("amount_minor_units")
	private Long amountMinorUnits;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	public Long getAmountMinorUnits() {
		return this.amountMinorUnits;
	}
	public void setAmountMinorUnits(Long amountMinorUnits) {
		this.amountMinorUnits = amountMinorUnits;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
