package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CityFunction;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.city.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-08 21:29:59
 */
public class AlipayCommerceCityfacilitatorCityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7128422371828826526L;

	/** 
	 * 城市列表
	 */
	@ApiListField("citys")
	@ApiField("city_function")
	private List<CityFunction> citys;

	public void setCitys(List<CityFunction> citys) {
		this.citys = citys;
	}
	public List<CityFunction> getCitys( ) {
		return this.citys;
	}

}
