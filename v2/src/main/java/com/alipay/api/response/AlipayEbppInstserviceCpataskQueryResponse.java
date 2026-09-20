package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.cpatask.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-08 11:47:51
 */
public class AlipayEbppInstserviceCpataskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8743376636186989421L;

	/** 
	 * 该值是CPA任务投放全链路进行唯一归因的标记，广告主侧后续广告数据回传也需要携带该字段进行任务定位。
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 任务投放的广告链接
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	public String getCallbackUrl( ) {
		return this.callbackUrl;
	}

}
