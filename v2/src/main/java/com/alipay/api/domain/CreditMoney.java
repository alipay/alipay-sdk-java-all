package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用金额
 *
 * @author auto create
 * @since 1.0, 2024-10-31 15:02:14
 */
public class CreditMoney extends AlipayObject {

	private static final long serialVersionUID = 8252351789486834115L;

	/**
	 * 金额-分
	 */
	@ApiField("cent")
	private Long cent;

	/**
	 * 币种
	 */
	@ApiField("currency_code")
	private String currencyCode;

	public Long getCent() {
		return this.cent;
	}
	public void setCent(Long cent) {
		this.cent = cent;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}
