package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前后端埋点
 *
 * @author auto create
 * @since 1.0, 2023-04-21 21:52:28
 */
public class AlipayOpenOperationOpenapiEnventrackingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6684525522634931484L;

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
