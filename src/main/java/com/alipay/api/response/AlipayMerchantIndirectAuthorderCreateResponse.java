package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.authorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 19:36:36
 */
public class AlipayMerchantIndirectAuthorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3795462441847984397L;

	/** 
	 * 申请单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 意愿申请单状态，枚举值：审核中(AUDITING)、待联系人确认（CONTACT_CONFIRM），待法人确认（LEGAL_CONFIRM）、审核通过(AUDIT_PASS)、审核失败(AUDIT_REJECT)、已冻结(AUDIT_FREEZE)、已撤回(CANCELED)
	 */
	@ApiField("order_status")
	private String orderStatus;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
