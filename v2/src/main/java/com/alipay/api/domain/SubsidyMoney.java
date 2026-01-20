package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贴息咨询金额接口
 *
 * @author auto create
 * @since 1.0, 2025-12-25 10:19:59
 */
public class SubsidyMoney extends AlipayObject {

	private static final long serialVersionUID = 7814341347912223319L;

	/**
	 * 金额，单位分
	 */
	@ApiField("cent")
	private Long cent;

	/**
	 * 货币
	 */
	@ApiField("currency")
	private SubsidyCurrency currency;

	public Long getCent() {
		return this.cent;
	}
	public void setCent(Long cent) {
		this.cent = cent;
	}

	public SubsidyCurrency getCurrency() {
		return this.currency;
	}
	public void setCurrency(SubsidyCurrency currency) {
		this.currency = currency;
	}

}
