package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 闪蝶搭建中台模板信息
 *
 * @author auto create
 * @since 1.0, 2019-12-08 18:38:20
 */
public class MorphoTemplate extends AlipayObject {

	private static final long serialVersionUID = 5618633559368855839L;

	/**
	 * 闪蝶搭建平台模板名称
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
