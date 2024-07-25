package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户地址信息数据结构
 *
 * @author auto create
 * @since 1.0, 2019-08-22 15:59:38
 */
public class Address extends AlipayObject {

	private static final long serialVersionUID = 1166393157284683633L;

	/**
	 * city，市名
	 */
	@ApiField("city")
	private String city;

	/**
	 * county，用于区、县的描述
	 */
	@ApiField("county")
	private String county;

	/**
	 * detail，地址详情
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * province，省份
	 */
	@ApiField("province")
	private String province;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return this.county;
	}
	public void setCounty(String county) {
		this.county = county;
	}

	public String getDetail() {
		return this.detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
