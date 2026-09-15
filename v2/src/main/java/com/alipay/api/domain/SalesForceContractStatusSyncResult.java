package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果对象
 *
 * @author auto create
 * @since 1.0, 2026-09-09 14:17:53
 */
public class SalesForceContractStatusSyncResult extends AlipayObject {

	private static final long serialVersionUID = 5652193894266832267L;

	/**
	 * 本次接收的合同状态
	 */
	@ApiField("contract_status")
	private String contractStatus;

	/**
	 * 创建甄零合同时传入的甄零合同ID
	 */
	@ApiField("external_contract_id")
	private String externalContractId;

	/**
	 * 请求幂等id
	 */
	@ApiField("request_id")
	private String requestId;

	public String getContractStatus() {
		return this.contractStatus;
	}
	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getExternalContractId() {
		return this.externalContractId;
	}
	public void setExternalContractId(String externalContractId) {
		this.externalContractId = externalContractId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
