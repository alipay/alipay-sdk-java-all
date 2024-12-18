package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.message.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-31 10:52:03
 */
public class AlipayEcoCityserviceMessageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6814127151876849243L;

	/** 
	 * SUCCESS:标识发送成功。
FAIL:标识发送失败。
	 */
	@ApiField("send_status")
	private String sendStatus;

	/** 
	 * 机构消息编号，APPID下唯一。
	 */
	@ApiField("uuid")
	private String uuid;

	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}
	public String getSendStatus( ) {
		return this.sendStatus;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getUuid( ) {
		return this.uuid;
	}

}
