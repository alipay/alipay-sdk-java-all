package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.item.ticket.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-03 15:59:09
 */
public class AlipayBusinessItemTicketSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4722735925233129118L;

	/** 
	 * 支付宝门票商品id
	 */
	@ApiField("object_id")
	private String objectId;

	/** 
	 * 支付宝门票商品状态
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
