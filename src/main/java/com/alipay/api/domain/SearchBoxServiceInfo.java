package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索直达服务信息
 *
 * @author auto create
 * @since 1.0, 2022-04-19 11:12:20
 */
public class SearchBoxServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 5318361751724949275L;

	/**
	 * 服务类目编码
	 */
	@ApiField("service_category_code")
	private String serviceCategoryCode;

	/**
	 * 服务类目名称
	 */
	@ApiField("service_category_name")
	private String serviceCategoryName;

	/**
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	public String getServiceCategoryCode() {
		return this.serviceCategoryCode;
	}
	public void setServiceCategoryCode(String serviceCategoryCode) {
		this.serviceCategoryCode = serviceCategoryCode;
	}

	public String getServiceCategoryName() {
		return this.serviceCategoryName;
	}
	public void setServiceCategoryName(String serviceCategoryName) {
		this.serviceCategoryName = serviceCategoryName;
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

}
