package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.topostpaid.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-19 10:37:06
 */
public class AlipayCloudCloudbaseResourcepackageTopostpaidRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 5311387923231277848L;

	/** 
	 * 套餐包未使用资源退款是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
