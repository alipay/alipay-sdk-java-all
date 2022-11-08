package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.ecmcore.dataarchives.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-29 18:36:46
 */
public class AlipayDigitalmgmtEcmcoreDataarchivesCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5594829618721346355L;

	/** 
	 * 数据id
	 */
	@ApiField("data_id")
	private String dataId;

	/** 
	 * 反馈消息内容
	 */
	@ApiField("message_content")
	private String messageContent;

	/** 
	 * 状态码
	 */
	@ApiField("status")
	private String status;

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	public String getDataId( ) {
		return this.dataId;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public String getMessageContent( ) {
		return this.messageContent;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
