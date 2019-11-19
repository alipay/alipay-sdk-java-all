package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 徐伟波测试toapi
 *
 * @author auto create
 * @since 1.0, 2018-03-28 16:33:28
 */
public class AlipayOpenXwbtesttomsgapiSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3287994934728912617L;

	/**
	 * 1
	 */
	@ApiField("xwb")
	private String xwb;

	public String getXwb() {
		return this.xwb;
	}
	public void setXwb(String xwb) {
		this.xwb = xwb;
	}

}
