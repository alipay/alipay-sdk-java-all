package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用于查询省市区区域信息列表
 *
 * @author auto create
 * @since 1.0, 2024-01-19 17:02:58
 */
public class IcpProvinceAreaItemList extends AlipayObject {

	private static final long serialVersionUID = 5728871997579975161L;

	/**
	 * 城市列表信息
	 */
	@ApiListField("city_area_items")
	@ApiField("icp_city_area_item_list")
	private List<IcpCityAreaItemList> cityAreaItems;

	/**
	 * 省份的编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 省份中文名称
	 */
	@ApiField("name")
	private String name;

	public List<IcpCityAreaItemList> getCityAreaItems() {
		return this.cityAreaItems;
	}
	public void setCityAreaItems(List<IcpCityAreaItemList> cityAreaItems) {
		this.cityAreaItems = cityAreaItems;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
