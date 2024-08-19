package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜品销售属性模型
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:14:09
 */
public class KbdishPropertyInfo extends AlipayObject {

	private static final long serialVersionUID = 1168584394434452266L;

	/**
	 * “属性最多可选数”，默认为1，与“属性最少可选数”同时为空或同时非空，不能为0，数值不能大于销售属性值的数量，即property_value_info_list的长度
	 */
	@ApiField("max_count_limit")
	private String maxCountLimit;

	/**
	 * “属性最少可选数”，默认为1，与“属性最多可选数”同时为空或同时非空，不能为0，数值不能大于“属性最多可选数”
	 */
	@ApiField("min_count_limit")
	private String minCountLimit;

	/**
	 * 菜品属性名称
	 */
	@ApiField("property_name")
	private String propertyName;

	/**
	 * 菜品销售属性属性值模型
	 */
	@ApiListField("property_value_info_list")
	@ApiField("kbdish_property_value_info")
	private List<KbdishPropertyValueInfo> propertyValueInfoList;

	/**
	 * 菜品属性排序字段，从1一直递增到4
	 */
	@ApiField("sort")
	private String sort;

	public String getMaxCountLimit() {
		return this.maxCountLimit;
	}
	public void setMaxCountLimit(String maxCountLimit) {
		this.maxCountLimit = maxCountLimit;
	}

	public String getMinCountLimit() {
		return this.minCountLimit;
	}
	public void setMinCountLimit(String minCountLimit) {
		this.minCountLimit = minCountLimit;
	}

	public String getPropertyName() {
		return this.propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public List<KbdishPropertyValueInfo> getPropertyValueInfoList() {
		return this.propertyValueInfoList;
	}
	public void setPropertyValueInfoList(List<KbdishPropertyValueInfo> propertyValueInfoList) {
		this.propertyValueInfoList = propertyValueInfoList;
	}

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

}
