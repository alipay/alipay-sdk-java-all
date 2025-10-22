package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 定向城市信息
 *
 * @author auto create
 * @since 1.0, 2023-03-26 14:07:49
 */
public class RecruitServingTargetCity extends AlipayObject {

	private static final long serialVersionUID = 3641922552918529386L;

	/**
	 * 是否全国。
与 city_codes 二选一。
	 */
	@ApiField("all_city")
	private Boolean allCity;

	/**
	 * 城市码列表。
与 all_city 二选一。
最大数量不超过999个。
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
