package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 节点选项详情
 *
 * @author auto create
 * @since 1.0, 2023-11-09 19:22:08
 */
public class CrowdOperationNodeOptionDetail extends AlipayObject {

	private static final long serialVersionUID = 1224592833516419946L;

	/**
	 * 选项值展示描述文案
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 选项值ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 父节点值ID
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 父节点选项值
	 */
	@ApiField("parent_value")
	private String parentValue;

	/**
	 * 优先级
	 */
	@ApiField("priority")
	private String priority;

	/**
	 * 选项值展示文案
	 */
	@ApiField("text")
	private String text;

	/**
	 * 选项值
	 */
	@ApiField("value")
	private String value;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentValue() {
		return this.parentValue;
	}
	public void setParentValue(String parentValue) {
		this.parentValue = parentValue;
	}

	public String getPriority() {
		return this.priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
