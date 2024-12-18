package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用于查询城市列表
 *
 * @author auto create
 * @since 1.0, 2024-01-19 17:02:58
 */
public class IcpCityAreaItemList extends AlipayObject {

	private static final long serialVersionUID = 6121513633191315683L;

	/**
	 * 城市编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 地区列表信息
	 */
	@ApiListField("district_area_items")
	@ApiField("icp_district_area_item_list")
	private List<IcpDistrictAreaItemList> districtAreaItems;

	/**
	 * 城市中文名称
	 */
	@ApiField("name")
	private String name;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public List<IcpDistrictAreaItemList> getDistrictAreaItems() {
		return this.districtAreaItems;
	}
	public void setDistrictAreaItems(List<IcpDistrictAreaItemList> districtAreaItems) {
		this.districtAreaItems = districtAreaItems;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
