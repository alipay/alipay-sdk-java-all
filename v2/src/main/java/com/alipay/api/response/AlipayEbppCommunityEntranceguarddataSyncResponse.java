package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.entranceguarddata.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:51
 */
public class AlipayEbppCommunityEntranceguarddataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6173322147227318813L;

	/** 
	 * 外部用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}
	public String getOutUserId( ) {
		return this.outUserId;
	}

}
