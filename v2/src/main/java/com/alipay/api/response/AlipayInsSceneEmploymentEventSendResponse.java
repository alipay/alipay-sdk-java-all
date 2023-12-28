package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.employment.event.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-09 14:51:49
 */
public class AlipayInsSceneEmploymentEventSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6252386931855448599L;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
