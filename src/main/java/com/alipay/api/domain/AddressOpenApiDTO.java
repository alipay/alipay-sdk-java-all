package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地址dto
 *
 * @author auto create
 * @since 1.0, 2021-12-27 09:28:22
 */
public class AddressOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 5147574792594177595L;

	/**
	 * 详细地址
	 */
	@ApiField("addr")
	private String addr;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 国家/区域
	 */
	@ApiField("country")
	private String country;

	/**
	 * 省/州
	 */
	@ApiField("province")
	private String province;

	public String getAddr() {
		return this.addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
