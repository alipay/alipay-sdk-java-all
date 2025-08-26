package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AsrTtsSlsMessage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.crm.ttsmessage.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 11:02:28
 */
public class AlipayIserviceCcmCrmTtsmessageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8199219689414795365L;

	/** 
	 * 音转文列表
	 */
	@ApiListField("tts_message_list")
	@ApiField("asr_tts_sls_message")
	private List<AsrTtsSlsMessage> ttsMessageList;

	public void setTtsMessageList(List<AsrTtsSlsMessage> ttsMessageList) {
		this.ttsMessageList = ttsMessageList;
	}
	public List<AsrTtsSlsMessage> getTtsMessageList( ) {
		return this.ttsMessageList;
	}

}
