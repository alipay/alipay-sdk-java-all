package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.withhold.task.close response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-02 10:57:24
 */
public class AlipayCommerceWithholdTaskCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6425787784612896567L;

	/** 
	 * 外部业务单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 代扣任务ID
	 */
	@ApiField("withhold_no")
	private String withholdNo;

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setWithholdNo(String withholdNo) {
		this.withholdNo = withholdNo;
	}
	public String getWithholdNo( ) {
		return this.withholdNo;
	}

}
