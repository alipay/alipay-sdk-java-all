package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CityShopModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.department.shops.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:47:50
 */
public class KoubeiMerchantDepartmentShopsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8835198832154571515L;

	/** 
	 * 根据部门id查询返回的门店模型列表
	 */
	@ApiListField("city_shop_models")
	@ApiField("city_shop_model")
	private List<CityShopModel> cityShopModels;

	/** 
	 * 部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	public void setCityShopModels(List<CityShopModel> cityShopModels) {
		this.cityShopModels = cityShopModels;
	}
	public List<CityShopModel> getCityShopModels( ) {
		return this.cityShopModels;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptId( ) {
		return this.deptId;
	}

}
