package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssistantMsgDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.assistant.msg.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-30 14:32:05
 */
public class AlipayMerchantGroupAssistantMsgQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4488133742928817781L;

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
