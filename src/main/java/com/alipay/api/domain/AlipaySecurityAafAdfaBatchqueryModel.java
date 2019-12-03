package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打发的发顺丰
 *
 * @author auto create
 * @since 1.0, 2019-07-11 15:57:19
 */
public class AlipaySecurityAafAdfaBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2119177999267794512L;

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
