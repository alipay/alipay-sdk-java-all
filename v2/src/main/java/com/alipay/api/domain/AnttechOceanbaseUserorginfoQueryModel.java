package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息和组织信息查询接口
 *
 * @author auto create
 * @since 1.0, 2024-06-19 17:06:53
 */
public class AnttechOceanbaseUserorginfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7494458947934977373L;

	/**
	 * 邮箱或者手机号
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
