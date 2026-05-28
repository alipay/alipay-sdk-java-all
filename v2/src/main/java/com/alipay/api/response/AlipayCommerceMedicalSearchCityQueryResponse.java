package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ProvinceVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.search.city.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-25 14:37:16
 */
public class AlipayCommerceMedicalSearchCityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4679297826445954321L;

	/** 
	 * 省份数据列表
	 */
	@ApiField("province_list")
	private ProvinceVo provinceList;

	public void setProvinceList(ProvinceVo provinceList) {
		this.provinceList = provinceList;
	}
	public ProvinceVo getProvinceList( ) {
		return this.provinceList;
	}

}
