package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupMsgSendDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupmsg.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-13 10:34:44
 */
public class AlipayMerchantGroupGroupmsgQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3838227555184473157L;

	/** 
	 * 群消息发送详情
	 */
	@ApiField("msg_send_detail")
	private GroupMsgSendDetailVO msgSendDetail;

	public void setMsgSendDetail(GroupMsgSendDetailVO msgSendDetail) {
		this.msgSendDetail = msgSendDetail;
	}
	public GroupMsgSendDetailVO getMsgSendDetail( ) {
		return this.msgSendDetail;
	}

}
