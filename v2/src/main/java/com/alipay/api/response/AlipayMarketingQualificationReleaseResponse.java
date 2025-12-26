package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qualification.release response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-15 21:30:26
 */
public class AlipayMarketingQualificationReleaseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6617679499491343559L;

	/** 
	 * 资格ID
	 */
	@ApiField("qual_id")
	private String qualId;

	/** 
	 * 资格实例ID
	 */
	@ApiField("qual_instance_id")
	private String qualInstanceId;

	public void setQualId(String qualId) {
		this.qualId = qualId;
	}
	public String getQualId( ) {
		return this.qualId;
	}

	public void setQualInstanceId(String qualInstanceId) {
		this.qualInstanceId = qualInstanceId;
	}
	public String getQualInstanceId( ) {
		return this.qualInstanceId;
	}

}
