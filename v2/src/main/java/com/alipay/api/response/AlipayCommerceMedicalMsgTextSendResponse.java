package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.msg.text.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-03 21:07:29
 */
public class AlipayCommerceMedicalMsgTextSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3468625196243616693L;

	/** 
	 * 业务id
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
