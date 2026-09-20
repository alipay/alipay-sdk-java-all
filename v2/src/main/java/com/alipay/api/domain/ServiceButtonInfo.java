package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生服务按钮信息
 *
 * @author auto create
 * @since 1.0, 2026-08-27 20:02:48
 */
public class ServiceButtonInfo extends AlipayObject {

	private static final long serialVersionUID = 8398993384984299353L;

	/**
	 * 服务图标
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 服务名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务开关
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 服务类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 服务链接
	 */
	@ApiField("url")
	private String url;

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
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
