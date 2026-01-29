package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自定义标签的枚举值信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class DataEnumValue extends AlipayObject {

	private static final long serialVersionUID = 6812294398298291538L;

	/**
	 * 过滤条件
	 */
	@ApiListField("filter_tags")
	@ApiField("filter_tag")
	private List<FilterTag> filterTags;

	/**
	 * 枚举的展示文本
	 */
	@ApiField("label")
	private String label;

	/**
	 * 自定义标签的枚举值
	 */
	@ApiField("value")
	private String value;

	public List<FilterTag> getFilterTags() {
		return this.filterTags;
	}
	public void setFilterTags(List<FilterTag> filterTags) {
		this.filterTags = filterTags;
	}

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
