package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campus.school.add response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-08 11:05:35
 */
public class AlipayCommerceEducateCampusSchoolAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5843899693873844518L;

	/** 
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/** 
	 * 审核原因
	 */
	@ApiField("reason")
	private String reason;

	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstId( ) {
		return this.instId;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

}
