package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前后端埋点
 *
 * @author auto create
 * @since 1.0, 2023-04-19 10:08:31
 */
public class AlipayOpenOperationOpenapiEnventrackingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4822161347982238321L;

	/**
	 * test
	 */
	@ApiField("u_tset")
	private String uTset;

	public String getuTset() {
		return this.uTset;
	}
	public void setuTset(String uTset) {
		this.uTset = uTset;
	}

}
