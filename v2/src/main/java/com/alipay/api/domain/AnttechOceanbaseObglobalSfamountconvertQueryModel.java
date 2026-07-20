package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saleforce查询汇率转换后金额
 *
 * @author auto create
 * @since 1.0, 2026-06-23 14:27:58
 */
public class AnttechOceanbaseObglobalSfamountconvertQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6241514545332693352L;

	/**
	 * 最小货币单位整数
	 */
	@ApiField("amount_minor_units")
	private Long amountMinorUnits;

	/**
	 * 原币种
	 */
	@ApiField("from_currency")
	private String fromCurrency;

	/**
	 * 目标币种
	 */
	@ApiField("to_currency")
	private String toCurrency;

	public Long getAmountMinorUnits() {
		return this.amountMinorUnits;
	}
	public void setAmountMinorUnits(Long amountMinorUnits) {
		this.amountMinorUnits = amountMinorUnits;
	}

	public String getFromCurrency() {
		return this.fromCurrency;
	}
	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return this.toCurrency;
	}
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

}
