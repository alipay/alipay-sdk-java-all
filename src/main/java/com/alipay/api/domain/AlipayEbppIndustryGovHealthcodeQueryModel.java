package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝健康码查询
 *
 * @author auto create
 * @since 1.0, 2020-03-11 16:34:35
 */
public class AlipayEbppIndustryGovHealthcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2799147323352765727L;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

}
