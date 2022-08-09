package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务基础信息
 *
 * @author auto create
 * @since 1.0, 2018-04-09 18:17:19
 */
public class CommodityBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 5379123669563447194L;

	/**
	 * 服务logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 服务备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 服务名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务地址
	 */
	@ApiField("service_url")
	private String serviceUrl;

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

}
