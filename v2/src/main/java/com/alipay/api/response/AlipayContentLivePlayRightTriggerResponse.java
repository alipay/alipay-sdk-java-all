package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.play.right.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-13 15:43:28
 */
public class AlipayContentLivePlayRightTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 3395929116436656847L;

	/** 
	 * 外部业务id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}
	public String getOutBizId( ) {
		return this.outBizId;
	}

}
