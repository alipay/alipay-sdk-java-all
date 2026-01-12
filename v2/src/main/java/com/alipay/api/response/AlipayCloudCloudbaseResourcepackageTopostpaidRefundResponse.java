package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.topostpaid.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-22 15:22:20
 */
public class AlipayCloudCloudbaseResourcepackageTopostpaidRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 6536215142168634818L;

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
