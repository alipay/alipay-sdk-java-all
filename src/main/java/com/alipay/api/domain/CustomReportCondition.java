package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自定义报表规则条件信息
 *
 * @author auto create
 * @since 1.0, 2016-12-05 17:13:15
 */
public class CustomReportCondition extends AlipayObject {

	private static final long serialVersionUID = 5413812313694867782L;

	/**
	 * 规则KEY-为空则为创建规则，否则更新规则
	 */
	@ApiField("condition_key")
	private String conditionKey;

	/**
	 * 明细数据标签
	 */
	@ApiListField("data_tags")
	@ApiField("data_tag")
	private List<DataTag> dataTags;

	/**
	 * 分组过滤条件
	 */
	@ApiListField("filter_tags")
	@ApiField("filter_tag")
	private List<FilterTag> filterTags;

	/**
	 * 分组数据标签集合
注意：这个是JSON数组，必须以[开头，以]结尾，[]外层不能加双引号"",正确案例["orpt_ubase_age","orpt_ubase_birthday_mm"]，错误案例："["orpt_ubase_age","orpt_ubase_birthday_mm"]"
	 */
	@ApiField("group_tags")
	private String groupTags;

	/**
	 * 规则描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 自定义报表名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 排序数据标签集合
注意：这个是JSON数组，必须以[开头，以]结尾，[]外层不能加双引号"",正确案例[{"code":"orpt_ubase_age","sortBy":"DESC"}]，错误案例："[{"code":"orpt_ubase_age","sortBy":"DESC"}]"
	 */
	@ApiField("sort_tags")
	private String sortTags;

	public String getConditionKey() {
		return this.conditionKey;
	}
	public void setConditionKey(String conditionKey) {
		this.conditionKey = conditionKey;
	}

	public List<DataTag> getDataTags() {
		return this.dataTags;
	}
	public void setDataTags(List<DataTag> dataTags) {
		this.dataTags = dataTags;
	}

	public List<FilterTag> getFilterTags() {
		return this.filterTags;
	}
	public void setFilterTags(List<FilterTag> filterTags) {
		this.filterTags = filterTags;
	}

	public String getGroupTags() {
		return this.groupTags;
	}
	public void setGroupTags(String groupTags) {
		this.groupTags = groupTags;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSortTags() {
		return this.sortTags;
	}
	public void setSortTags(String sortTags) {
		this.sortTags = sortTags;
	}

}
