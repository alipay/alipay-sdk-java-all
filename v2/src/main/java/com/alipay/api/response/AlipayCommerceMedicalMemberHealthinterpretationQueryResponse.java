package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.member.healthinterpretation.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-04 16:17:49
 */
public class AlipayCommerceMedicalMemberHealthinterpretationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1591895673154173793L;

	/** 
	 * 解读数据完成的手机壳
	 */
	@ApiField("interpretation_data")
	private String interpretationData;

	/** 
	 * 解读状态
	 */
	@ApiField("status")
	private String status;

	public void setInterpretationData(String interpretationData) {
		this.interpretationData = interpretationData;
	}
	public String getInterpretationData( ) {
		return this.interpretationData;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
