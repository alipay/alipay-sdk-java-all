package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * C2C租房智能体合同信息查询
 *
 * @author auto create
 * @since 1.0, 2024-10-23 19:47:50
 */
public class AlipayCloudCloudpromoContractFormQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1521879511699916865L;

	/**
	 * 合同号
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * 主体id
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 三方小程序id
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
