package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.employment.event.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-26 21:47:03
 */
public class AlipayInsSceneEmploymentEventSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3129592939945325862L;

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
