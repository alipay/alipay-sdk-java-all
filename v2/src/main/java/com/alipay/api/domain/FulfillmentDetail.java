package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约详情列表
 *
 * @author auto create
 * @since 1.0, 2024-03-14 14:56:54
 */
public class FulfillmentDetail extends AlipayObject {

	private static final long serialVersionUID = 4268366947726411674L;

	/**
	 * 履约金额
	 */
	@ApiField("fulfillment_amount")
	private String fulfillmentAmount;

	/**
	 * 履约支付时间
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
