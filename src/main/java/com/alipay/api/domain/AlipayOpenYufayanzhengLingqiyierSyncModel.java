package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预发验证零七一二一
 *
 * @author auto create
 * @since 1.0, 2019-03-05 11:33:11
 */
public class AlipayOpenYufayanzhengLingqiyierSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5664621527263359662L;

	/**
	 * 国家
	 */
	@ApiField("country")
	private String country;

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
