package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.funds.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:51:46
 */
public class AlipayEbppIndustrySupervisionFundsTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 5313318754259671512L;

	/** 
	 * 操作单号，后续回调和查询划拨结果是需要带过来
	 */
	@ApiField("operate_no")
	private String operateNo;

	/** 
	 * 等于请求参数中的外部流水号
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
