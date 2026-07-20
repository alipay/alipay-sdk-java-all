package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供给跳链查询
 *
 * @author auto create
 * @since 1.0, 2026-06-09 20:59:00
 */
public class AlipayCommerceEcSupplierUrlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1648881382587329559L;

	/**
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 费控规则id
	 */
	@ApiField("expense_rule_id")
	private String expenseRuleId;

	/**
	 * 如果传false（默认值），如果员工未签约因公付，接口会抛异常；

如果传true，如果员工未签约因公付，则返回签约链接（员工签约成功后会跳转供给链接）
	 */
	@ApiField("need_sign_url")
	private Boolean needSignUrl;

	/**
	 * 需要跳转订单详情页的企业码订单ID，可以从订单详情接口获得
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 供给id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 跳转URL类型
	 */
	@ApiField("url_type")
	private String urlType;

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getExpenseRuleId() {
		return this.expenseRuleId;
	}
	public void setExpenseRuleId(String expenseRuleId) {
		this.expenseRuleId = expenseRuleId;
	}

	public Boolean getNeedSignUrl() {
		return this.needSignUrl;
	}
	public void setNeedSignUrl(Boolean needSignUrl) {
		this.needSignUrl = needSignUrl;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getUrlType() {
		return this.urlType;
	}
	public void setUrlType(String urlType) {
		this.urlType = urlType;
	}

}
