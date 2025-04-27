package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ChatData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.aichat.streammsg.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-19 20:02:07
 */
public class AlipayCloudCloudpromoAichatStreammsgCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2788645747292826795L;

	/** 
	 * 答案内容
	 */
	@ApiField("data")
	private ChatData data;

	/** 
	 * 答案类型
	 */
	@ApiField("event")
	private String event;

	public void setData(ChatData data) {
		this.data = data;
	}
	public ChatData getData( ) {
		return this.data;
	}

	public void setEvent(String event) {
		this.event = event;
	}
	public String getEvent( ) {
		return this.event;
	}

}
