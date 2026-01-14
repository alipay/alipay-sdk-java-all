package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.traderesult.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 19:17:32
 */
public class AlipayCommerceLogisticsFreightflowTraderesultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5695719594811532777L;

	/** 
	 * 银行操作单号(查询时需要使用)
	 */
	@ApiField("bank_operate_no")
	private String bankOperateNo;

	/** 
	 * 业务幂等号(同入参中的业务幂等号一致)
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 交易完结时间 标准格式：yyyyMMddHHmmss
	 */
	@ApiField("finish_time")
	private String finishTime;

	/** 
	 * 本期： ANT_MYBANK(网商银行模式)
	 */
	@ApiField("mode")
	private String mode;

	/** 
	 * 合作方机构号
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 交易请求时间，标准格式：yyyyMMddHHmmss
	 */
	@ApiField("request_time")
	private String requestTime;

	/** 
	 * 状态(成功, 失败, 处理中)
	 */
	@ApiField("status")
	private String status;

	public void setBankOperateNo(String bankOperateNo) {
		this.bankOperateNo = bankOperateNo;
	}
	public String getBankOperateNo( ) {
		return this.bankOperateNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}
	public String getFinishTime( ) {
		return this.finishTime;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getMode( ) {
		return this.mode;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}
	public String getRequestTime( ) {
		return this.requestTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
