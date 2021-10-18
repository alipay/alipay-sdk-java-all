package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.guarantee.tradedrive.pay response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-26 17:31:22
 */
public class MybankCreditGuaranteeTradedrivePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 1817874881589966229L;

	/** 
	 * 调用成功则返回调用业务编码
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
