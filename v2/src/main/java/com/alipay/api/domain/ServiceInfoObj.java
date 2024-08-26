package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务信息
 *
 * @author auto create
 * @since 1.0, 2023-03-10 18:05:18
 */
public class ServiceInfoObj extends AlipayObject {

	private static final long serialVersionUID = 5796452195144492544L;

	/**
	 * 服务类目
	 */
	@ApiField("service_category")
	private String serviceCategory;

	/**
	 * 服务内容描述，服务类型是ORDER_BUY和ORDER_HELP时，表示帮买的东西和帮忙的内容
	 */
	@ApiField("service_content")
	private String serviceContent;

	/**
	 * 服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	public String getServiceCategory() {
		return this.serviceCategory;
	}
	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public String getServiceContent() {
		return this.serviceContent;
	}
	public void setServiceContent(String serviceContent) {
		this.serviceContent = serviceContent;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
