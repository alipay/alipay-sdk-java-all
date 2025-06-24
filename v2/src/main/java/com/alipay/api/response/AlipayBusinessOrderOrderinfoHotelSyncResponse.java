package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.order.orderinfo.hotel.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 10:14:04
 */
public class AlipayBusinessOrderOrderinfoHotelSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7769731997267593927L;

	/** 
	 * 支付宝酒店订单id
	 */
	@ApiField("object_id")
	private String objectId;

	/** 
	 * 支付宝酒店订单状态
	 */
	@ApiField("status")
	private String status;

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getObjectId( ) {
		return this.objectId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
