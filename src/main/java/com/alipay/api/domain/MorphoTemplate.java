package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 闪蝶搭建中台模板信息
 *
 * @author auto create
 * @since 1.0, 2019-11-18 10:35:30
 */
public class MorphoTemplate extends AlipayObject {

	private static final long serialVersionUID = 8221843547739329965L;

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
