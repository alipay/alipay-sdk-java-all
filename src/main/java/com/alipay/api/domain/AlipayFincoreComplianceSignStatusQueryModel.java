package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用印状态查询接口
 *
 * @author auto create
 * @since 1.0, 2021-12-29 14:38:14
 */
public class AlipayFincoreComplianceSignStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4249974277137235765L;

	/**
	 * 业务单据号
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 系统来源
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

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

}
