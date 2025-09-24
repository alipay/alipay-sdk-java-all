package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.alloc.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-07 17:10:49
 */
public class AlipayFundAllocTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 7264134561438384695L;

	/** 
	 * 分佣时间
	 */
	@ApiField("alloc_time")
	private Date allocTime;

	/** 
	 * 分佣金额
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 支付宝分佣单据ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 单据状态
	 */
	@ApiField("status")
	private String status;

	public void setAllocTime(Date allocTime) {
		this.allocTime = allocTime;
	}
	public Date getAllocTime( ) {
		return this.allocTime;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
