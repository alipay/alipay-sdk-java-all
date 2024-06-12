package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 父元素信息
 *
 * @author auto create
 * @since 1.0, 2020-08-18 20:12:46
 */
public class PItemInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6629986688623136128L;

	/**
	 * 唯一code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 图片
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 标题
	 */
	@ApiField("name")
	private String name;

	/**
	 * 链接
	 */
	@ApiField("url")
	private String url;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
