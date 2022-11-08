package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业信息
 *
 * @author auto create
 * @since 1.0, 2022-08-22 11:18:50
 */
public class EnterpriseInfo extends AlipayObject {

	private static final long serialVersionUID = 8542562877459744351L;

	/**
	 * 公司名称
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
