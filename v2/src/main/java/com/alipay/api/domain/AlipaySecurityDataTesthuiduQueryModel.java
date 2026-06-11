package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试灰度状态发布
 *
 * @author auto create
 * @since 1.0, 2026-06-10 16:02:55
 */
public class AlipaySecurityDataTesthuiduQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4419783345737485786L;

	/**
	 * 年龄
	 */
	@ApiField("age")
	private String age;

	/**
	 * 用户信息
	 */
	@ApiField("user_info")
	private HuiDuTest userInfo;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public HuiDuTest getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(HuiDuTest userInfo) {
		this.userInfo = userInfo;
	}

}
