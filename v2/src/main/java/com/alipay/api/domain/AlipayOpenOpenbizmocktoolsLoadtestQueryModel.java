package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openbizmock压测使用接口
 *
 * @author auto create
 * @since 1.0, 2026-04-02 22:19:49
 */
public class AlipayOpenOpenbizmocktoolsLoadtestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5747331125645235535L;

	/**
	 * 名称
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
