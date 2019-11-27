package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.acquire.overseas.spot.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayAcquireOverseasSpotCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8356889215121429581L;

	/** 
	 * The time of the transaction has been paid.
Format：YYYYMMDDHHMMSS

Leave it blank when result_code is failed/unknown.
	 */
	@ApiField("alipay_cancel_time")
	private String alipayCancelTime;

	/** 
	 * On the partner’s payment request, the alipay system creates a transaction id to handle it.
The alipay_trans_id has one-one association with partner + partner_trans_id.
	 */
	@ApiField("alipay_trans_id")
	private String alipayTransId;

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
	 * Equal to the partner_trans_id given in the request
	 */
	@ApiField("partner_trans_id")
	private String partnerTransId;

	/** 
	 * To describe the response status of a request:
SUCCESS, FAILED, UNKNOW.
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setAlipayCancelTime(String alipayCancelTime) {
		this.alipayCancelTime = alipayCancelTime;
	}
	public String getAlipayCancelTime( ) {
		return this.alipayCancelTime;
	}

	public void setAlipayTransId(String alipayTransId) {
		this.alipayTransId = alipayTransId;
	}
	public String getAlipayTransId( ) {
		return this.alipayTransId;
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

	public void setPartnerTransId(String partnerTransId) {
		this.partnerTransId = partnerTransId;
	}
	public String getPartnerTransId( ) {
		return this.partnerTransId;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
