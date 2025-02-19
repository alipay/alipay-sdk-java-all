package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网关开放测试入门
 *
 * @author auto create
 * @since 1.0, 2024-07-17 19:25:21
 */
public class AlipayOpenOpenbizmockNewinterfaceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3374218125539933771L;

	/**
	 * 2
	 */
	@ApiField("string_2")
	private Long string2;

	/**
	 * 2
	 */
	@ApiField("string_un")
	private String stringUn;

	public Long getString2() {
		return this.string2;
	}
	public void setString2(Long string2) {
		this.string2 = string2;
	}

	public String getStringUn() {
		return this.stringUn;
	}
	public void setStringUn(String stringUn) {
		this.stringUn = stringUn;
	}

}
