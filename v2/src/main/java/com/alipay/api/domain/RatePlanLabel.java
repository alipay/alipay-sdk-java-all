package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 价格计划标签
 *
 * @author auto create
 * @since 1.0, 2024-06-17 11:38:49
 */
public class RatePlanLabel extends AlipayObject {

	private static final long serialVersionUID = 8775719577188393123L;

	/**
	 * 标签类别
	 */
	@ApiField("label_category")
	private String labelCategory;

	/**
	 * 标签描述
	 */
	@ApiField("label_desc")
	private String labelDesc;

	/**
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签名称
	 */
	@ApiField("label_name")
	private String labelName;

	public String getLabelCategory() {
		return this.labelCategory;
	}
	public void setLabelCategory(String labelCategory) {
		this.labelCategory = labelCategory;
	}

	public String getLabelDesc() {
		return this.labelDesc;
	}
	public void setLabelDesc(String labelDesc) {
		this.labelDesc = labelDesc;
	}

	public String getLabelId() {
		return this.labelId;
	}
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

}
