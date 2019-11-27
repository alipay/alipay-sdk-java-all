package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地方大
 *
 * @author auto create
 * @since 1.0, 2019-10-19 17:56:55
 */
public class AlipaySecurityDfsdfsaSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2464381683284371353L;

	/**
	 * 1
	 */
	@ApiField("des")
	private String des;

	public String getDes() {
		return this.des;
	}
	public void setDes(String des) {
		this.des = des;
	}

}
