package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户自定义数据对象
 *
 * @author auto create
 * @since 1.0, 2021-06-04 10:53:25
 */
public class CustomizeDataObject extends AlipayObject {

	private static final long serialVersionUID = 5213299226751799695L;

	/**
	 * 商业中台产品实例ID
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 商业中台产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商业中台租户企业名称
	 */
	@ApiField("tenant_company_name")
	private String tenantCompanyName;

	/**
	 * 商业中台租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTenantCompanyName() {
		return this.tenantCompanyName;
	}
	public void setTenantCompanyName(String tenantCompanyName) {
		this.tenantCompanyName = tenantCompanyName;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
