package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投放可用城市编码
 *
 * @author auto create
 * @since 1.0, 2024-06-26 10:59:20
 */
public class DeliveryAvailableCityCode extends AlipayObject {

	private static final long serialVersionUID = 6578831777918713346L;

	/**
	 * 是否全国。 与city_codes二选一。只允许填true，否则不填。
	 */
	@ApiField("all_city")
	private Boolean allCity;

	/**
	 * 城市编码。与all_city二选一。请按照<a href ="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx">https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx</a>  表格中内容填写。 （参考资料： <a href ="http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/">http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/</a> ）
	 */
	@ApiListField("city_codes")
	@ApiField("string")
	private List<String> cityCodes;

	public Boolean getAllCity() {
		return this.allCity;
	}
	public void setAllCity(Boolean allCity) {
		this.allCity = allCity;
	}

	public List<String> getCityCodes() {
		return this.cityCodes;
	}
	public void setCityCodes(List<String> cityCodes) {
		this.cityCodes = cityCodes;
	}

}
