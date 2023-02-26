package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同中心签约结果查询
 *
 * @author auto create
 * @since 1.0, 2021-11-12 14:31:39
 */
public class AlipayBossProdContractSignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8244759161786468547L;

	/**
	 * 业务流水号
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 合同编号(合同中心合同流水号)
	 */
	@ApiField("contract_code")
	private String contractCode;

	/**
	 * 当前系统的名称
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getContractCode() {
		return this.contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
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
