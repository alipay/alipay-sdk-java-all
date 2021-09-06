package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模板操作项
 *
 * @author auto create
 * @since 1.0, 2021-08-18 16:02:06
 */
public class MemberCardTemplateOperationItem extends AlipayObject {

	private static final long serialVersionUID = 3328258443688344943L;

	/**
	 * 卡模板操作项的文本
	 */
	@ApiField("text")
	private String text;

	/**
	 * 卡模板操作项的跳转链接
	 */
	@ApiField("url")
	private String url;

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
