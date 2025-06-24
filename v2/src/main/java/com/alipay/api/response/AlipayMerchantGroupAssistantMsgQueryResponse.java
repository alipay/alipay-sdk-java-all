package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssistantMsgDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.assistant.msg.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-10 11:42:30
 */
public class AlipayMerchantGroupAssistantMsgQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5566178781148468398L;

	/** 
	 * 商家群定向消息详情
	 */
	@ApiField("msg_detail")
	private AssistantMsgDetailVO msgDetail;

	public void setMsgDetail(AssistantMsgDetailVO msgDetail) {
		this.msgDetail = msgDetail;
	}
	public AssistantMsgDetailVO getMsgDetail( ) {
		return this.msgDetail;
	}

}
