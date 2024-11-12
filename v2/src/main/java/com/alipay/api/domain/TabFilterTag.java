package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * TabFilterTag
 *
 * @author auto create
 * @since 1.0, 2024-05-21 15:19:33
 */
public class TabFilterTag extends AlipayObject {

	private static final long serialVersionUID = 4393479157596577914L;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 显示类型
	 */
	@ApiField("show_type")
	private String showType;

	/**
	 * 文本
	 */
	@ApiField("text")
	private String text;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getShowType() {
		return this.showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
