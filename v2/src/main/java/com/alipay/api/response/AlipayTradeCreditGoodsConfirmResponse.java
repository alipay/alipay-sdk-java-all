package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.credit.goods.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-30 17:12:40
 */
public class AlipayTradeCreditGoodsConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 1859153588259492611L;

	/** 
	 * 信用服务订单号。
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/** 
	 * 代表信用支付确认收货的时间。
	 */
	@ApiField("credit_confirm_receive_goods_time")
	private Date creditConfirmReceiveGoodsTime;

	/** 
	 * 确认收货后，计划首次发起履约扣款的时间
	 */
	@ApiField("credit_task_first_exec_time")
	private Date creditTaskFirstExecTime;

	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}
	public String getCreditBizOrderId( ) {
		return this.creditBizOrderId;
	}

	public void setCreditConfirmReceiveGoodsTime(Date creditConfirmReceiveGoodsTime) {
		this.creditConfirmReceiveGoodsTime = creditConfirmReceiveGoodsTime;
	}
	public Date getCreditConfirmReceiveGoodsTime( ) {
		return this.creditConfirmReceiveGoodsTime;
	}

	public void setCreditTaskFirstExecTime(Date creditTaskFirstExecTime) {
		this.creditTaskFirstExecTime = creditTaskFirstExecTime;
	}
	public Date getCreditTaskFirstExecTime( ) {
		return this.creditTaskFirstExecTime;
	}

}
