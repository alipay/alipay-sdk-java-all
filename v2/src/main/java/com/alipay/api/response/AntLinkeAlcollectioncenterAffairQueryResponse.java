package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.linke.alcollectioncenter.affair.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-15 17:47:00
 */
public class AntLinkeAlcollectioncenterAffairQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1133116481218873387L;

	/** 
	 * 案件id
	 */
	@ApiField("affair_id")
	private String affairId;

	/** 
	 * 根据案件id获取案件状态
	 */
	@ApiField("affair_status")
	private String affairStatus;

	/** 
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	public void setAffairId(String affairId) {
		this.affairId = affairId;
	}
	public String getAffairId( ) {
		return this.affairId;
	}

	public void setAffairStatus(String affairStatus) {
		this.affairStatus = affairStatus;
	}
	public String getAffairStatus( ) {
		return this.affairStatus;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
