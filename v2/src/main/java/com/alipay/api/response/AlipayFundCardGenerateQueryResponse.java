package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.card.generate.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-28 17:52:04
 */
public class AlipayFundCardGenerateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1667331622173872424L;

	/** 
	 * 接收制卡请求落地之后的返回的支付宝制卡单号
	 */
	@ApiField("fund_card_generate_no")
	private String fundCardGenerateNo;

	/** 
	 * 卡生成的时间
	 */
	@ApiField("generate_finish_time")
	private String generateFinishTime;

	/** 
	 * 确认交付的时间
	 */
	@ApiField("proces_finish_time")
	private String procesFinishTime;

	/** 
	 * INIT-初始化
ACCEPTED - 已受理
PROCESSING - 处理中
WAIT_RETRY - 待重试
GENERATED - 制作完成
FINISHED - 已交付
CLOSE - 已取消
	 */
	@ApiField("status")
	private String status;

	public void setFundCardGenerateNo(String fundCardGenerateNo) {
		this.fundCardGenerateNo = fundCardGenerateNo;
	}
	public String getFundCardGenerateNo( ) {
		return this.fundCardGenerateNo;
	}

	public void setGenerateFinishTime(String generateFinishTime) {
		this.generateFinishTime = generateFinishTime;
	}
	public String getGenerateFinishTime( ) {
		return this.generateFinishTime;
	}

	public void setProcesFinishTime(String procesFinishTime) {
		this.procesFinishTime = procesFinishTime;
	}
	public String getProcesFinishTime( ) {
		return this.procesFinishTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
