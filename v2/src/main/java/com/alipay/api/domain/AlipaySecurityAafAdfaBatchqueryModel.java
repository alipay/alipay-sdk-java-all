package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打发的发顺丰
 *
 * @author auto create
 * @since 1.0, 2020-04-03 17:09:38
 */
public class AlipaySecurityAafAdfaBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4169839393624412493L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
