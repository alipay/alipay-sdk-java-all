package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.isv.device.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:42:04
 */
public class AntMerchantExpandIsvDeviceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8384116815497366984L;

	/** 
	 * 机具申请物料订单号
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
