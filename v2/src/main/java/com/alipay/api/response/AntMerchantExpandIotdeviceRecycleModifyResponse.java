package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.iotdevice.recycle.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 08:34:29
 */
public class AntMerchantExpandIotdeviceRecycleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4234197146817328729L;

	/** 
	 * 业务处理订单号
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
