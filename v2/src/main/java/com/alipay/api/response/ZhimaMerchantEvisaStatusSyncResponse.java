package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.evisa.status.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:06:24
 */
public class ZhimaMerchantEvisaStatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5773199787727174522L;

	/** 
	 * 商户生成唯一的外部接口调用事务号
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
