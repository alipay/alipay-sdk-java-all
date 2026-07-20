package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MultiCurrencyMoneyDTO;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.payments.refund response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-25 11:12:57
 */
public class AlipayVoyagerPaymentsRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 4751673914119375255L;

	/** 
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private MultiCurrencyMoneyDTO refundAmount;

	/** 
	 * 退款订单号
	 */
	@ApiField("refund_order_id")
	private String refundOrderId;

	/** 
	 * 退款时间
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/** 
	 * 结果信息
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	public void setRefundAmount(MultiCurrencyMoneyDTO refundAmount) {
		this.refundAmount = refundAmount;
	}
	public MultiCurrencyMoneyDTO getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundOrderId(String refundOrderId) {
		this.refundOrderId = refundOrderId;
	}
	public String getRefundOrderId( ) {
		return this.refundOrderId;
	}

	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}
	public Date getRefundTime( ) {
		return this.refundTime;
	}

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

}
