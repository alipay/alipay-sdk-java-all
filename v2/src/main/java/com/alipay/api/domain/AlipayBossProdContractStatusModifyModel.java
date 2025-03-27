package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同状态同步更改
 *
 * @author auto create
 * @since 1.0, 2023-11-16 13:50:09
 */
public class AlipayBossProdContractStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4325569268634594134L;

	/**
	 * 业务线
	 */
	@ApiField("business")
	private String business;

	/**
	 * 业务场景
	 */
	@ApiField("business_scene")
	private String businessScene;

	/**
	 * 合同号
	 */
	@ApiField("contract_code")
	private String contractCode;

	/**
	 * 合同状态
	 */
	@ApiField("contract_status")
	private String contractStatus;

	/**
	 * 操作人工号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 源系统id
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getBusiness() {
		return this.business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}

	public String getBusinessScene() {
		return this.businessScene;
	}
	public void setBusinessScene(String businessScene) {
		this.businessScene = businessScene;
	}

	public String getContractCode() {
		return this.contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getContractStatus() {
		return this.contractStatus;
	}
	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
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
