package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打发的发顺丰
 *
 * @author auto create
 * @since 1.0, 2019-09-26 11:34:43
 */
public class AlipaySecurityAafAdfaBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6446375821131944849L;

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
