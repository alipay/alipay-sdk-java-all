package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息
 *
 * @author auto create
 * @since 1.0, 2021-09-01 10:16:14
 */
public class ScenicTrafficUserInfo extends AlipayObject {

	private static final long serialVersionUID = 2157872812828288241L;

	/**
	 * 姓名，isv请做脱敏处理。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 电话，isv请做脱敏处理。
	 */
	@ApiField("telephone")
	private String telephone;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
