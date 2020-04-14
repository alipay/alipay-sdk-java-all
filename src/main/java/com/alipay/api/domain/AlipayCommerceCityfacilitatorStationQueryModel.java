package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地铁购票站点查询
 *
 * @author auto create
 * @since 1.0, 2019-10-10 16:31:07
 */
public class AlipayCommerceCityfacilitatorStationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3813274597512419562L;

	/**
	 * 城市编码请参考查询：http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201504/t20150415_712722.html；
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
