package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地铁购票站点查询
 *
 * @author auto create
 * @since 1.0, 2024-12-09 16:03:24
 */
public class AlipayCommerceCityfacilitatorStationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6551548833243398792L;

	/**
	 * 城市编码请参考查询 <a href="http://www.mca.gov.cn/article/sj/xzqh/">中华人民共和国行政区划代码</a>。
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
