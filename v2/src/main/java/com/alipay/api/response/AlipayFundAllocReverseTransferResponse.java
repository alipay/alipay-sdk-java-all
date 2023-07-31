package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.alloc.reverse.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:51:49
 */
public class AlipayFundAllocReverseTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 7267965851755488461L;

	/** 
	 * 退款金额
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 退分佣单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 退款时间
	 */
	@ApiField("reverse_time")
	private Date reverseTime;

	/** 
	 * FINISHED-退款成功
	 */
	@ApiField("status")
	private String status;

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

	public void setReverseTime(Date reverseTime) {
		this.reverseTime = reverseTime;
	}
	public Date getReverseTime( ) {
		return this.reverseTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
