package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业码门店搜索条件
 *
 * @author auto create
 * @since 1.0, 2024-05-06 16:53:20
 */
public class ConditionInfo extends AlipayObject {

	private static final long serialVersionUID = 4312675182882195247L;

	/**
	 * 条件表达式标识，用于标识表达式
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 操作符，可选值：AND - 并条件；OR - 或条件；NOT - 非条件
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 条件优先级，数字越小表示优先级越高，从1开始
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 标签信息列表，AND 和 OR 条件可对应多个，NOT条件只允许一个值
	 */
	@ApiListField("tag_list")
	@ApiField("tag_info")
	private List<TagInfo> tagList;

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public List<TagInfo> getTagList() {
		return this.tagList;
	}
	public void setTagList(List<TagInfo> tagList) {
		this.tagList = tagList;
	}

}
