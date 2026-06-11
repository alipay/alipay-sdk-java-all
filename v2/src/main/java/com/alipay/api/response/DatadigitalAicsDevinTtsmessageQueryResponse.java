package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DtAsrTtsSlsMessage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.aics.devin.ttsmessage.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 10:52:46
 */
public class DatadigitalAicsDevinTtsmessageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7352326673223524956L;

	/** 
	 * null
	 */
	@ApiListField("tts_message_list")
	@ApiField("dt_asr_tts_sls_message")
	private List<DtAsrTtsSlsMessage> ttsMessageList;

	public void setTtsMessageList(List<DtAsrTtsSlsMessage> ttsMessageList) {
		this.ttsMessageList = ttsMessageList;
	}
	public List<DtAsrTtsSlsMessage> getTtsMessageList( ) {
		return this.ttsMessageList;
	}

}
