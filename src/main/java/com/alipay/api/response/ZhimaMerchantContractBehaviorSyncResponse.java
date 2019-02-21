package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.contract.behavior.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 21:25:25
 */
public class ZhimaMerchantContractBehaviorSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5754542225938488348L;

	/** 
	 * 商户业务订单号
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
