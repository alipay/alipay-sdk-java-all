package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tuition.schoolcredit.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 22:05:45
 */
public class AlipayOverseasTuitionSchoolcreditConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 4672765758844138898L;

	/** 
	 * 业务透传保留字段，json map格式
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}
	public String getPassThroughInfo( ) {
		return this.passThroughInfo;
	}

}
