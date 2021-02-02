package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地铁购票站点查询
 *
 * @author auto create
 * @since 1.0, 2020-12-18 13:41:59
 */
public class AlipayCommerceCityfacilitatorStationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4324686325453988888L;

	/**
	 * 城市编码为城市行政代码。
已支持城市：广州 440100，深圳 440300，杭州330100。
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
