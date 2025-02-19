package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行动点信息
 *
 * @author auto create
 * @since 1.0, 2018-11-29 17:44:49
 */
public class MemberActionModel extends AlipayObject {

	private static final long serialVersionUID = 4415241487984483117L;

	/**
	 * 行动点业务CODE，商户自定义
	 */
	@ApiField("code")
	private String code;

	/**
	 * 行动点展示文案
	 */
	@ApiField("text")
	private String text;

	/**
	 * 行动点跳转链接
	 */
	@ApiField("url")
	private String url;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

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
