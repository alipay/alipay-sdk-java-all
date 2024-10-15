package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业履约详情列表
 *
 * @author auto create
 * @since 1.0, 2024-09-26 18:30:35
 */
public class IndustryFulfillmentDetail extends AlipayObject {

	private static final long serialVersionUID = 7429488827778712267L;

	/**
	 * 履约金额
	 */
	@ApiField("fulfillment_amount")
	private String fulfillmentAmount;

	/**
	 * 商户发起履约请求时，传入的out_request_no，标识一次请求的唯一id
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/**
	 * 商户发起履约请求时，传入的out_request_no，标识一次请求的唯一id
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getFulfillmentAmount() {
		return this.fulfillmentAmount;
	}
	public void setFulfillmentAmount(String fulfillmentAmount) {
		this.fulfillmentAmount = fulfillmentAmount;
	}

	public Date getGmtPayment() {
		return this.gmtPayment;
	}
	public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
