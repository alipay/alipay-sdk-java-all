package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.alipaypoint.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-27 09:53:43
 */
public class AlipayUserAlipaypointSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2594996233545621118L;

	/** 
	 * 发放记录号。
	 */
	@ApiField("record_id")
	private String recordId;

	/** 
	 * 对账中心关联订单，一般场景无需关注
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionId( ) {
		return this.transactionId;
	}

}
