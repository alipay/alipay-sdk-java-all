package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.vostro.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-29 17:07:02
 */
public class AlipayEbppIndustrySupervisionVostroRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 4513343314113638314L;

	/** 
	 * 内部处理操作单号
	 */
	@ApiField("operate_no")
	private String operateNo;

	/** 
	 * 请求参数中的外部业务流水号
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
