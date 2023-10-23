package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 课程/店铺标签模型
 *
 * @author auto create
 * @since 1.0, 2021-03-10 16:54:44
 */
public class TagInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2384486271817673749L;

	/**
	 * 标签code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 标签名称
	 */
	@ApiField("name")
	private String name;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
