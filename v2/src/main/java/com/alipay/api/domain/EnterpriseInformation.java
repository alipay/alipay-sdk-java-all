package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业信息
 *
 * @author auto create
 * @since 1.0, 2022-12-27 18:16:18
 */
public class EnterpriseInformation extends AlipayObject {

	private static final long serialVersionUID = 6294812432626922144L;

	/**
	 * 企业名称
	 */
	@ApiField("name")
	private String name;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
