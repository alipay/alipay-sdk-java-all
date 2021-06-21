package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * qerqerqer
 *
 * @author auto create
 * @since 1.0, 2021-06-16 17:43:34
 */
public class ZhimaOpenQerqQerqQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7722818766773753847L;

	/**
	 * 123
	 */
	@ApiField("address")
	private AgreementParams address;

	public AgreementParams getAddress() {
		return this.address;
	}
	public void setAddress(AgreementParams address) {
		this.address = address;
	}

}
