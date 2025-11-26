package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.play.right.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-17 11:46:52
 */
public class AlipayContentLivePlayRightTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 3626286167368691423L;

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
