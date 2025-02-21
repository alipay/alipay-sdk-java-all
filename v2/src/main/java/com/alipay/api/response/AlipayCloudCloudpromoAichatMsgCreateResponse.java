package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.aichat.msg.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-23 16:32:03
 */
public class AlipayCloudCloudpromoAichatMsgCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2457697186967617957L;

	/** 
	 * 外部业务号，原样返回
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 支付宝内部请求号，唯一
	 */
	@ApiField("request_id")
	private String requestId;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
