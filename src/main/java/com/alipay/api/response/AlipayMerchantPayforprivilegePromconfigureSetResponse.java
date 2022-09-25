package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.promconfigure.set response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 20:56:33
 */
public class AlipayMerchantPayforprivilegePromconfigureSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3764178264811648912L;

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
