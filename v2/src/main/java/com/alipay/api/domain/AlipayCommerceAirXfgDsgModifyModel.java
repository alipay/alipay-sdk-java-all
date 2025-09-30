package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 吃饭更好
 *
 * @author auto create
 * @since 1.0, 2021-12-06 09:57:35
 */
public class AlipayCommerceAirXfgDsgModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2146917863232496468L;

	/**
	 * 用户年龄
	 */
	@ApiField("age")
	private String age;

	/**
	 * 用户名
	 */
	@ApiField("nam")
	private String nam;

	/**
	 * 男
	 */
	@ApiField("sex")
	private String sex;

	/**
	 * 1
	 */
	@ApiField("xbw")
	private String xbw;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getNam() {
		return this.nam;
	}
	public void setNam(String nam) {
		this.nam = nam;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getXbw() {
		return this.xbw;
	}
	public void setXbw(String xbw) {
		this.xbw = xbw;
	}

}
