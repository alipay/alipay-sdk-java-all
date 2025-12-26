package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贴息咨询货币标记
 *
 * @author auto create
 * @since 1.0, 2025-12-25 10:19:59
 */
public class SubsidyCurrency extends AlipayObject {

	private static final long serialVersionUID = 1363922357711525548L;

	/**
	 * 该货币的ISO 4217货币代码。
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * 该货币的默认小数位数。根据货币数据表设置。
	 */
	@ApiField("default_fraction_digits")
	private Long defaultFractionDigits;

	/**
	 * 该货币的ISO 4217数字代码。根据货币数据表设置。
	 */
	@ApiField("numeric_code")
	private Long numericCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Long getDefaultFractionDigits() {
		return this.defaultFractionDigits;
	}
	public void setDefaultFractionDigits(Long defaultFractionDigits) {
		this.defaultFractionDigits = defaultFractionDigits;
	}

	public Long getNumericCode() {
		return this.numericCode;
	}
	public void setNumericCode(Long numericCode) {
		this.numericCode = numericCode;
	}

}
