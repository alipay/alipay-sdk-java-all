package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 现货发货时效
 *
 * @author auto create
 * @since 1.0, 2024-07-15 15:44:16
 */
public class ShippingTimeLimitVO extends AlipayObject {

	private static final long serialVersionUID = 2613553522523494216L;

	/**
	 * 物流发货时效
	 */
	@ApiField("code")
	private String code;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

}
