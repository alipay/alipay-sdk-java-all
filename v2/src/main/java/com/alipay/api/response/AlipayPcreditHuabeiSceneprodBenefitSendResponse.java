package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.sceneprod.benefit.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:11:53
 */
public class AlipayPcreditHuabeiSceneprodBenefitSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5755857143754738343L;

	/** 
	 * 是否需要重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 发放单ID
	 */
	@ApiField("send_id")
	private String sendId;

	/** 
	 * 发放单状态，I:表示发放中、N:表示发放失败(属于重试也无法成功,比如预算不足等)、Y:表示发放成功
	 */
	@ApiField("status")
	private String status;

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setSendId(String sendId) {
		this.sendId = sendId;
	}
	public String getSendId( ) {
		return this.sendId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
