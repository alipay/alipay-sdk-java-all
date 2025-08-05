package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务信息
 *
 * @author auto create
 * @since 1.0, 2024-06-17 16:27:16
 */
public class ServiceDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 4832375251845612372L;

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
	 * 用于feedback时，告知数据类型
	 */
	@ApiField("type")
	private String type;

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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
