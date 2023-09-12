package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 可选标签值列表
 *
 * @author auto create
 * @since 1.0, 2023-05-16 11:10:15
 */
public class CrowdSelectTagOptionOpen extends AlipayObject {

	private static final long serialVersionUID = 6591428292715913788L;

	/**
	 * 二级标签值列表
	 */
	@ApiListField("children")
	@ApiField("crowd_select_tag_sub_option_open")
	private List<CrowdSelectTagSubOptionOpen> children;

	/**
	 * 标签值中文名称
	 */
	@ApiField("text")
	private String text;

	/**
	 * 标签值，通过标签创建人群时使用
	 */
	@ApiField("value")
	private String value;

	public List<CrowdSelectTagSubOptionOpen> getChildren() {
		return this.children;
	}
	public void setChildren(List<CrowdSelectTagSubOptionOpen> children) {
		this.children = children;
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
