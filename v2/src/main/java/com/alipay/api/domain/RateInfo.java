package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 税率信息
 *
 * @author auto create
 * @since 1.0, 2025-07-07 14:29:56
 */
public class RateInfo extends AlipayObject {

	private static final long serialVersionUID = 2112583466192625496L;

	/**
	 * 税率描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 税率
	 */
	@ApiField("rate")
	private String rate;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

}
