package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 松贤测试xxx
 *
 * @author auto create
 * @since 1.0, 2018-08-09 22:08:42
 */
public class AlipayOpenEchoSendModel extends AlipayObject {

	private static final long serialVersionUID = 1221721928575544559L;

	/**
	 * city
	 */
	@ApiField("city")
	private String city;

	/**
	 * xxx
	 */
	@ApiField("name")
	private String name;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
