package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试authtoken
 *
 * @author auto create
 * @since 1.0, 2024-05-17 14:23:13
 */
public class AlipaySecurityProdJhjtestSupportauthtokenModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4726164733721276419L;

	/**
	 * 2313
	 */
	@ApiField("aaa")
	private String aaa;

	public String getAaa() {
		return this.aaa;
	}
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

}
