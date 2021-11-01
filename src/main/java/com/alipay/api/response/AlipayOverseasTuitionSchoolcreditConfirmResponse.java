package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tuition.schoolcredit.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-09 15:06:12
 */
public class AlipayOverseasTuitionSchoolcreditConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 4139477947784431444L;

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
