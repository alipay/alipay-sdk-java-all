package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssistantMsgDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.assistant.msg.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-13 16:12:24
 */
public class AlipayMerchantGroupAssistantMsgQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8616816783117361641L;

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
