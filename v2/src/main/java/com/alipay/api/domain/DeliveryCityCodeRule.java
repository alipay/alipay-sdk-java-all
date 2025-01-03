package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 推广城市规则
 *
 * @author auto create
 * @since 1.0, 2024-06-26 10:59:20
 */
public class DeliveryCityCodeRule extends AlipayObject {

	private static final long serialVersionUID = 4134388638869188568L;

	/**
	 * 是否全国。只允许填true，否则不填。
	 */
	@ApiField("all_city")
	private Boolean allCity;

	/**
	 * 城市编码。请按照<a href ="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx">https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx</a>  表格中内容填写。 （参考资料： <a href ="http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/">http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/</a> ）
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
