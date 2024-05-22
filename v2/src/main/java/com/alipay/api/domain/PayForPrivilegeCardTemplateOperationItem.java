package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充享惠卡包的操作项配置
 *
 * @author auto create
 * @since 1.0, 2022-10-31 21:53:57
 */
public class PayForPrivilegeCardTemplateOperationItem extends AlipayObject {

	private static final long serialVersionUID = 4185541143292946127L;

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
