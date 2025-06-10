package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-25 19:37:28
 */
public class AlipayCommerceTransportChargerRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2654998417871479152L;

	/** 
	 * 退款金额。单位为元，精确到小数点后两位
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 行业退款业务流水号
	 */
	@ApiField("refund_id")
	private String refundId;

	/** 
	 * 退款状态。REFUND_SUCCESS（退款成功）、REFUNDING（退款中）、REFUND_FAIL（退款失败）
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/** 
	 * 退款时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("refund_time")
	private Date refundTime;

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}
	public String getRefundId( ) {
		return this.refundId;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}
	public Date getRefundTime( ) {
		return this.refundTime;
	}

}
