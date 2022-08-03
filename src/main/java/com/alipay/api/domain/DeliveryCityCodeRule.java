package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 推广城市规则
 *
 * @author auto create
 * @since 1.0, 2022-07-27 20:09:24
 */
public class DeliveryCityCodeRule extends AlipayObject {

	private static final long serialVersionUID = 7388195686977436649L;

	/**
	 * 是否全国。 与city_codes二选一。只允许填true，否则不填。
	 */
	@ApiField("all_city")
	private Boolean allCity;

	/**
	 * 城市编码。与all_city二选一。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
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
