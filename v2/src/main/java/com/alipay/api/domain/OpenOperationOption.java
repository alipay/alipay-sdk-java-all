package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签圈选项下的圈选值列表，比如「预测地域分布」标签，圈选值为地域树，「性别」标签，圈选值为男和女
 *
 * @author auto create
 * @since 1.0, 2024-06-03 16:16:05
 */
public class OpenOperationOption extends AlipayObject {

	private static final long serialVersionUID = 2516139251835535139L;

	/**
	 * 标签圈选值的描述性信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 标签圈选值ID，创建标签圈选人群时需要传入对应圈选值的ID。
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 如果标签圈选值为树形结构，例如「预测地域分布」的标签值「地域树」，返回当前值的父值ID
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 如果标签圈选值为树形结构，例如「预测地域分布」的标签值「地域树」，返回当前值的父值
	 */
	@ApiField("parent_value")
	private String parentValue;

	/**
	 * 标签圈选的展示标题
	 */
	@ApiField("text")
	private String text;

	/**
	 * 标签圈选需要传入的实际圈选值
	 */
	@ApiField("value")
	private String value;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
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
