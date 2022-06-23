package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.order.checkin.orderinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:10:12
 */
public class AlipayBusinessOrderCheckinOrderinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8279555533237221657L;

	/** 
	 * 行业侧入住单唯一标识
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
