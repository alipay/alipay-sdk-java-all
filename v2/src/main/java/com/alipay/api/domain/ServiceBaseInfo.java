package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订购的服务基础信息
 *
 * @author auto create
 * @since 1.0, 2023-03-15 17:29:54
 */
public class ServiceBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 6517437315834621926L;

	/**
	 * 费用类型
	 */
	@ApiField("expense_type")
	private String expenseType;

	/**
	 * 费用类型描述
	 */
	@ApiField("expense_type_desc")
	private String expenseTypeDesc;

	/**
	 * 费用类型子类
	 */
	@ApiField("expense_type_sub_category")
	private String expenseTypeSubCategory;

	/**
	 * 费用类型子类描述
	 */
	@ApiField("expense_type_sub_category_desc")
	private String expenseTypeSubCategoryDesc;

	/**
	 * 服务订购时间
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 服务选择关联的服务ID
	 */
	@ApiField("related_service_id")
	private String relatedServiceId;

	/**
	 * 服务简介
	 */
	@ApiField("service_desc")
	private String serviceDesc;

	/**
	 * 服务ID
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务订购模式
	 */
	@ApiField("service_order_mode")
	private String serviceOrderMode;

	/**
	 * 服务提供方ID
	 */
	@ApiField("service_provider_id")
	private String serviceProviderId;

	/**
	 * 服务提供方名称
	 */
	@ApiField("service_provider_name")
	private String serviceProviderName;

	/**
	 * 服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	public String getExpenseType() {
		return this.expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public String getExpenseTypeDesc() {
		return this.expenseTypeDesc;
	}
	public void setExpenseTypeDesc(String expenseTypeDesc) {
		this.expenseTypeDesc = expenseTypeDesc;
	}

	public String getExpenseTypeSubCategory() {
		return this.expenseTypeSubCategory;
	}
	public void setExpenseTypeSubCategory(String expenseTypeSubCategory) {
		this.expenseTypeSubCategory = expenseTypeSubCategory;
	}

	public String getExpenseTypeSubCategoryDesc() {
		return this.expenseTypeSubCategoryDesc;
	}
	public void setExpenseTypeSubCategoryDesc(String expenseTypeSubCategoryDesc) {
		this.expenseTypeSubCategoryDesc = expenseTypeSubCategoryDesc;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getRelatedServiceId() {
		return this.relatedServiceId;
	}
	public void setRelatedServiceId(String relatedServiceId) {
		this.relatedServiceId = relatedServiceId;
	}

	public String getServiceDesc() {
		return this.serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
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

	public String getServiceOrderMode() {
		return this.serviceOrderMode;
	}
	public void setServiceOrderMode(String serviceOrderMode) {
		this.serviceOrderMode = serviceOrderMode;
	}

	public String getServiceProviderId() {
		return this.serviceProviderId;
	}
	public void setServiceProviderId(String serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}

	public String getServiceProviderName() {
		return this.serviceProviderName;
	}
	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
