package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * isv服务初始化接口
 *
 * @author auto create
 * @since 1.0, 2022-11-09 11:18:31
 */
public class AlipayIserviceCcmServiceInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 5289524233835871388L;

	/**
	 * 服务描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 服务图标url。支持 http(s) 链接。
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 服务编码。可在服务上架后，在服务市场上查询此信息。
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务名称。可在服务上架后，在服务市场上查询此信息。
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务订购二维码链接
	 */
	@ApiField("service_order_url")
	private String serviceOrderUrl;

	/**
	 * spi定义列表
	 */
	@ApiListField("spis")
	@ApiField("isv_spi_definition")
	private List<IsvSpiDefinition> spis;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceOrderUrl() {
		return this.serviceOrderUrl;
	}
	public void setServiceOrderUrl(String serviceOrderUrl) {
		this.serviceOrderUrl = serviceOrderUrl;
	}

	public List<IsvSpiDefinition> getSpis() {
		return this.spis;
	}
	public void setSpis(List<IsvSpiDefinition> spis) {
		this.spis = spis;
	}

}
