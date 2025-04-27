package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建环境并下单
 *
 * @author auto create
 * @since 1.0, 2023-10-16 20:23:17
 */
public class AlipayCloudCloudbaseEnvCreateandpayModel extends AlipayObject {

	private static final long serialVersionUID = 5761131679531713299L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 环境名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 区域
	 */
	@ApiField("region")
	private String region;

	/**
	 * 环境资源包规格编码
	 */
	@ApiField("resource_spec_code")
	private String resourceSpecCode;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getResourceSpecCode() {
		return this.resourceSpecCode;
	}
	public void setResourceSpecCode(String resourceSpecCode) {
		this.resourceSpecCode = resourceSpecCode;
	}

}
