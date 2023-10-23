package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务产品
 *
 * @author auto create
 * @since 1.0, 2023-03-22 10:33:35
 */
public class ServiceProductInfo extends AlipayObject {

	private static final long serialVersionUID = 8649654656676367577L;

	/**
	 * 服务描述
	 */
	@ApiField("service_desc")
	private String serviceDesc;

	/**
	 * 服务的费用子类型
	 */
	@ApiField("service_expense_sub_type")
	private String serviceExpenseSubType;

	/**
	 * 服务费用子类型名称
	 */
	@ApiField("service_expense_sub_type_name")
	private String serviceExpenseSubTypeName;

	/**
	 * 服务产品id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务是否需要订购
	 */
	@ApiField("service_order_model")
	private String serviceOrderModel;

	/**
	 * 服务亮点
	 */
	@ApiField("service_point")
	private String servicePoint;

	/**
	 * 服务预览url
	 */
	@ApiListField("service_preview_urls")
	@ApiField("service_product_preview_info")
	private List<ServiceProductPreviewInfo> servicePreviewUrls;

	/**
	 * 服务可提供能力
	 */
	@ApiListField("service_product_ability_info")
	@ApiField("service_product_ability_info")
	private List<ServiceProductAbilityInfo> serviceProductAbilityInfo;

	/**
	 * 服务发布方id
	 */
	@ApiField("service_publish_id")
	private String servicePublishId;

	/**
	 * 服务发布方名称
	 */
	@ApiField("service_publish_name")
	private String servicePublishName;

	/**
	 * 服务发布方类型
	 */
	@ApiField("service_publish_type")
	private String servicePublishType;

	/**
	 * 服务签约类型
	 */
	@ApiField("service_sign_type")
	private String serviceSignType;

	/**
	 * 服务状态
	 */
	@ApiField("service_status")
	private String serviceStatus;

	/**
	 * 服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	public String getServiceDesc() {
		return this.serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	public String getServiceExpenseSubType() {
		return this.serviceExpenseSubType;
	}
	public void setServiceExpenseSubType(String serviceExpenseSubType) {
		this.serviceExpenseSubType = serviceExpenseSubType;
	}

	public String getServiceExpenseSubTypeName() {
		return this.serviceExpenseSubTypeName;
	}
	public void setServiceExpenseSubTypeName(String serviceExpenseSubTypeName) {
		this.serviceExpenseSubTypeName = serviceExpenseSubTypeName;
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

	public String getServiceOrderModel() {
		return this.serviceOrderModel;
	}
	public void setServiceOrderModel(String serviceOrderModel) {
		this.serviceOrderModel = serviceOrderModel;
	}

	public String getServicePoint() {
		return this.servicePoint;
	}
	public void setServicePoint(String servicePoint) {
		this.servicePoint = servicePoint;
	}

	public List<ServiceProductPreviewInfo> getServicePreviewUrls() {
		return this.servicePreviewUrls;
	}
	public void setServicePreviewUrls(List<ServiceProductPreviewInfo> servicePreviewUrls) {
		this.servicePreviewUrls = servicePreviewUrls;
	}

	public List<ServiceProductAbilityInfo> getServiceProductAbilityInfo() {
		return this.serviceProductAbilityInfo;
	}
	public void setServiceProductAbilityInfo(List<ServiceProductAbilityInfo> serviceProductAbilityInfo) {
		this.serviceProductAbilityInfo = serviceProductAbilityInfo;
	}

	public String getServicePublishId() {
		return this.servicePublishId;
	}
	public void setServicePublishId(String servicePublishId) {
		this.servicePublishId = servicePublishId;
	}

	public String getServicePublishName() {
		return this.servicePublishName;
	}
	public void setServicePublishName(String servicePublishName) {
		this.servicePublishName = servicePublishName;
	}

	public String getServicePublishType() {
		return this.servicePublishType;
	}
	public void setServicePublishType(String servicePublishType) {
		this.servicePublishType = servicePublishType;
	}

	public String getServiceSignType() {
		return this.serviceSignType;
	}
	public void setServiceSignType(String serviceSignType) {
		this.serviceSignType = serviceSignType;
	}

	public String getServiceStatus() {
		return this.serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
