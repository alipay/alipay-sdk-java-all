package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务订购单模型
 *
 * @author auto create
 * @since 1.0, 2023-03-15 17:30:06
 */
public class ServiceOrderBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 4292888641928788559L;

	/**
	 * 订购主体ID（根据 buyer_role_type 区分订购主体ID类型）
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 订购主体名称
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 订购主体角色类型
	 */
	@ApiField("buyer_role_type")
	private String buyerRoleType;

	/**
	 * 费用类型
	 */
	@ApiField("expense_type")
	private String expenseType;

	/**
	 * 费用子类型
	 */
	@ApiField("expense_type_sub_category")
	private String expenseTypeSubCategory;

	/**
	 * 订购单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 服务订购状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单时间
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
	 * 服务订购类型
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
	 * 服务状态
	 */
	@ApiField("service_status")
	private String serviceStatus;

	/**
	 * 服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerName() {
		return this.buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerRoleType() {
		return this.buyerRoleType;
	}
	public void setBuyerRoleType(String buyerRoleType) {
		this.buyerRoleType = buyerRoleType;
	}

	public String getExpenseType() {
		return this.expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public String getExpenseTypeSubCategory() {
		return this.expenseTypeSubCategory;
	}
	public void setExpenseTypeSubCategory(String expenseTypeSubCategory) {
		this.expenseTypeSubCategory = expenseTypeSubCategory;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
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
