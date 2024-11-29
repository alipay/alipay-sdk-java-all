package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.bcm.digitalrmb.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:38
 */
public class DatadigitalFincloudFinsaasBcmDigitalrmbSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6299375374742493818L;

	/** 
	 * 下个页面阶段
	 */
	@ApiField("page_stage")
	private String pageStage;

	/** 
	 * 奖品code
	 */
	@ApiField("prize_code")
	private String prizeCode;

	/** 
	 * 奖品价格，单位：分
	 */
	@ApiField("prize_price")
	private Long prizePrice;

	/** 
	 * 发放数币结果
	 */
	@ApiField("send_result")
	private String sendResult;

	public void setPageStage(String pageStage) {
		this.pageStage = pageStage;
	}
	public String getPageStage( ) {
		return this.pageStage;
	}

	public void setPrizeCode(String prizeCode) {
		this.prizeCode = prizeCode;
	}
	public String getPrizeCode( ) {
		return this.prizeCode;
	}

	public void setPrizePrice(Long prizePrice) {
		this.prizePrice = prizePrice;
	}
	public Long getPrizePrice( ) {
		return this.prizePrice;
	}

	public void setSendResult(String sendResult) {
		this.sendResult = sendResult;
	}
	public String getSendResult( ) {
		return this.sendResult;
	}

}
