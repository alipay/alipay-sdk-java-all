package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.vostro.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-28 10:02:05
 */
public class AlipayEbppIndustrySupervisionVostroRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 1379146751664236662L;

	/** 
	 * 本次退款请求操作，内部受理的操作流水单号
后续退款进度查询通过该字段查询
	 */
	@ApiField("operate_no")
	private String operateNo;

	/** 
	 * 对应本次请求请求参数中的「原路退请求流水号 out_trade_no 」
后续退款进度查询通过该字段查询
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	public void setOperateNo(String operateNo) {
		this.operateNo = operateNo;
	}
	public String getOperateNo( ) {
		return this.operateNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

}
