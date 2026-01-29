package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务配置参数
 *
 * @author auto create
 * @since 1.0, 2024-07-15 16:20:57
 */
public class ServiceConfig extends AlipayObject {

	private static final long serialVersionUID = 8558195892277567464L;

	/**
	 * 服务内容数据
	 */
	@ApiField("service_content")
	private String serviceContent;

	/**
	 * 服务的唯一标识
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	public String getServiceContent() {
		return this.serviceContent;
	}
	public void setServiceContent(String serviceContent) {
		this.serviceContent = serviceContent;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
