package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.inquiryinfochange.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 15:37:26
 */
public class AlipayCommerceMedicalIndustrydataInquiryinfochangeUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4539516338884988818L;

	/** 
	 * 支付宝问诊订单状态 待支付:WAIT_PAY 已取消:CANCELED 待接诊:WAIT_INQUIRY 退款中:REFUNDING 已退款:REFUNDED 问诊中:IN_INQUIRY 退款申请中:REFUND_APPLYING 已完成:FINISHED 用户申诉退款:USER_APPEAL_CANCELED
	 */
	@ApiField("order_status")
	private String orderStatus;

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
