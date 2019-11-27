package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地址
 *
 * @author auto create
 * @since 1.0, 2018-11-26 15:23:44
 */
public class CicadamodelAddress extends AlipayObject {

	private static final long serialVersionUID = 1371771181967968433L;

	/**
	 * 市区
	 */
	@ApiField("city")
	private String city;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
