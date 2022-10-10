package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotbpaas.lavidabillsum.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-16 11:44:40
 */
public class AlipayOpenIotbpaasLavidabillsumQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8219618911311299279L;

	/** 
	 * 总商家优惠金额
	 */
	@ApiField("mercht_disc_amt")
	private String merchtDiscAmt;

	/** 
	 * 总订单金额
	 */
	@ApiField("order_amt")
	private String orderAmt;

	/** 
	 * 总交易收款金额
	 */
	@ApiField("recv_amt")
	private String recvAmt;

	/** 
	 * 总交易收款笔数
	 */
	@ApiField("recv_cnt")
	private Long recvCnt;

	/** 
	 * 总交易退款金额
	 */
	@ApiField("refund_amt")
	private String refundAmt;

	/** 
	 * 总交易退款笔数
	 */
	@ApiField("refund_cnt")
	private Long refundCnt;

	public void setMerchtDiscAmt(String merchtDiscAmt) {
		this.merchtDiscAmt = merchtDiscAmt;
	}
	public String getMerchtDiscAmt( ) {
		return this.merchtDiscAmt;
	}

	public void setOrderAmt(String orderAmt) {
		this.orderAmt = orderAmt;
	}
	public String getOrderAmt( ) {
		return this.orderAmt;
	}

	public void setRecvAmt(String recvAmt) {
		this.recvAmt = recvAmt;
	}
	public String getRecvAmt( ) {
		return this.recvAmt;
	}

	public void setRecvCnt(Long recvCnt) {
		this.recvCnt = recvCnt;
	}
	public Long getRecvCnt( ) {
		return this.recvCnt;
	}

	public void setRefundAmt(String refundAmt) {
		this.refundAmt = refundAmt;
	}
	public String getRefundAmt( ) {
		return this.refundAmt;
	}

	public void setRefundCnt(Long refundCnt) {
		this.refundCnt = refundCnt;
	}
	public Long getRefundCnt( ) {
		return this.refundCnt;
	}

}
