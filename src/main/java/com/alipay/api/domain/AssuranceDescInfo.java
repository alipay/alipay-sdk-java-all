package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * {“text“:”xxxx”,”link”:”https://xxx”}服务保障,text表示简述文字，最大100个字符，link表示说明链接，可不传，如果提供，必须保障是可访问的html5页面链接
 *
 * @author auto create
 * @since 1.0, 2016-12-21 15:35:15
 */
public class AssuranceDescInfo extends AlipayObject {

	private static final long serialVersionUID = 5843132723585282348L;

	/**
	 * link表示说明链接，可不传，如果提供，必须保障是可访问的html5页面链接
	 */
	@ApiField("link")
	private String link;

	/**
	 * 服务保障,text表示简述文字，最大100个字符
	 */
	@ApiField("text")
	private String text;

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
