package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务信息
 *
 * @author auto create
 * @since 1.0, 2023-12-19 10:09:47
 */
public class ServiceDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 2247925598285641517L;

	/**
	 * 服务编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 服务描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 图标链接
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 服务名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务链接
	 */
	@ApiField("url")
	private String url;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
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
