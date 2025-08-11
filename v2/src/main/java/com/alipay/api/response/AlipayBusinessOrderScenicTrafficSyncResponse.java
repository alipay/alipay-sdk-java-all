package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.order.scenic.traffic.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:01
 */
public class AlipayBusinessOrderScenicTrafficSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4833576258944385876L;

	/** 
	 * 行业侧入住单唯一标识。
	 */
	@ApiField("object_id")
	private String objectId;

	/** 
	 * 订单最新状态
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
