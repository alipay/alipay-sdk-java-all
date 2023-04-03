package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.promconfigure.set response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 04:01:31
 */
public class AlipayMerchantPayforprivilegePromconfigureSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8866545353173433461L;

	/** 
	 * 外部业务号
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
