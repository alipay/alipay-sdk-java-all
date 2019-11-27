package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 西折测试接口
 *
 * @author auto create
 * @since 1.0, 2019-06-13 20:04:12
 */
public class AlipaySecurityTestTsetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3673278285694299513L;

	/**
	 * 1
	 */
	@ApiField("age")
	private XizheTestObject age;

	/**
	 * 20170901
	 */
	@ApiField("cost")
	private String cost;

	/**
	 * 1
	 */
	@ApiField("time")
	private Date time;

	public XizheTestObject getAge() {
		return this.age;
	}
	public void setAge(XizheTestObject age) {
		this.age = age;
	}

	public String getCost() {
		return this.cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}

	public Date getTime() {
		return this.time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

}
