package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小助手服务模型
 *
 * @author auto create
 * @since 1.0, 2024-08-13 16:30:45
 */
public class AssistantServiceVO extends AlipayObject {

	private static final long serialVersionUID = 5823446437741162658L;

	/**
	 * 服务logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 服务logo类型
	 */
	@ApiField("logo_type")
	private String logoType;

	/**
	 * 服务跳转地址
	 */
	@ApiField("service_url")
	private String serviceUrl;

	/**
	 * 服务名称。将在小助手弹层对客展示。
	 */
	@ApiField("title")
	private String title;

	/**
	 * 服务类型。COMMON，自定义类型，需要传入logoType服务logo类型。TEL，电话类型。
	 */
	@ApiField("type")
	private String type;

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLogoType() {
		return this.logoType;
	}
	public void setLogoType(String logoType) {
		this.logoType = logoType;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
