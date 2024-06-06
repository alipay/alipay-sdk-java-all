package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IP地址归属地对象。其中province为IP地址归属地的省，city为IP地址归属地的城市
 *
 * @author auto create
 * @since 1.0, 2018-03-30 16:27:11
 */
public class IpAddrLbsInfo extends AlipayObject {

	private static final long serialVersionUID = 1632987389643325673L;

	/**
	 * IP地址归属地所以城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * IP归属地所在的省
	 */
	@ApiField("province")
	private String province;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
