package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.promconfigure.set response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 09:12:26
 */
public class AlipayMerchantPayforprivilegePromconfigureSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6556677431772397173L;

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
