package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.iotdevice.change.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 04:43:37
 */
public class AntMerchantExpandIotdeviceChangeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4637162368412948571L;

	/** 
	 * 业务单号
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}
	public String getBizOrderId( ) {
		return this.bizOrderId;
	}

}
