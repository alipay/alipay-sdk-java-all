package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新闻标签结构
 *
 * @author auto create
 * @since 1.0, 2021-12-22 17:28:08
 */
public class NewsConcernedLabel extends AlipayObject {

	private static final long serialVersionUID = 5299535714187323933L;

	/**
	 * 标签定义编号
	 */
	@ApiField("label_code")
	private String labelCode;

	/**
	 * 标签说明
	 */
	@ApiField("label_name")
	private String labelName;

	/**
	 * 标签类型显示名称
	 */
	@ApiField("label_show_name")
	private String labelShowName;

	/**
	 * 标签类型定义
	 */
	@ApiField("label_type")
	private String labelType;

	public String getLabelCode() {
		return this.labelCode;
	}
	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getLabelShowName() {
		return this.labelShowName;
	}
	public void setLabelShowName(String labelShowName) {
		this.labelShowName = labelShowName;
	}

	public String getLabelType() {
		return this.labelType;
	}
	public void setLabelType(String labelType) {
		this.labelType = labelType;
	}

}
