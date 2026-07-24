package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.afx.muse.user.bind response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-01 15:32:44
 */
public class AlipayAfxMuseUserBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 6651651233245799171L;

	/** 
	 * muse 会话id
	 */
	@ApiField("muse_session_id")
	private String museSessionId;

	public void setMuseSessionId(String museSessionId) {
		this.museSessionId = museSessionId;
	}
	public String getMuseSessionId( ) {
		return this.museSessionId;
	}

}
