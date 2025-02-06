package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用印状态查询接口
 *
 * @author auto create
 * @since 1.0, 2024-08-02 16:32:22
 */
public class AlipayFincoreComplianceSignStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6314974768715125681L;

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
