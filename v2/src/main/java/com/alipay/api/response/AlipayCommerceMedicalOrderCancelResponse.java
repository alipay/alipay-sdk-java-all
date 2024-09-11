package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.order.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-03 20:02:08
 */
public class AlipayCommerceMedicalOrderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 7543317579232421492L;

	/** 
	 * 取消结果
	 */
	@ApiField("data")
	private Boolean data;

	/** 
	 * 退款结果描述
	 */
	@ApiField("refund_msg")
	private String refundMsg;

	/** 
	 * 退款单号
	 */
	@ApiField("refund_no")
	private String refundNo;

	/** 
	 * 退款状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

	public void setRefundMsg(String refundMsg) {
		this.refundMsg = refundMsg;
	}
	public String getRefundMsg( ) {
		return this.refundMsg;
	}

	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}
	public String getRefundNo( ) {
		return this.refundNo;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

}
