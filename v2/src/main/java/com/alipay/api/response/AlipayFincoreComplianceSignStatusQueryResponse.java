package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.sign.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-02 16:32:22
 */
public class AlipayFincoreComplianceSignStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6525987534422873341L;

	/** 
	 * 业务单据号
	 */
	@ApiField("business_id")
	private String businessId;

	/** 
	 * 备注
	 */
	@ApiField("comment")
	private String comment;

	/** 
	 * 用印状态
	 */
	@ApiField("status")
	private String status;

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getBusinessId( ) {
		return this.businessId;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getComment( ) {
		return this.comment;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
