package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.allocate.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-03 09:37:44
 */
public class AlipayCommerceLogisticsFreightflowAllocateApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7727652125613728696L;

	/** 
	 * 和入参中的biz_no一致，查询调拨结果时需要使用
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * mode为网商时为网商返回的操作单号，查询调拨结果时需要使用
	 */
	@ApiField("operate_no")
	private String operateNo;

	/** 
	 * 当mode为网商银行时： SUCCESS(受理成功)，FAIL(受理失败)，UNKNOWN(受理未知) SUCCESS代表受理成功，后续通过查询接口拿到最终的处理结果 FAIL代表受理失败 UNKNOWN代表结果未知，不能判断为受理成功或者失败 

浦发银行暂不支持调拨功能
	 */
	@ApiField("status")
	private String status;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setOperateNo(String operateNo) {
		this.operateNo = operateNo;
	}
	public String getOperateNo( ) {
		return this.operateNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
