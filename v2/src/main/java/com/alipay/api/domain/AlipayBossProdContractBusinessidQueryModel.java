package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据业务Id查询合同信息
 *
 * @author auto create
 * @since 1.0, 2025-10-29 09:46:34
 */
public class AlipayBossProdContractBusinessidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2119533793185928288L;

	/**
	 * 请求单据号
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 来源系统ID
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 合同所在租户信息
	 */
	@ApiField("tenant")
	private String tenant;

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
