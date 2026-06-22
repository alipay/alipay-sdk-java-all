package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.open.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-28 15:47:51
 */
public class AlipayCloudCloudbaseResourcepackageOpenCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 1336743967325564358L;

	/** 
	 * 外部环境id
	 */
	@ApiField("env_id")
	private String envId;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setEnvId(String envId) {
		this.envId = envId;
	}
	public String getEnvId( ) {
		return this.envId;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
