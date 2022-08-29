package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.iotdevice.maintenance.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 11:25:12
 */
public class AntMerchantExpandIotdeviceMaintenanceModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8466612138973233687L;

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
