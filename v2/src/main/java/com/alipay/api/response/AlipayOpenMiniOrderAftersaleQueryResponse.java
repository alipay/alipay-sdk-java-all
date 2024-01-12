package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.aftersale.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-04 10:31:59
 */
public class AlipayOpenMiniOrderAftersaleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4223963614684824165L;

	/** 
	 * 售后单触发类型
	 */
	@ApiField("action_type")
	private String actionType;

	/** 
	 * 用户售后发起原因
	 */
	@ApiField("aftersale_reason")
	private String aftersaleReason;

	/** 
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部售后单号
	 */
	@ApiField("out_aftersale_id")
	private String outAftersaleId;

	/** 
	 * 售后单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 售后类型
	 */
	@ApiField("type")
	private String type;

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public String getActionType( ) {
		return this.actionType;
	}

	public void setAftersaleReason(String aftersaleReason) {
		this.aftersaleReason = aftersaleReason;
	}
	public String getAftersaleReason( ) {
		return this.aftersaleReason;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutAftersaleId(String outAftersaleId) {
		this.outAftersaleId = outAftersaleId;
	}
	public String getOutAftersaleId( ) {
		return this.outAftersaleId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
