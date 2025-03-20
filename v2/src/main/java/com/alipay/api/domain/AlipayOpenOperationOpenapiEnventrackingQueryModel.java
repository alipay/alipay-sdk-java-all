package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前后端埋点
 *
 * @author auto create
 * @since 1.0, 2024-06-27 11:20:27
 */
public class AlipayOpenOperationOpenapiEnventrackingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3272772592358497672L;

	/**
	 * 参数描述
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
