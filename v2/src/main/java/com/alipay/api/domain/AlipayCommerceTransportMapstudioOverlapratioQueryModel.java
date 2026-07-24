package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线路重复度数据获取
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:40:49
 */
public class AlipayCommerceTransportMapstudioOverlapratioQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5175379584885862715L;

	/**
	 * 城市区域编码，例如南京：320100
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
