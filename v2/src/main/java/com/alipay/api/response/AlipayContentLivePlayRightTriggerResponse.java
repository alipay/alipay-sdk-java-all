package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.play.right.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 14:17:28
 */
public class AlipayContentLivePlayRightTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 3835686758191283799L;

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
