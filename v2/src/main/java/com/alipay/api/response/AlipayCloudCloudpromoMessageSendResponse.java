package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.message.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:17
 */
public class AlipayCloudCloudpromoMessageSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1275563762527395459L;

	/** 
	 * 短信发送回执id;可根据发送回执id在接口techrisk.innovate.message.details.query中查询具体的发送状态。
	 */
	@ApiField("biz_id")
	private String bizId;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

}
