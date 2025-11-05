package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同中心合同详情查看
 *
 * @author auto create
 * @since 1.0, 2022-12-14 17:49:32
 */
public class AlipayBossProdContractDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2421665688781894112L;

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
	 * 是否需要主合同的PDF版本
	 */
	@ApiField("is_pdf_required")
	private Boolean isPdfRequired;

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

	public Boolean getIsPdfRequired() {
		return this.isPdfRequired;
	}
	public void setIsPdfRequired(Boolean isPdfRequired) {
		this.isPdfRequired = isPdfRequired;
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
