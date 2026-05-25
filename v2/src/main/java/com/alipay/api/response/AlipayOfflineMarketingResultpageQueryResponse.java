package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.resultpage.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-24 10:52:45
 */
public class AlipayOfflineMarketingResultpageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2294661658164399372L;

	/** 
	 * 设备biztid
	 */
	@ApiField("biztid")
	private String biztid;

	/** 
	 * 结果页内容
	 */
	@ApiField("result_page_content")
	private String resultPageContent;

	/** 
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 语音文本
	 */
	@ApiField("voice_text")
	private String voiceText;

	public void setBiztid(String biztid) {
		this.biztid = biztid;
	}
	public String getBiztid( ) {
		return this.biztid;
	}

	public void setResultPageContent(String resultPageContent) {
		this.resultPageContent = resultPageContent;
	}
	public String getResultPageContent( ) {
		return this.resultPageContent;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setVoiceText(String voiceText) {
		this.voiceText = voiceText;
	}
	public String getVoiceText( ) {
		return this.voiceText;
	}

}
