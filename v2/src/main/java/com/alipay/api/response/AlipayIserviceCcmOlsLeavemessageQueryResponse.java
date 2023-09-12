package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.ols.leavemessage.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-28 18:21:52
 */
public class AlipayIserviceCcmOlsLeavemessageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4879979196733935711L;

	/** 
	 * 是否存在未读的消息
	 */
	@ApiField("exist_unread_message")
	private Boolean existUnreadMessage;

	/** 
	 * 未读消息条数
	 */
	@ApiField("unread_message_number")
	private Long unreadMessageNumber;

	public void setExistUnreadMessage(Boolean existUnreadMessage) {
		this.existUnreadMessage = existUnreadMessage;
	}
	public Boolean getExistUnreadMessage( ) {
		return this.existUnreadMessage;
	}

	public void setUnreadMessageNumber(Long unreadMessageNumber) {
		this.unreadMessageNumber = unreadMessageNumber;
	}
	public Long getUnreadMessageNumber( ) {
		return this.unreadMessageNumber;
	}

}
