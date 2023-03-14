package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.order.orderinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 01:21:39
 */
public class AlipayBusinessOrderOrderinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8761757223284572771L;

	/** 
	 * 订单id
	 */
	@ApiField("object_id")
	private String objectId;

	/** 
	 * 订单状态
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
