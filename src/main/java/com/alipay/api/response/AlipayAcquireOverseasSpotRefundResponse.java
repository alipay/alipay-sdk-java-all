package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.acquire.overseas.spot.refund response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayAcquireOverseasSpotRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7465854467969585574L;

	/** 
	 * On the partner’s payment request, the alipay system creates a transaction id to handle it.
The alipay_trans_id has one-one association with partner + partner_trans_id.
	 */
	@ApiField("alipay_trans_id")
	private String alipayTransId;

	/** 
	 * refund currency
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * To describe the reason of the result_code when it is failed/unknown, leave it blank when result_code is success.
	 */
	@ApiField("error")
	private String error;

	/** 
	 * It indicates that a request is accepted by Alipay gateway.
T for accepted
	 */
	@ApiField("is_success")
	private String isSuccess;

	/** 
	 * The refund order id on partner system.

partner_refund_id together with partner identify a refund transaction
	 */
	@ApiField("partner_refund_id")
	private String partnerRefundId;

	/** 
	 * Equal to the partner_trans_id given in the request
	 */
	@ApiField("partner_trans_id")
	private String partnerTransId;

	/** 
	 * Less than or equal to the original transaction amont and the left transaction amount if ever refunded.
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * To describe the response status of a request:
SUCCESS, FAILED, UNKNOW.
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setAlipayTransId(String alipayTransId) {
		this.alipayTransId = alipayTransId;
	}
	public String getAlipayTransId( ) {
		return this.alipayTransId;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setError(String error) {
		this.error = error;
	}
	public String getError( ) {
		return this.error;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setPartnerRefundId(String partnerRefundId) {
		this.partnerRefundId = partnerRefundId;
	}
	public String getPartnerRefundId( ) {
		return this.partnerRefundId;
	}

	public void setPartnerTransId(String partnerTransId) {
		this.partnerTransId = partnerTransId;
	}
	public String getPartnerTransId( ) {
		return this.partnerTransId;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
