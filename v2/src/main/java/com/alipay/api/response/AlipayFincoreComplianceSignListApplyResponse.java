package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.sign.list.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-31 11:39:17
 */
public class AlipayFincoreComplianceSignListApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3446754127238545787L;

	/** 
	 * 业务请求单号
	 */
	@ApiField("business_id")
	private String businessId;

	/** 
	 * 用印记录id
	 */
	@ApiField("file_code")
	private String fileCode;

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getBusinessId( ) {
		return this.businessId;
	}

	public void setFileCode(String fileCode) {
		this.fileCode = fileCode;
	}
	public String getFileCode( ) {
		return this.fileCode;
	}

}
