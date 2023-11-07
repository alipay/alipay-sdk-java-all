package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.bankcard.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:12:03
 */
public class AlipayIserviceCognitiveOcrBankcardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5886693658178672222L;

	/** 
	 * 银行卡号
	 */
	@ApiField("card_num")
	private String cardNum;

	/** 
	 * 服务器内部请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * true: 识别成功
false: 识别失败
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 开放平台trace_id
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getCardNum( ) {
		return this.cardNum;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
